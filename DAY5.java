import java.util.Scanner;
import java.util.*;


public class DAY5 {
    public static void main(String[] args) {
        
    }
}


// *Day-5 Assignment Questions:*
// 1. Design a Java program to maintain hospital medical records.
// Create a base class named MedicalRecord that includes common attributes:
// --- recordId, patientName, dateOfVisit, and diagnosis.
// --- inputRecordDetails() – to input common record information.
// --- override displayRecord() – to display the common record details.
// ‌
// Create a subclass InPatientRecord that extends MedicalRecord and adds:
// --- roomNumber, numberOfDaysAdmitted, roomCharges.
// --- calculateTotalCharges() – to compute and return total inpatient cost.
// --- displayRecord() – to include all details, including total charges.
// ‌
// Create another subclass OutPatientRecord that extends MedicalRecord and adds:
// --- doctorName, consultationFee.
// --- override displayRecord() – to include all outpatient-specific details.
// Include all the necessary classes if its needed.

class MedicalRecord {
    
   private int recordId;
   private  String patientName;
   private String diagnosis;
   private String dateOfVisit;


    public void  inputRecordDetails(Scanner scan){

        System.out.println("Enter the recordId :");
         recordId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Patient Name :");
         patientName =scan.nextLine();
        System.out.println("Enter the DOB :");
         dateOfVisit = scan.nextLine();
        System.out.println("Enter Diagnosis :");
         diagnosis = scan.nextLine();


    }

    public void  displayRecord(){

        System.out.println("RecordId :"+ recordId);
        System.out.println("PatientName :" + patientName);
        System.out.println("DOB :" +dateOfVisit);
        System.out.println("Diagnosis :" +diagnosis);
    }
}

// subclass // inpatientRecord :

class InPatientRecord extends MedicalRecord {

    private int roomNumber;
    private int numberOfDaysAdmitted;
    private  double roomCharges;


    public void InPatientRecord (Scanner scan){

        System.out.println("Enter the RoomNumber :");
        roomNumber = scan.nextInt();
        System.out.println("Enter the Number of Days Admitted :");
        numberOfDaysAdmitted = scan.nextInt();
        System.out.println("Enter the Room Charges :");
        roomCharges = scan.nextDouble();
        scan.nextLine();

    }



    public double calculateTotalCharges(){
        return numberOfDaysAdmitted * roomCharges;

    }


    public void displayRecord() {
        System.out.println("Show RoomNumber" +roomNumber);
        System.out.println("Show NumberofDaysAdmitted :" +numberOfDaysAdmitted);
        System.out.println("Show Room charges : " +roomCharges);
        System.out.println("Total Charges: $" + calculateTotalCharges());
    
    }
}

// outPatientRecord 

class  OutPatientRecord  extends MedicalRecord{

    private String  doctorName;
    private double consultationFee;


   public void OutPatientRecord (Scanner scan ){
      
    System.out.println("Enter the DoctorName :");
     
      doctorName=scan.nextLine();
     System.out.println("Enter the consultationFee");
      consultationFee = scan.nextDouble();
      scan.nextLine();

   }

 public void displayRecord() { 
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Consultation Fee: $" + consultationFee);
    }
}

class hospitalManagement{

    public static void main(String...args) {

        Scanner scan = new Scanner(System.in);

         System.out.println(" InPatient Record Entry");
         System.out.println("---------------------");
        InPatientRecord inpatient = new InPatientRecord();
        inpatient.InPatientRecord (scan);
        System.out.println(" InPatient Record Display");
        inpatient.displayRecord();

        System.out.println(" OutPatient Record Entry");
        OutPatientRecord outpatient = new OutPatientRecord();
        outpatient.OutPatientRecord(scan);
        System.out.println(" OutPatient Record Display");
        outpatient.displayRecord();
        
    }

}

// 2. Can we override private method, constructor, static method, final method? Illustrate with an example.

// Private Method

//                            (Error) 

// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // The method Start() from the type Vehicle is not visible

        // at Main.main(DAY5.java:161)



class ParentClass
{
	public ParentClass()
	{
		System.out.println("The Constructor of Super Class");
	}

	private void show()
	{
		System.out.println("The method is declare as private, so it cant be override");
	}

	static void display()
	{
		System.out.println("Static Method in the parent class will be executed, when object is created through Parent class reference");
	}

	void print()
	{
		System.out.println("This is to show that when we declare something final, it will not be able to override");
	}
}
class ChildClass extends ParentClass
{
	void ParentClass()								              //compiler treats it as a method and expects a return type and
	{										      //generates a compile time error
		System.out.println("Trying to override the parent class constructor");            	
	}										      
	
	void show()								              //Declaring same-named method in child = new method, not override.
	{
		System.out.println("The Void Show() inside child class, is not considered as override instead, it treated as new method");
	}
	
	static void display()                                                                //If I didn't use static, it will generate error as a static method cannot be hide through
	{                                                                                    //non-static method
                                                                                             
		System.out.println("Static Method in the child class will be executed, when object is created for child class");
	}

	void print()
	{
		System.out.println("This is will generate error, because ones we declare something final, it will be unchangeable and will be remains constant across all subclasses");
	}

	public static void main(String[]args)
	{
		ChildClass cd = new ChildClass();
		cd.show();
		cd.display();
		cd.print();
	}
}

// 3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). 
//Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.

class Employee {
    int id;
    String name;

    public Employee(int id,String name ) {
       this.id = id;
       this.name = name;
    }

    void calculateSalary() {
        System.out.println("calculating salary for Employee :");
    }

    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee{
double salary;

public FullTimeEmployee(int id,String name ,double salary){

    super(id,name);
    this.salary= salary;
}

void calculateSalary() {
    System.out.println("Full Time Employee salary :" + salary);
}

}

class PartTimeEmployee extends Employee {
    double salary;

    public PartTimeEmployee(int id,String name, double salary){
        super(id, name);
        this.salary = salary;
    }
    void calculateSalary(){
        System.out.println("Part Time Employee salary:" +salary);
    }
}

class EmployeeManagement{
    public static void main(String[] args) {

      FullTimeEmployee full = new FullTimeEmployee(007, "selvin", 10000000);
      PartTimeEmployee part = new PartTimeEmployee(006, "hyfa", 10000000);

      full.calculateSalary();
      full.display();

        System.out.println("------------------");

        part.calculateSalary();
        part.display();
        
    }
}

// 4. Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but 
// implement booking differently.

class TicketBooking {

    void booking(){
        System.out.println("Booking Ticket :");
    }

}

class Bus extends TicketBooking {

    void booking(){
        System.out.println(" Welcome to You Bus Ticket Booking Now :");
    }
}

class Train extends TicketBooking {

    void booking(){
        System.out.println("Welcome to You Train Ticket Booking Now :");
    }
}

class Flight extends TicketBooking {

    void booking(){
        System.out.println("Welcome to You flight Ticket Booking Now :");
    }
}

class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select the Ticket Booking Type Enter \n "+"1.Bus\n"+"2.Train\n"+"3.Flight\n "+"4.Exit :");


        switch (scan.nextInt()) {
            case 1:
                TicketBooking bus = new Bus();

                bus.booking();
                
                break;

                case 2:

                TicketBooking train = new Train();
                train.booking();
                break;

                case 3:
                 TicketBooking flight = new Flight();

                 flight.booking();
                 break;

                 case 4 :
                 System.out.println("Exiting the Ticket Booking System. "+ "404 Not Found");

               System.exit( 0);
               break;
        
            default:
            System.out.println("Invalid choice, please try again.");
                break;
        }
    }
}