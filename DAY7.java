
import java.util.Scanner;


public class DAY7 {
    public static void main(String[] args) {
        
    }
    
}

// *Day-7 Assignment Questions:*




// 1. All the banks operating in India are controlled by RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance 
// allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account 
// to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
// Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived 
// classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
// Hint:
// Class Customer
// {
// //Personal Details ...
// // Few functions ...
// }
// Class Account
// {
// // Account Detail ...
// // Few functions ...
// }
// Class RBI
// {
// Customer c; //hasA relationship
// Account a; //hasA relationship
// ..
// Public double GetInterestRate() { }
// Public double GetWithdrawalLimit() { }
// }
// Class SBI extends public RBI
// {
// //Use RBI functionality or define own functionality.
// }
// Class ICICI extends public RBI
// {
// //Use RBI functionality or define own functionality.
// }

/*

abstract class RBI {
    Customer c;
    Account a;

    double interestRate;
    double withdrawalLimit;

    abstract void displayDetails();
    
      double getInterestRate()
    {
        return interestRate;
    }
     double getWithdrawalLimit(){
        return withdrawalLimit;
    }
 }



class SBI extends RBI {
    double ammount ;
    private double interestRate = 4.0;
    private double withdrawalLimit = 10000.0;

    public SBI (Customer c ,Account a,double ammount) {
        super.c=c;
        super.a=a;
        this.ammount = ammount;
    }

    void displayDetails (){
        c.displayCustomerDetails();
        a.displayAccountDetails();
    }
 

    double getInterestRate() {
        return interestRate;
    }
    double getWithdrawalLimit() {
        return withdrawalLimit;
    }
   

}

class CNB extends RBI {
    double ammount ;
    private double interestRate = 5.0;
    private double withdrawalLimit = 15000.0;

    public CNB (Customer c ,Account a,double ammount) {
        super.c=c;
        super.a=a;
        this.ammount = ammount;
    }

    void displayDetails (){
        c.displayCustomerDetails();
        a.displayAccountDetails();
    }
 

    double getInterestRate() {
        return interestRate;
    }
    double getWithdrawalLimit() {
        return withdrawalLimit;
    }
   
}


class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private int age;


    public Customer(String name,String address,String phoneNumber,String email,int age){

        this.name= name;
        this.address=address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age=age;

    }

    void displayCustomerDetails(){
        System.out.println("Customer Name : " + name);
        System.out.println("Address :  " +address);
        System.out.println("Phone Number :" + phoneNumber);
        System.out.println("Email : "+ email);
        System.out.println("Age :" + age );

    }
}

class Account {
     int accNumber;
     String acchName;
 double balance;
 String Type;


    public Account(int accNumber,String acchName,double balance,String Type){
        this.accNumber= accNumber;
        this.acchName= acchName;
        this.balance = balance;
        this.Type = Type;
    }


    void displayAccountDetails(){

        System.out.println("Account Number :" + accNumber);
        System.out.println("Account holder Name :" + acchName);
        System.out.println("Account Balance :" + balance);
        System.out.println("Account Type :" + Type);

    }
}
 class BankManagement {
    public static void main(String[] args) {
Customer c= new Customer("John Doe", "123 Main St", "123-456-7890", "steelselvin.2002@gmail.com", 22 );

Account a = new Account(123456, "John Doe", 50000.00, "Savings");

SBI sbi = new SBI(c, a, 50000.00);
sbi.displayDetails();

CNB cnb = new CNB(c, a, 50000.00);
cnb.displayDetails();


    }
 }
*/


// 2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). 
// Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment.
// Write a main class where you can accept payment using different methods.


interface PaymentMethod {

    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {

    public void pay(double amount){
        System.out.println("creditCartPayment successfully " +amount);
    }

}

class  DebitCardPayment implements PaymentMethod {

    public void pay(double amount){
        System.out.println("DebitCardpayment successFully :" +amount);
    }
}

class UPIPayment implements PaymentMethod{

