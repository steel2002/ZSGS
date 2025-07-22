import java.util.Scanner;
import java.util.*;


public class ZSGS {
	
	static int age;   // State variable
	
	int inst;       // instance variable
	

public static void main (String [] args){
	
	int Local=200;
	int black=10;
		
	ZSGS in1= new ZSGS();
		ZSGS in2= new ZSGS();
			
			in1.inst=10;     // instance variable
			in2.inst=20;
			
			  ZSGS.age=9;                // static variable 
		
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
	
	
	int time =12;
	int time1=40;
	
	String result =(time > time1) ? "Time is big" : " Time not big";     // Time is also Big
	        

System.out.println("ternary operator " +result);
	
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
	
	static
	{
		System.out.println("This is static block "); // This is Static variable
	}
	
	
	 {
        // This code is executed before every constructor
		
        System.out.println("This is initializer!");
    }
public static  void main (String []args){
	
	Demo3 obj =new Demo3();
	
	Demo3 obj1 =new Demo3();
	
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
		
		System.out.println("===================================");
		
		
		double dou = 9.0;
		
		int nar = (int) dou;
		
			System.out.println("casting value " +dou);
				System.out.println(" Narrowing casting value " +nar);
		
}
	
}

// 7. Write a program to check if a number is a power of 2?

class Demo5{
	
	public static void main (String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		
		int number = scan.nextInt();
		
		boolean value = false;
		
		
		long temp =2l;
		
		while(temp<=number){
			
			if(temp==number){
				
			value=true;
			
			}
				temp *=2;
		}
			if(value){
				
				System.out.println("This Number of Power :");
				
			} else {
				
				System.out.println("This Number not Power  :");
			}
			
			
		}
		
}

// 8. Write a program to find the first set bit of a number?

class Demo6  {
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int a=scan.nextInt();
		
		int b=a&-a;
		
		System.out.println("First bit number  :" +b);
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

// *Day-2 Assignment Questions: Part-1*

// 1. Write a program that uses if statement to find the minimum of three numbers.

class Demo8 {
	
public static void main(String [] args){
	
	int a=10,b=20,c=5;
	
	if( a < b && a<c){
		
			System.out.println("A is minimum Number  :" +a);
		
	} if(b< a && b<c){
		
			System.out.println("B is minimum Number  :" +b);
		
	} else {
		
			System.out.println("C is minimum Number  :" +c);
	}
	
}

}

// 2. Write a program to do the following patterns using for loop?


// 3. Write a program to do the following patterns using while loop?

class DimentPattern {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int n = scanner.nextInt();
      for (int i = 0; i < n; i++) 
      {
          for (int j = 0; j < n; j++)
          {
             if(j<(n-i-1))
             {
              System.out.print("  ");
             }
             else
             {
              System.out.print(i-1 + " ");
             }    
          }
          System.out.println("");     
      }     
		
		
    }
}


// 5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.


class EvenNumber {
	
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the N Value :");
	    int n =scan.nextInt();
		  int sum =0;
		  
		for(int i=0;i<n;i++){
			
			if(i%2==0){
				continue;
	}
			sum +=i;
		}
		System.out.println("Sum of value " +sum);
	}
}

// 6. Define a method to convert the decimal number to a binary number?
 class BinaryConverter {
 public static void binary(int n){
	 
	 String str="";
	 
	 while(n >0){
		 
		 str = (n%2) +str;
		 n=n/2;
		 
		 
	 }
	
	System.out.println("Number of Binary Number " +str);
	
	
}

public static void main(String [] args){
	
	  Scanner scan = new Scanner(System.in);
        System.out.println("Enter a  number: ");
        int n = scan.nextInt();
        binary(n);
	
}
 }
 
 // 7. Use both if and switch case statement  as two ways to find the grade of a student.
 
class Student {
	 public static void main (String [] args) {
		 
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Enter the N value :");
		 
		 double n = scan.nextDouble();
		 
		 int grade =(int) n / 10;
		 
		 switch (grade){
			 case 10:
			 case 9:
			 case 8:
			 
			 if( n >=85 && n <=100){
				 
				 System.out.println(" This is grade A");
		} else {
			
			 System.out.println("This is  Grade B");
			
		}
		break;
		case 7:
		case 6:
		     
			 if(n >=70){
				 
				  System.out.println(" This is Grade B");
			} else {
				
				 System.out.println(" This is Grade C");
			}
			 break;
			 
			 case 5:
			 
			  System.out.println("This is Grade C");
			 
			 break;
			 
			default:
                System.out.println("Fail");
		 }
		 
		 
	 }
	 
	 
 }

