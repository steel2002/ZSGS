// *Day-3 Assignment Questions:*

// 1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. 
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class DAY3 {

	String name ;
	int roll_Number ;
	public static void main(String... args) {

		DAY3 obj = new DAY3();
		 obj.name ="Selvin";
		 obj.roll_Number = 22;
		 System.out.println("The Name the Student : " +obj.name);
		  System.out.println("The Name the Student : " +obj.roll_Number);
     }
	
}
// 2. Create a class named Student that has the following attributes:
// name (String)
// roll_no (int)
// phone_no (int)
// address (String)
// Create a constructor Student(String name, int roll_no, int phone_no, String address) 
//and store and display the details for two students having names "Sam" and "John" respectively.


class Student10 {
	         int roll_no;
			 int phone_no;
			 String address;
			 String name;

	public  Student10 (int roll_no,int phone_no,String address ,String name){

		this.roll_no=roll_no;
		this.name=name;
		this.phone_no=phone_no;
		this.address=address;

		System.out.println("Student Name :"+name+"\n Student roll Number :"+roll_no+"\nStudent phone Number :"+phone_no+"\n Student Address "+address+"");

	}

	public static void main(String... args) {

	Student10 s1 = new Student10(9876510, 01, "John", "US");
	Student10 s2 = new Student10(9876511, 02, "selvin", "UAE");
		
	}
}

// 3. Write a Java program where you define a class named Employee. 
// Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.

class Employee1
{
	String emp_Name;
	int emp_Id;
	String designation;
	double salary;

	public Employee1()                                               //Default Constructor
	{
		System.out.println("Object has been creaeted");
		emp_Name = "selvin";
		emp_Id = 01;
		designation = "Software Developer";
		salary = 50000;
		System.out.println("Employee name: "+emp_Name+"\nEmployee ID: "+emp_Id+"\nDesignation: "+designation+"\nSalary: "+salary);
		System.out.println("\n");
	}
	
	public Employee1(String name, int id, String designation, double salary)        //Parameterized Constructor
	{
		this.emp_Name = name;
		this.emp_Id = id;
		this.designation = designation;
		this.salary = salary;
		System.out.println("Employee name: "+emp_Name+"\nEmployee ID: "+emp_Id+"\nDesignation: "+designation+"\nSalary: "+salary);
		System.out.println("\n");
	}

	public void Employe1(Employee1 e)                                      //Copy Constructor
	{
		System.out.println("Copies the values from the another object...");
		this.emp_Name = e.emp_Name;
		this.emp_Id = e.emp_Id;
		this.designation = e.designation;
		this.salary = e.salary;
		System.out.println("Employee name: "+emp_Name+"\nEmployee ID: "+emp_Id+"\nDesignation: "+designation+"\nSalary: "+salary);
	}

	public static void main(String[]args)
	{
		Employee1 E1 = new Employee1();
		Employee1 E2 = new Employee1("David", 02, "Security Analyst",50000);
		Employee1 E3 = new Employee1();
	}
}

/*
6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.
*/

class Employee12
{
	String name;
	int year;
	String address;
	public Employee12(String name, int year, String address)                                             
	{
		this.name = name;
		this.year = year;
		this.address = address;
		System.out.println(name + "\t"+ year + "\t\t\tL;" + address);
	}
	public static void main(String[]args)
	{
		System.out.println("Name"+"\tYear of joining  "+"\tAddress");
		Employee12 E1 = new Employee12("Robert",1994,"64C - WallsStreet");
		Employee12 E2 = new Employee12("sam",2000, "68D - WallsStreet");
		Employee12 E3 = new Employee12("john",1999,"26B - WallsStreet");
	}
}