    public void pay (double amount){
        System.out.println("UPIPayment successFully :"+ amount);
    }
}

class Gateway {
    public static void main(String... args) {

        PaymentMethod credit  = new CreditCardPayment();
        PaymentMethod debit = new DebitCardPayment();
        PaymentMethod upi = new UPIPayment();

        credit.pay(10000);
        debit.pay(200000);
        upi.pay(3000000);

        
    }
}





// 3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). 
// Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their 
//  working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.


abstract class Employee {

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    

    void calculateSalary(){
        System.out.println("calaculating salary for full time employee" + "50000");
    }
}

class PartTimeEmployee extends Employee {

    void calculateSalary() {
        System.out.println("calaculating salary for part time employee :" + "20000");
    }
}

class EmployeeManagement {
    public static void main(String... args) {

        Employee full = new FullTimeEmployee();
        Employee part = new PartTimeEmployee();
        full.calculateSalary();
        part.calculateSalary();
    }
}


// 4. Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). 
// Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.
//  Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.


interface Employee1 {

    void calaculatingsalary();

}

class FullTimeEmployee1 implements Employee1 {

    public void calaculatingsalary(){
        System.out.println("calacuting salary for full time employee :" + "50000");
    }
}

class PartTimeEmployee1 implements Employee1{

    public void calaculatingsalary(){
        System.out.println("calacuting salary for part time employee :" + " 30000");
    }

}

class EmployeeManagement1{
    public static void main(String[] args) {
        Employee1 full = new FullTimeEmployee1();
        Employee1 part = new PartTimeEmployee1();

        full.calaculatingsalary();
        part.calaculatingsalary();
    }
}

// 5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as *Bus*, *Train*, and *Flight*.
// Define a common interface or abstract class `Ticket` with a method `bookTicket()` that each transportation mode must implement differently.
// Create classes `BusTicket`, `TrainTicket`, and `FlightTicket` that extend the abstract class or implement the interface.
// Demonstrate *runtime polymorphism* by calling the `bookTicket()` method using a reference of the base class/interface.

abstract class  Ticket1 {
    abstract void bookingTicket();

    public void getWelcome(){
        System.out.println("Welcome to the Ticket Booking System");
    }
}

class BusTicket extends Ticket1 {

   private int ticketId;
   private String passengerName;
   private String busNumber;


   public BusTicket(int ticketId,String passengerName,String busNumber){
    this.ticketId=ticketId;
    this.passengerName =passengerName;
    this.busNumber =busNumber;

   }
   public void  bookingTicket(){
        System.out.println("Booking ticket for Bus :");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Bus Number: " + busNumber);
    
   }

    
}
class TrainTicket extends Ticket1{

    private int ticketId;
   private String passengerName;
   private String trainNumber;

   public TrainTicket(int ticketId,String passengerName,String trainNumber){

    this.ticketId=ticketId;
    this.passengerName =passengerName;
    this.trainNumber =trainNumber;
   }

   public void bookingTicket(){
        System.out.println("Booking ticket for Train :");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Train Number: " + trainNumber);
    }
   }

   class FlightTicket extends Ticket1 {

    private int ticketId;
    private String passengerName;
    private String flightNumber;

    public FlightTicket(int ticketId,String passengerName,String flightNumber){
        this.ticketId=ticketId;
        this.passengerName =passengerName;
        this.flightNumber=flightNumber;
    }

    public void bookingTicket(){
        System.out.println("Booking ticket for Flight :");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Flight Number: " + flightNumber);
    }
   }

class TicketBookingSystem1{
    public static void main(String[] args) {
        
        Ticket1 busTicket = new BusTicket(101, "hyfa", "Bus-123");
        Ticket1 trainTicket = new TrainTicket(202, "Dhanush", "Train-456");
        Ticket1 flightTicket = new FlightTicket(303, "selvin", "Flight-789");

        busTicket.getWelcome();
        busTicket.bookingTicket();
         System.out.println("-------------------");
        trainTicket.getWelcome();
        trainTicket.bookingTicket();
        System.out.println("-------------------");

        flightTicket.getWelcome();
        flightTicket.bookingTicket();
    }
}