class Grade {
    public static void main(String[] args) {
        double percent = 75.5; 
        
        if (percent >= 85 && percent <= 100) {
            System.out.println("Grade 'A'");
        } else if (percent >= 70) {
            System.out.println("Grade 'B'");
        } else if (percent >= 50) {
            System.out.println("Grade 'C'");
        } else {
            System.out.println("Fail");
        }
    }
}


// *Day-2 Assignment Questions: Part-2 Arrays*


// 1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers


class oddNumbers {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        System.out.println("Odd Numbers:");
        for (int c : arr) {
            if (c % 2 != 0) {
                System.out.println(c);
                sum += c;
            }
        }

        System.out.println("Sum of odd numbers: " + sum);
    }
}

// 2. Write a program to take in 10 values and print only those numbers which are prime.

class PrimeNumbers {
    public static void main(String[] args) {

        int[] arr = {4, 5, 7, 10, 11, 12, 13, 15, 17, 20};

        System.out.println("Prime numbers are:");

        for (int num : arr) {
            if (num > 1) {
                boolean isPrime = true;
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(num);
                }
            }
        }
    }
}

// 3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

class Fibonacci {

	public static void main(String[] args) {
		int arr [] = new int[30];
		arr[0]=0;
		arr[1]=1;

		for(int i=2;i<arr.length;i++){
			arr[i]=arr[i-1] +arr[i-2];
		}
		int j=0;
		while (j<arr.length) {
			System.out.print( " " +arr[j]);
			j++;
			
		}
	}
}

// 4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) 
// as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() 
// function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).

class Arrays {

	public static void sumof(int[] arr,int n){

		int singleNumber=0,doubleNumber=0;

		for(int i=0;i<arr.length;i++){

			if(arr[i] >=0 && arr[i] <=9){
				singleNumber +=arr[i];
			} else if(arr[i] >=10 && arr[i] <=99){
				doubleNumber +=arr[i];
			}

		}
		System.out.println("single Number :" +singleNumber);
		System.out.println("DoubleNumber  :" +doubleNumber);

	}

	public static void main(String ... args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the Array size :");
		int n= scan.nextInt();

		int arr [] = new int[n];

		for(int i=0;i<arr.length;i++){
			arr[i]=scan.nextInt();
      }
	  sumof(arr,n);
	}

}

// //5. Write a program to initialize the following character arrays and print a suitable message after
//  checking the arrays whether the two arrays are identical or not.
//   Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
// X[] =('m', 'n', 'o', 'p'} and
// Y[] =('m', 'n', 'o', 'p' }

class EQual {

	public static void main(String[] args) {
		
		char X [] = {'m','n','o','p'};
		char Y [] = {'m','n','o','p'};

         int n = X .length;
        boolean value =false;
		 for(int i=0;i<n;i++){
			if(X[i]==Y[i]){
				value=true;

			} else {
				value=false;
			}
		 }
		 if(value){
			System.out.println("This is Equal :");
		 } else 
		 {
			System.out.println("This Not Equal :");
		 }
	}
}


// 6. Write a program to accept the year of graduation from school as an integer value from the users 
//  Using the Binary search technique on the sorted array of integers given below 
// . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
// {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}




class Graduation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year :");
		 
	  int Year = scan.nextInt();

	  int arr [] ={1982, 1987, 1993, 1996, 1999,2002, 2003, 2006, 2007, 2009, 2010, 2016 };
	 

	  int left=0,right=arr.length-1;

	   boolean value = false;

	  while (left <=right) {
		
		 int mid = (left + right )/2;

		 if(arr[mid]==Year){

		//  System.out.println("The record exists :");
		value =true;
		 break;
		 } else if( arr[mid] > Year) {

			right=mid -1;

		 } else {
			left =mid+1;
		 }
		
		
	  } 

	   if(value){
		System.out.println("The Record  Exists :");
	  } else {
		System.out.println("The Record dont   Exists :");
	  }


	}
}

// 8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.


class Age {
	public static void main(String ...args) {
		
		
		int arr []={22,33,44,55,66,77,88,99,11,21,45};

		    int count=0; 
		for(int i=0;i<arr.length;i++){
			if(arr[i] >18 && arr[i] <60){
				count++;
			}
			
		}
		System.out.println("Age count :" +count);
	}
}

// 9. Write an array which takes in roll no and marks in 3 subjects for 10 students.
//  Format and Print the roll no, total marks and average for all students in a table form.

