import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OperationsMethods {
    
    public static double sum(double numberA, double numberB) {
        double soma = numberA + numberB;
        return soma;
    }

    public static double sub(double numberA, double numberB){
        double subtraction = numberA - numberB;
        return subtraction;
    }

    public static double times(double numberA, double numberB){
        double times = numberA * numberB;
        return times;
    }

    public static double division(float numberA, float numberB){
        float division = numberA / numberB;
        return division;
    }

    public static double power(double numberA, double numberB){
        double power = Math.pow(numberA, numberB);
        return power;
    }

    public static double customLog(double base, double numberA){
        double log = Math.log(numberA) / Math.log(base); 
        return log;
    }

    public static double naturalLogarithms(double numberA){
        double A = (Math.log(numberA));
        return A;
    }
    
    public static double squareroot(double numberA){
        double A = (Math.sqrt(numberA));
        return A;
    }

    public static double nthroot(double numberA, double numberB){
        double A = Math.pow(numberA, 1.0 / numberB);
        return A;
    }

    public static double average(int numberElements, double[] insertedNumbers){
        double sum = 0;
    
        for (double valor : insertedNumbers){
            sum += valor;
        }
            double average = sum / numberElements;
            return average;
    }

    public static double variance(int numberA, double[] arrayA){

        double sum = 0;
        for (int i = 0 ; i < numberA ; i++){
           sum += Math.pow((arrayA[i] - average( numberA, arrayA )),2);
            }
        return sum / (numberA - 1);
    }

    public static double coVariance(int numberA, double[] arrayA, double[] arrayB){

        double sumy = 0;
        double sumx = 0;
        double sumz = 0;
            
        for (int i = 0 ; i < numberA ; i++){
                sumx = arrayA[i] - average( numberA, arrayA );
                sumy = arrayB[i] - average( numberA, arrayB );
                sumz += sumx * sumy;
            }
        return sumz / (numberA - 1);
    }

    public static double standardDeviation(int numberA, double[] arrayA){

        double numberB = (Math.sqrt(variance(numberA, arrayA)));
        return numberB;
    }

    public static double sin(double numberA){
        double radians = Math.toRadians(numberA);
        double A = (Math.sin(radians));
        return A;
    }

    public static double cos(double numberA){
        double radians = Math.toRadians(numberA);
        double A = (Math.cos(radians));
        return A;
    }

    public static double tan(double numberA){
        double radians = Math.toRadians(numberA);
        double A = (Math.tan(radians));
        return A;
    }

    public static double toRadians(double numberA){
        double radians = Math.toRadians(numberA);
        double A = (Math.toRadians(radians));
        return A;
    }

    public static double toDegrees(double numberA){
        double A = 1 / Math.toDegrees(numberA);
        return A;
    }

    public static double coTangent(double numberA){
        double radians = Math.toRadians(numberA);
        double A = 1 / Math.tan(radians);
        return A;
    }

    public static double secant(double numberA){
        double radians = Math.toRadians(numberA);
        double A = 1 / Math.cos(radians);
        return A;
    }

    public static double coSecant(double numberA){
        double radians = Math.toRadians(numberA);
        double A = 1 / Math.sin(radians);
        return A;
    }

    public static double sinH(double numberA){
        double radians = Math.toRadians(numberA);
        double A = Math.sinh(radians);
        return A;
    }

    public static double fahrenheit(double numberA){
        double T = numberA * 9/5 + 32;
        return T;
    }

    public static double celsius(double numberA){
        double T = (numberA - 32) / (9/5);
        return T;
    }
  
    public static int prime(int numberA){
        int prime = numberA;
		boolean isPrime = true;
		int divisor = 0;
		for (int i = 2; i <= prime; i++) {
			if ( ( (prime % i) == 0) && (i != prime) ) {
				isPrime = false;
				divisor = i;
				break;
			}
		}
		if (isPrime) {
            return numberA;
		} else {
			return divisor;
		}
    }

    public static void executeOperations(int option) {

        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try (FileWriter f = new FileWriter("CalculatorResults.txt", true);
        BufferedWriter b = new BufferedWriter(f);
        PrintWriter p = new PrintWriter(b);) {

        Scanner readValue = new Scanner(System.in);
        
        switch(option) {
            case 1:
                System.out.println("Insert your first number: ");
                double var1 = Double.valueOf(readValue.nextDouble());
        
                System.out.println("Insert your second number: ");
                double var2 = Double.valueOf(readValue.nextDouble());

                System.out.println("The sum between " + var1  + " and " + var2 + " is equal to: " + sum(var1, var2));
                p.println("The sum between " + var1  + " and " + var2 + " is equal to: " + sum(var1, var2));
                break;
            case 2:
                System.out.println("Insert your first number: ");
                double var3 = Double.valueOf(readValue.nextDouble());
    
                System.out.println("Insert your second number: ");
                double var4 = Double.valueOf(readValue.nextDouble());
                System.out.println("The subtraction between " + var3  + " and " + var4 + " is equal to: " + sub( var3 , var4 ));
                p.println("The subtraction between " + var3  + " and " + var4 + " is equal to: " + sub( var3 , var4 ));
                break;
            case 3:
                System.out.println("Insert your first number: ");
                double var5 = Double.valueOf(readValue.nextDouble());
    
                System.out.println("Insert your second number: ");
                double var6 = Double.valueOf(readValue.nextDouble());
                System.out.println("The multiplication between " + var5  + " and " + var6 + " is equal to: " + times( var5 , var6 ));
                p.println("The multiplication between " + var5  + " and " + var6 + " is equal to: " + times( var5 , var6 ));
                break;
            case 4:
                System.out.println("Insert your first number: ");
                float var7 = Float.valueOf(readValue.nextFloat());
        
                System.out.println("Insert your second number: ");
                float var8 = Float.valueOf(readValue.nextFloat());
                System.out.println("The division between " + var7  + " and " + var8 + " is equal to: " + division( var7 , var8 ));
                p.println("The division between " + var7  + " and " + var8 + " is equal to: " + division( var7 , var8 ));
                break;
            case 5:
                System.out.println("Insert your first number: ");
                double var9 = Double.valueOf(readValue.nextDouble());
    
                System.out.println("Insert your second number: ");
                double var10 = Double.valueOf(readValue.nextDouble());
                System.out.println(var9 + " to the power of " + var10 + " is equal to: " + power( var9, var10 ));
                p.println(var9 + " to the power of " + var10 + " is equal to: " + power( var9, var10 ));
                break;
            case 6:
                System.out.println("Insert your first number: ");
                double var11 = Double.valueOf(readValue.nextDouble());
    
                System.out.println("Insert your second number: ");
                double var12 = Double.valueOf(readValue.nextDouble());
                System.out.println("The Logarithm base " + var11 + " of " + var12 + " is equal to: " + customLog( var11 , var12 ));
                p.println("The Logarithm base " + var11 + " of " + var12 + " is equal to: " + customLog( var11 , var12 ));
                break;
            case 7:
                System.out.println("Insert your first number: ");
                double var13 = Double.valueOf(readValue.nextDouble());

                System.out.println("The natural logarithm of " + var13 + " is equal to: " + naturalLogarithms( var13 ));
                p.println("The natural logarithm of " + var13 + " is equal to: " + naturalLogarithms( var13 ));
                break;
            case 8:
                System.out.println("Insert your first number: ");
                double var14 = Double.valueOf(readValue.nextDouble());

                System.out.println("The square root of " + var14 + " is equal to: " + squareroot( var14 ));
                p.println("The square root of " + var14 + " is equal to: " + squareroot( var14 ));
                break;
            case 9:
                System.out.println("Insert your first number: ");
                double var26 = Double.valueOf(readValue.nextDouble());

                System.out.println("Insert your n root: ");
                double var27 = Double.valueOf(readValue.nextDouble());

                System.out.println("The square root of " + var26 + " is equal to: " + nthroot( var26, var27 ));
                p.println("The " + var27 + "th root of " + var26 + " is equal to: " + nthroot( var26, var27 ));
                break;
            case 10:
                System.out.println("Insert the length of your sample: ");
                int var28 = Integer.valueOf(readValue.nextInt());

                double[] var29 = new double[var28];
                System.out.println("Insert the numbers: ");
                for(int i = 0 ; i < var28; i++){
                    var29[i]= readValue.nextDouble();  
                }
                System.out.println("The length of your sample is equal to: " + var28);
                System.out.println("Your sample is : " + Arrays.toString(var29));
                System.out.println("The average of your sample is equal to " + average( var28, var29 ));
                p.println("The length of your sample is equal to: " + var28);
                p.println("Your sample is : " + Arrays.toString(var29));
                p.println("The average of your sample is equal to: " + average( var28, var29 ));
                break;
            case 11:
                System.out.println("Insert the length of your sample: ");
                int var30 = Integer.valueOf(readValue.nextInt());

                double[] var31 = new double[var30];
                System.out.println("Insert the numbers: ");
                for(int i = 0 ; i < var30; i++){
                    var31[i]= readValue.nextDouble();  
                }
                System.out.println("The length of your sample is equal to: " + var30);
                System.out.println("Your sample is : " + Arrays.toString(var31));
                System.out.println("The variance of your sample is equal to " + variance( var30, var31 ));
                p.println("The length of your sample is equal to: " + var30);
                p.println("Your sample is : " + Arrays.toString(var31));
                p.println("The variance of your sample is equal to: " + variance( var30, var31 ));
                break;
            case 12:
                System.out.println("Insert the length of your samples: ");
                int var34 = Integer.valueOf(readValue.nextInt());

                double[] var35 = new double[var34];
                System.out.println("Insert the numbers of your first sample: ");
                for(int i = 0 ; i < var34; i++){
                    var35[i]= readValue.nextDouble();  
                }

                double[] var36 = new double[var34];
                System.out.println("Insert the numbers of your second sample: ");
                for(int j = 0 ; j < var34; j++){
                    var36[j]= readValue.nextDouble();  
                }

                System.out.println("The length of your samples is equal to: " + var34);
                System.out.println("Your first sample is : " + Arrays.toString(var35));
                System.out.println("Your second sample is : " + Arrays.toString(var36));
                System.out.println("The covariance of your sample is equal to " + coVariance( var34, var35, var36 ));
                p.println("The length of your samples is equal to: " + var34);
                p.println("Your first sample is : " + Arrays.toString(var35));
                p.println("Your second sample is : " + Arrays.toString(var36));
                p.println("The covariance of your sample is equal to: " + coVariance( var34, var35, var36 ));
                break;
            case 13:
                System.out.println("Insert the length of your sample: ");
                int var32 = Integer.valueOf(readValue.nextInt());

                double[] var33 = new double[var32];
                System.out.println("Insert the numbers: ");
                for(int i = 0 ; i < var32; i++){
                    var33[i]= readValue.nextDouble();  
                }
                System.out.println("The length of your sample is equal to: " + var32);
                System.out.println("Your sample is : " + Arrays.toString(var33));
                System.out.println("The standard deviation of your sample is equal to " + standardDeviation( var32, var33 ));
                p.println("The length of your sample is equal to: " + var32);
                p.println("Your sample is : " + Arrays.toString(var33));
                p.println("The standard deviation of your sample is equal to: " + standardDeviation( var32, var33 ));
                break;
            case 14:
                System.out.println("Insert your angle in degrees: ");
                double var15 = Double.valueOf(readValue.nextDouble());

                System.out.println("The sine of " + var15 + " is equal to: " + sin( var15 ));
                p.println("The sine of " + var15 + " is equal to: " + sin( var15 ));
                break;
            case 15:
                System.out.println("Insert your angle in degrees: ");
                double var16 = Double.valueOf(readValue.nextDouble());

                System.out.println("The cosine of " + var16 + " is equal to: " + cos( var16 ));
                p.println("The cosine of " + var16 + " is equal to: " + cos( var16 ));
                break;
            case 16:
                System.out.println("Insert your angle in degrees: ");
                double var17 = Double.valueOf(readValue.nextDouble());

                System.out.println("The tangent of " + var17 + " is equal to: " + tan( var17 ));
                p.println("The tangent of " + var17 + " is equal to: " + tan( var17 ));
                break;
            case 17:
                System.out.println("Insert your angle in degrees: ");
                double var18 = Double.valueOf(readValue.nextDouble());

                System.out.println("Your " + var18 + " Radians are equal to: " + toDegrees( var18 ) + " degrees.");
                p.print("Your " + var18 + " Radians are equal to: " + toDegrees( var18 ) + " degrees.");
                break;
            case 18:
                System.out.println("Insert your angle in degrees: ");
                double var19 = Double.valueOf(readValue.nextDouble());

                System.out.println("The cotangent of " + var19 +  " is equal to: " + coTangent( var19 ));
                p.println("The cotangent of " + var19 +  " is equal to: " + coTangent( var19 ));
                break;
            case 19:
                System.out.println("Insert your angle in degrees: ");
                double var20 = Double.valueOf(readValue.nextDouble());

                System.out.println("The secant of " + var20 +  " is equal to: " + secant( var20 ));
                p.println("The secant of " + var20 +  " is equal to: " + secant( var20 ));
                break;
            case 20:
                System.out.println("Insert your angle in degrees: ");
                double var21 = Double.valueOf(readValue.nextDouble());

                System.out.println("The secant of " + var21 +  " is equal to: " + coSecant( var21 ));
                p.println("The secant of " + var21 +  " is equal to: " + coSecant( var21 ));
                break;
            case 21:
                System.out.println("Insert your angle in degrees: ");
                double var22 = Double.valueOf(readValue.nextDouble());

                System.out.println("The hyperbloic sin of " + var22 +  " is equal to: " + sinH( var22 ));
                p.println("The hyperbloic sin of " + var22 +  " is equal to: " + sinH( var22 ));
                break;
            case 22:
                System.out.println("Insert your temperature in Celsius: ");
                double var23 = Double.valueOf(readValue.nextDouble());

                System.out.println("Your temperature in Fahrenheit is equal to: " + fahrenheit( var23 ) + " ºF.");
                p.println("Your temperature in Fahrenheit is equal to: " + fahrenheit( var23 ) + " ºF.");
                break;
            case 23:
                System.out.println("Insert your temperature in Fahrenheit: ");
                double var24 = Double.valueOf(readValue.nextDouble());

                System.out.println("Your temperature in Celsius is equal to: " + celsius( var24 ) + " ºC.");
                p.println("Your temperature in Celsius is equal to: " + celsius( var24 ) + " ºC.");
                break;
            case 24:
                System.out.println("Insert your number: ");
                int var25 = Integer.valueOf(readValue.nextInt());

                if ( OperationsMethods.prime( var25 ) == var25){
                System.out.println("Yeah, the number " + prime( var25 ) + " is a prime!");
                p.println("Yeah, the number " + prime( var25 ) + " is a prime!");
                }                
                else if ( OperationsMethods.prime( var25 ) != var25){
                System.out.println("Sorry, the number " + var25 + " is not a prime. Try again!"); 
                p.println("Sorry, the number " + var25 + " is not a prime. Try again!");   
                }
                break;
        }
        System.out.println("Your data were successfully appended into file. Please check CalculatorResults.txt to see the result!");  
    } catch (IOException i) {
      i.printStackTrace();
      }       
  }   
}
