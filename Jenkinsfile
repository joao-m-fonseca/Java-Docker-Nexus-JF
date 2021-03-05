pipeline {
    agent {
        label "mvn"
    }
    parameters { 
        string(name: 'DOCKER_IMAGE_NAME', defaultValue: 'calculatorapp', description: 'Adicionar um nome a imagem docker')
        string(name: 'DOCKER_IMAGE_TAG', defaultValue: 'v1.0', description: 'Adicionar uma Tag')
        string(name: 'DOCKER_CONTAINER_NAME', defaultValue: 'calculatorapp', description: 'Adicionar um nome do container')
        string(name: 'BUILD_NUMBER', defaultValue: 'v1.0', description: 'Adicionar um build number')
    //    string(name: 'DOCKER_CONTAINER_PORT', defaultValue: '8085', description: 'Adicionar o Port do container')
    }
    stages {
        stage ('Build Jar') {
            steps {
                sh 'javac *.java '
                sh 'jar cfe Calculator.jar Calc *.class'
             }
        }
        stage("SonarQube analysis") {
            steps {
        script {
            sonarScanner('category-service')
               }
            }
        }
        stage ('Build Docker Image') {
            steps {
                sh 'docker build -t "${DOCKER_IMAGE_NAME}" .'
                }
            }
        stage ('Push Docker Image') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'DOCKERPASS', usernameVariable: 'DOCKERUSER')]) {
                sh ' docker login -u $DOCKERUSER -p $DOCKERPASS localhost:8082'
                sh ' docker tag ${DOCKER_IMAGE_NAME} localhost:8082/${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG} '
                sh 'docker push localhost:8082/${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG} '
               // sh 'docker run -d -p ${DOCKER_CONTAINER_PORT}:8085  --name "${DOCKER_CONTAINER_NAME}" "${DOCKER_IMAGE_NAME}"'
                }
            }
        }
        stage("Publish to Nexus Repository Manager") {
            steps {
                withCredentials([usernamePassword(credentialsId: 'nexus-user-credentials', passwordVariable: 'NEXUSPASS', usernameVariable: 'NEXUSUSER')])  {
                sh ' curl -v -u "$NEXUSUSER:$NEXUSPASS" --upload-file Calculator.jar http://nexus:8081/repository/raw-nexus/'
                }
            }
        }
        stage ('CleanResources') {
            steps
            {
                cleanWs()
            }
        }
    }
}

def sonarScanner(projectKey) {
        def scannerHome = tool 'sonar-scanner'
          withSonarQubeEnv("SonarQube") {
              if(fileExists("sonar-project.properties")) {
                  sh "${scannerHome}/bin/sonar-scanner"
        }
              else {
                  sh "${scannerHome}/bin/sonar-scanner -Dsonar.host.url=http://sonarqube:9000 -Dsonar.login=d8415d1b6f4cce484496b548398d33354140fc5a -Dsonar.projectKey=java-calculator -Dsonar.java.libraries=**/*.jar -Dsonar.projectVersion=${BUILD_NUMBER}"
        }
    }
   // timeout(time: 10, unit: 'MINUTES') {
     //   waitForQualityGate abortPipeline: true
    //}
}