
// *Day-6 Assignment Questions:*

// 1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as
//  transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter 
// methods to x1 and modify these details securely. Also include a method to display the transaction summary.]

class PaymentGetway {
    private String transactionId;
	private String payerName;
	private String payeeName;
	private double amount;
	private String paymentMethod;
	private String transactionStatus;

               // constructor 
	public PaymentGetway(String transactionId,String payerName,String payeeName,double amount,String paymentMethod, String transactionStatus){

		this.transactionId=transactionId;
		this.payerName=payerName;
		this.payeeName=payeeName;
		this.amount=amount;
		this.paymentMethod=paymentMethod;
		this.transactionStatus=transactionStatus;

	}

	public String getTransactionId(){
		return transactionId;
	}
	public String getPayerName(){
		return payerName;
	}
	public String getPayeeName(){
		return payeeName;
	}
	public double getAmount(){
		return amount;
	}
	public String getPaymentMethod(){
		return paymentMethod;
	}
	public String getTransactionStatus(){
		return transactionStatus;
	}

	public void setAmount(double amount){
		if(amount > 0){
			this.amount=amount;
		}
	} 

	public void setPaymentMethod(String paymentMethod){
		this.paymentMethod=paymentMethod;
	}
	public void setTransactionStatus(String transactionStatus){
		this.transactionStatus=transactionStatus;
	}

	public void displayTranSactionSummary(){
           	
		System.out.println("<=====TransactionSummary=====>");
		System.out.println("Tranction Id :" +transactionId);
		System.out.println("Payer Name :" +payerName);
		System.out.println("PayeeName :" +payeeName);
		System.out.println("Amount :$"+amount);
		System.out.println("PaymentMethod :" +paymentMethod);
		System.out.println("TransactionStatus :" +transactionStatus);
	}
}
 public class DAY6 {
	public static void main(String[] args) {
		
	PaymentGetway transaction= new PaymentGetway("TX78", "Selvin", "Amzon", 5000000, "Credit card :", "successfull");
	transaction.displayTranSactionSummary();
	
	transaction.setTransactionStatus("Refund");

	System.out.println("\n update transaction :");

	transaction.displayTranSactionSummary();

		
	}

}

// 3. Design a class `Employee` with private data members: employee ID, name, designation, department, and monthly salary. 
// Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.

class Employe{
	private int  emp_Id;
	private String name;
	private String designation;
	private String department;
	private double salary;



	public Employe(int emp_Id, String name, String designation, String department, double salary){
		this.emp_Id = emp_Id;
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}



    public int getEmp_Id() {
        return emp_Id;
    }



    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation(){
        return designation;
    }

    public void setDesignation(){
        this.designation=designation;
    }



    public void setDepartment(String department) {
        this.department = department;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }



    public String getName() {
        return name;
    }



    public String getDepartment() {
        return department;
    }



    public double getSalary() {
        return salary;
    }

    public void displayTranSactionSummary(){
           	
		System.out.println("<=====TransactionSummary=====>");
		System.out.println("Tranction Id : " +emp_Id);
		System.out.println("Payer Name :" +name);
        System.out.println("Payer Name :" +designation);
		System.out.println("PayeeName :" +department);
		System.out.println("Amount :$"+salary);
		
	}

}

class DAY61 {
    public static void main(String[] args) {

        Employe em = new Employe(1,"selvin","Software Develope","IT",50000);

        em.displayTranSactionSummary();
      em.setDepartment("ISRO");

       em.displayTranSactionSummary();
        
    }
}

// 5. Design a class named `BankAccount` that uses the concept of encapsulation. The class should have the following 
// private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, 
//include a method to deposit and withdraw amount ensuring that the balance cannot go negative.

class BankAccount {
    private int account_number;
    private String account_holder_name;
    private double account_balance;

    public BankAccount(int account_number,String account_holder_name,double account_balance){
        this.account_number=account_number;
        this.account_holder_name=account_holder_name;
        this.account_balance=account_balance;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

       // Deposit 

     public void deposit(double amount) {
        if (amount > 0) {
            account_balance += amount;
            System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + account_balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // withdrow 
public void withdraw(double amount) {
        if (amount > 0) {
            if (account_balance >= amount) {
                account_balance -= amount;
                System.out.println("Withdrawn ₹" + amount + " New Balance: ₹" + account_balance);
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    
    public void displayTranSactionSummary(){
           	
		System.out.println("<-----BankAccount----->");
		System.out.println("Account Number  : " +account_number);
		System.out.println("Account Holder Name :" +account_holder_name);
        System.out.println("Account Balance :" +account_balance);
		
	}
}

class DAY62 {
    public static void main(String...args) {

        BankAccount bank = new BankAccount(123456789, "selvinn", 10000);

        bank.displayTranSactionSummary();

        bank.setAccount_holder_name("steel");

        System.out.println("Update name :");

        
        bank.deposit(50000);

        bank.withdraw(10000);

        bank.displayTranSactionSummary();

        
        
    }
}