import java.util.*;



// *Day-3 Assignment Questions:*
public class DAY3
{
	public static void main(String[]args)
	{
		System.out.println("DAY3 Assignment Questions");
	}
}

/*1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/
class Student
{
	String name;
	int roll_no;
	public static void main(String[]args)
	{
		Student st = new Student();
		st.name = "John";
		st.roll_no = 2;
		System.out.println("The name of the student: "+st.name);
		System.out.println("The roll_no of the student: "+st.roll_no);
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

// 4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, 
// such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.

class  Vehicle {
	String id;
	 String brandName;
	 double price;
	 static int count;

 Vehicle(String id,String brandName,double price){
		this.id =id;
		this.brandName=brandName;
		this.price=price;
		count++;
	}
	
}


class VehicleMain {
    public static void main(String[]args){
	Vehicle v =new Vehicle("1001","BMW",2000000.00);
    Vehicle v1 =new Vehicle("103","MG",2000000.00);
   
	 System.out.println("The number of vehicles: " +Vehicle.count);
	}


}


// 	5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
// ‌
// Create two classes:
// ---Store
// ---Product
// ‌
// Requirements:
// The Store class should have:
// a. storeName and storeLocation as static variables since they are common to all products in the store.
// b. A static method setStoreDetails(String name, String location) to initialize the static variables.
// c. A static method displayStoreDetails() to print store details.
// d. A list to maintain multiple Product objects (i.e., the store contains many products).
// e. A method addProduct(Product product) to add products to the store.
// f. A method displayAllProducts() to display details of all products.
// ‌
// The Product class should have:
// a. Product ID, name, price, and quantity as instance variables.
// b. A constructor to initialize these fields.
// c. A method displayProduct() to show product details.
// ‌
// Task:
// Implement the above classes and demonstrate their use in the main() method by:
// a. Setting store details once.
// b. Creating multiple product objects.
// c. Adding them to the store.
// d. Displaying store and product information.
// ‌
// Also Check how many .class files are generated.



class Store {
    static String storeName;
    static String storeLocation;

    List<Product> productList = new ArrayList<>(); 

    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    static void displayStoreDetails() {
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Location: " + storeLocation);
    }

    void addProduct(Product product) {
        productList.add(product);
    }

    void displayAllProducts() {
        System.out.println("All Products in Store:");
        for (Product p : productList) {
            System.out.println("----------------------");
            p.displayProduct();
        }
    }
}

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }
}

class Main {
	
    public static void main(String[] args) {
        Store.setStoreDetails("selvin tech ", "town");
        Store.displayStoreDetails();

        Product product1 = new Product(101, "Laptop", 75000.00, 10);
        Product product2 = new Product(102, "Smartphone", 30000.00, 20);

        Store store = new Store();
        store.addProduct(product1);
        store.addProduct(product2);

        store.displayAllProducts();
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
