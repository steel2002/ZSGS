import java.util.InputMismatchException;
import java.util.Scanner;

public class DAY9 {
    public static void main(String[] args) {
        
    }
    
}

//---------------------------------------------------Eaception handling-----------------------------------------------------------------

// 1. int[] arr = {2, 5, 1, 4, 0, 7};
// int quotient = arr[7] / arr[4];
// Develop a Java program which handles any unexpected situations that may arise during execution.

class ExceptionDemo{
    public static void main(String[] args) {
        int [] arr ={2,5,1,4,0,7};

        try {

            int quotient = arr[7]/arr[4];
            System.out.println("Value :" +quotient);
        
        } catch(ArrayIndexOutOfBoundsException e){

            System.err.println("Array index out of Bounds :" +e.getMessage());

        } catch(ArithmeticException e){
            System.err.println("Divide By zero Not Allowed :"+e.getMessage());
        }
         catch (Exception e) {
           System.err.println("An unexpected error occurred " +e.getMessage() );
        }
    }
}
// 2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, 
   // and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.

class multiplecatch {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        try {
             System.out.println("Enter the String value s1");
             String s1 = scan.nextLine();
             System.out.println("Enter the String value s2 ");
             String s2 = scan.nextLine();

             int num =Integer.parseInt(s1);
             int num1 =Integer.parseInt(s2);
                    
             System.out.println("Enter LuckNumber Value :");
             int LuckNum = scan.nextInt();


             int result = num /num1;

             System.out.println("Output Value :" +result);
         }catch(InputMismatchException e){
		     System.err.println("InputMismatchException "+e.getMessage());
	     }
         
         catch(NumberFormatException e){
		System.err.println("NumberFormatException "+e.getMessage());
	}
    catch(ArithmeticException e){
		System.err.println("ArithmeticException "+e.getMessage());
	}
    catch(Exception e){
		System.err.println("Exception "+e.getMessage());
     } finally{

        scan.close();
        System.out.println("Scanner class close :");

     }
     System.out.println("Code executes succesfully");
    }
}

// 3. Write a program to illustrate how to throw a ClassNotFoundException.

class ExceptionDemo1{
    public static void main(String[] args) {
        try {
            Class.forName("Non Excection class ");
            System.out.println(" Class Found At load");
            
        }  catch (ClassNotFoundException e) {
            System.out.println("Error: Class not found."+e.getMessage());
    }
}
}

// 4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.

class ExceptionDemo2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Conver to String VAlue :");

        String s = scan.nextLine();

        try {

            int num =Integer.parseInt(s);
            System.out.println("Conver to String to Number :"+num*10);
            
       }catch(NumberFormatException e){

	      System.err.println(e.getMessage());
        
       }finally{
        scan.close();
        System.out.println("Scanner class Close :");
       }
        
    }

}

// 5. Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. 
  // Show this with output.
class Ensure{
    public static void main(String[] args) {
        int result = Demonstrate();
        System.out.println("Method returned: " + result);
        
    }

  public static int Demonstrate(){

    try {
        System.out.println("Inside try Block ");
        return 10;
        
    } finally{
        System.err.println("Inside Finally Block ");
    }
}
}

// 6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
// --->It must be exactly 4 digits long.
// --->It should contain only numeric characters.
// --->It must not start with 0.
// Display an appropriate message whether the PIN is valid or invalid.
  


// 7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.
// ‌
// 8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.
// ‌
// 9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.
// ‌
// 10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.