class Student1 {
	public static void main(String ...args) {

		Scanner scan = new Scanner(System.in);

        int roll_Number [] = new int[10];
		int mark [][] = new int[10][3];
		int total [] = new int[10];
		double average [] = new double[10];
		
		int sum=0;

		for(int i=0;i<10;i++){
             System.out.println("Enter the roll Number :");
			roll_Number[i]=scan.nextInt();
			
			for(int j=0;j<3;j++){
				  System.out.println("Enter the Mark  :");
					mark[i][j]=scan.nextInt();
					sum +=mark[i][j];
               }

			   total[i]=sum;
			   average[i]=total[i]/2;
			   System.out.println();
			}

			for(int i=0;i<10;i++){
				System.out.println(" " +roll_Number[i] + " " + mark[i] + "" +average[i]);
			}
		}
	
}

// *Day-2 Assignment Questions: Part-3 Strings*
// 1. Given two binary strings a and b, return their sum as a binary string.
// Input: a = "11", b = "1"
// Output: "100"

class Binary {
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the  Tow Binary String ");
		String s = scan.nextLine();
		String r = scan.nextLine();

		String result = "";
		int i= s.length()-1;
		int j=r.length()-1;

		int val1=0,val2=0,rem=0;

		while (i >= 0 || j >=0) {

			if(i>=0){
				val1= s.charAt(i)-'0';
				i--;
			} else if( j >=0){
				val2 = r.charAt(j)-'0';
				j--;
				
			}

		 result = ((rem + val1 + val2)>1?0:1) + result;
			rem = (rem + val1 + val2)>1?1:0;
			
		}
		if(rem==1){

			result = rem +result;
		}
		System.out.println("The sum of Binary Numbers :" +result);

		
	}
}

// 2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

class Excelsheet {

	public static void main(String ... args) {
      
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the VAlue  :");
		int n = scan.nextInt();
		String  result = "";


		while (n-- >0) {
			// n--;

			int rem = n %26;

			char a = (char) (rem + 'A');

			result = a + result;
			n =n /26;

			
		}
		System.out.println("The OutPut :" +result);

		
	}
}

// 3. Given a string s, reverse only all the vowels in the string and return it.

class reverse {
	public static void main(String ...args) {
       
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String Value :");

		String s = scan.nextLine();

		char arr [] = s.toCharArray();

		int i=0,j=s.length()-1;

		while (i<j) {

			if(!vowel(arr[i])){
				i++;
			}
			if(!vowel(arr[j])){
				j++;
			} else if(vowel(arr[i]) && vowel(arr[j])){

				char temp = arr[i];
				arr[i] =arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			}
			System.out.println(new String(arr));
		}

			static boolean vowel(char a){

			return a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='O' || a=='U' ;

			}
}

// 4. You are given two strings s and t.
// String t is generated by random shuffling string s and then add one more letter at a random position.
// ‌
// Return the letter that was added to t.

class Random {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter the First String value :");
        String s = scan.nextLine();
        System.out.println("Enter the second String value :");
        String t = scan.nextLine();

        boolean value = false;

        for(int i=0;i<t.length();i++){
            if(!s.contains(t.substring(i,i+1))){
                System.out.println("value add " + t.charAt(i));
                value=true;
            }
        }
        if(!value){
            System.out.println("Value is Not Add :");
        }
    }
}

// 5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

class subsequence {
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the s String value :");
		String s= scan.nextLine();
		System.out.println("Enter the t value :");
		String t = scan.nextLine();

		int i=0,j=0;

		while(i<s.length() && j<t.length()){

			if(s.charAt(i)==t.charAt(j)){
				i++;
			}
			j++;

		} if(i==s.length()){
			System.out.println("True :");
		} else {
			System.out.println("False :");
		}
		
	}
}

// 6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

class Stringadd {
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 String value : ");
		String num1 = scan.nextLine();
		System.out.println("Enter the 2 String value :");
		String num2 = scan.nextLine();

		String result = String.valueOf(Integer.parseInt(num1)  + Integer.parseInt(num2));

		System.out.println(".(========The Value is ========) " + result);
		
	}
}

// 7. Given a string s, return the number of segments in the string.
// A segment is defined to be a contiguous sequence of non-space characters.

class segment {
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the String value :");
          String s = scan.nextLine();
		 String c [] = s.split("\\s+");

		 System.out.println(c.length);
		}
}

// 8. We define the usage of capitals in a word to be right when one of the following cases holds:

class Word {
	public static void main(String... args) {

	
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter String value :");
		String str = scan.nextLine();

		if(str.equals(str.toUpperCase())){
			System.out.println("True :");
		} else if(str.equals(str.toLowerCase())){
			System.out.println("True:");
		} else if(str.charAt(0) >='A' && str.charAt(0) <='Z'){

			boolean value= true;

			for(int i=1;i<str.length();i++){


				if(!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
					value= false;

					break;
                  
				}
			}
			System.out.println(value);

		}
		
	}
}






































