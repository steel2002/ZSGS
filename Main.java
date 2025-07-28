
//  Wrapper class 

public class Main {
    public static void main(String[] args) {
        int num =10;
        float f =20.5f;

        Integer intObj2 = num; // Autoboxing
        
        Integer intObj= Integer.valueOf(num); // Using valueOf method // Boxing 

          int i = intObj.intValue(); // Unboxing

        System.out.println("Unboxing value " +i);
        
        Float floatObj =f;        // Autoboxing
        Float floatObj2 =Float.valueOf(f);       // Boxing
        
        float f1 =floatObj.floatValue(); // Unboxing
        System.out.println("Unboxing value " +f1);
        
        System.out.println("Integer Object : " +intObj);
        System.out.println("Float Object : " +floatObj);

        System.out.println("---------Parse Method---------");

        String str ="100";

        int parsedInt = Integer.parseInt(str); // Parsing String to int conversion

        System.out.println("Parsed Integer: " + parsedInt);
    }
    
}


// Recursion Example

class Fact {
     static int factorial(int n) {
        if (n == 0) {
            return 1;       
        } else {
            return n * factorial(n - 1); 
        } 
}

public static void main(String[] args) {
    int number =5;
    factorial(number);
    System.out.println(" is: " + factorial(number));
  }
}
