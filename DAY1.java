import java.util.Scanner;
import java.util.*;


public class DAY1 {
	
	static int age;   // State variable
	
	int inst;       // instance variable
	

public static void main (String [] args){
	
	int Local=200;
	int black=10;
		
	DAY1 in1= new DAY1();
		DAY1 in2= new DAY1();
			
			in1.inst=10;     // instance variable
			in2.inst=20;
			
			  DAY1.age=9;                // static variable 
		
	      final  int key =100;    // final variable
	
	System.out.println("Final of Variable" +key);
	System.out.println("black of variable " +black);
	System.out.println("Local of variable" +Local);
	System.out.println("static of variable" +age);
	System.out.println("instance of variable " +in2.inst);
	System.out.println("instance of variable " +in1.inst);
	
}


}

// 2. Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.

class Demo {

public static void main (String [] args) {
	
	int a = 20;
	float b =1.5f;
	double c = 0.8947478d;
	long d =10000;
	char e ='z';
	byte f=12;


System.out.println("Integer" +a);
System.out.println("float number " +b);
System.out.println("double number" +c);
System.out.println("longh number" +d);
System.out.println("char value" +e);
System.out.println("byte number" +f);
	
}

}

// 3. Write a program to find the maximum of two numbers using ternary operator.

class Demo1 {
	
public static void main (String [] args){
	
	
	int a=12;
	int b=40;
	
	String result =(a< b) ? "B is Big " : "  not big";     // Time is also Big
	        

System.out.println(" " +result);
	
}

}

// 4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Demo2 {
public static void main(String args []) {

int com =10000;
int com1=1000;

// String [] sz={"Equal " , "Not Equal "};

int iscomper=(com^com1);
boolean sz []=new boolean[iscomper+1];
sz[iscomper]=true;
// if(sz[0])
// System.out.println("Equal");
// else
// System.out.println("NotEqual");
// System.out.println();


    System.out.println(sz[0] ? " Equal "  : "Not EQual");
}
}

// 5. Write a program that illustrate the execution order of static block and initializer block?


class Demo3 {

	 {
        // This code is executed before every constructor
		
        System.out.println("This is initializer!");
    }
	
	static
	{
		System.out.println("This is static block "); // This is Static variable
	}
	
	
	 {
        // This code is executed before every constructor
		
        System.out.println("This is initializer!");
    }
public static  void main (String []args){
	System.out.println("Main :");
	
	Demo3 obj =new Demo3();
	
	
	
}	
	
}

// 6. Write a program that illustrate the Explicit type casting?


class Demo4{
	
	public static void main (String [] args){
		
		// Winding casting 
		
		int num =10;
		double d = num;
		
		System.out.println("Normal value " +num);
		
		System.out.println(" Winding casting value " +d);
		
		// Narrowing Casting
		
		System.out.println("<------------------>");
		
		
		double dou = 9.0;
		
		int nar = (int) dou;
		
			System.out.println("casting value " +dou);
				System.out.println(" Narrowing casting value " +nar);

				int t =97;

				double d1 = (double) t;

				System.out.println(" " +d1);

				float f =(float) t;

				System.out.println(" " +f);

				char c = (char) t;
				System.out.println("" +c);
		
}
	
}

// 7. Write a program to check if a number is a power of 2?

class Demo5{
	
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		
		int number = scan.nextInt();
		
		boolean value = false;
		
		
		int result = 1;
		int count =0;
		
		while(result<=number){

			result =result *2;
			count++;
			
			
			if(result==number){
					
				
			value=true;
			System.out.println(" " +count);
			
			}
				
		}
	
			if(value){
				
				System.out.println("This Number  Power :");
				
			} else {
				
				System.out.println("This Number not Power  :");
			}
			
			
		}
		
}

// 8. Write a program to find the first set bit of a number?

class FirstSet {
    public static void main(String[] args) {
        System.out.print("Program to find first set of bit of a number");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
		int count = 1;
        int num = scan.nextInt();
        if (num == 0) {
            System.out.println("No set bit is there");
        } else {
            int firstSetBit = num & -num;
            while(firstSetBit>1){
				firstSetBit = firstSetBit / 2;
                count++;
			}
			System.out.println("First set bit position: " + count);
        }
        
    }
}


// 9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee
// (int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?	


class Employee {
	
	int  empId;
	String empName;
	String empdepartment;
	double salary;
	
	public Employee(int empId,String empName,String empdepartment,double salary){
		
		this.empId=empId;
		this.empName=empName;
		this.empdepartment=empName;
		this.salary=salary;
	
	{
		System.out.println("Employee id:" +empId);
		System.out.println("Employee Name:" +empName);
		System.out.println("Employee empdepartment:" +empdepartment);
		System.out.println("Employee  salary :" +salary);

	}
	}
	public static void main(String [] args){
		
		Employee emp = new Employee(1001,"Selvin","Testing",50.00000);
		
	}
}

// 10. Write a program to check whether the object is an instance of a particular class?


class Demo7{
	
	public static void main(String [] args){
		
	
		Demo7 obj = new Demo7();
		
		System.out.println(obj instanceof Demo7);
		
		
		
	}
	
}
