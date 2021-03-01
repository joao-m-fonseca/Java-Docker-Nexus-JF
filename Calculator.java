import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args){ 
    
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        
        do {
            showMenu();

            option = scanner.nextInt();

            validateOption(option);
            
            OperationsMethods.executeOperations(option);
            
        } while ( option != 0);
            System.out.print("Goodbye, see you next time!");
     scanner.close();
    }

    public static void showMenu(){
        System.out.println("----------Options----------");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Times");
        System.out.println("4 - Division");
        System.out.println("5 - Power");
        System.out.println("6 - Logarithm");
        System.out.println("7 - Natural Logarithm");
        System.out.println("8 - Square Root");
        System.out.println("9 - Nth Root");
        System.out.println("10 - Average");
        System.out.println("11 - Variance");
        System.out.println("12 - Covariance");
        System.out.println("13 - Standard Deviation");
        System.out.println("14 - Sine");
        System.out.println("15 - Cosine");
        System.out.println("16 - Tangent");
        System.out.println("17 - Radians to Degrees");
        System.out.println("18 - Cotangent");
        System.out.println("19 - Secant");
        System.out.println("20 - Cosecant");
        System.out.println("21 - Hyperbolic sin");
        System.out.println("22 - Celsius to Fahrenheit");
        System.out.println("23 - Fahrenheit to Celsius");
        System.out.println("24 - Verify prime number");
        System.out.println("0 - Exit");
        System.out.println("Select an option: ");
    }

    public static void validateOption(int option) {

        if( option < 0 || option > 24 ) {
            System.out.println("Invalid option. Please select another option.");
        }
    }
}