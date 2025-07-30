
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

class RBI {
    Customer c;
    Account a;
    
    double minimumInterestRate = 4.0;
    double minimumBalance = 1000.0;
    double maximumWithdrawalLimit = 50000.0;

    RBI (Customer c ,Account a){
        this.c = c;
        this.a = a;

    }


    // void displayDetails() {

    //     c.displayDetails();
    //     a.displayDetails();
    // }


    public double getMinimumInterestRate() {
        return minimumInterestRate;
    }


    public double getMinimumBalance() {
        return minimumBalance;
    }


    public double getMaximumWithdrawalLimit() {
        return maximumWithdrawalLimit;
    }

}


// 2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). 
// Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment.
// Write a main class where you can accept payment using different methods.


