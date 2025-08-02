
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
    private int accountnumber;
    private String accountholdername;
    private double accountbalance;

    public BankAccount(int accountnumber,String accountholdername,double accountbalance){
        this.accountnumber=accountnumber;
        this.accountholdername=accountholdername;
        this.accountbalance=accountbalance;
    }

    public int getAccount_number() {
        return accountnumber;
    }

    public void setAccount_number(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccount_holder_name() {
        return accountholdername;
    }

    public void setAccount_holder_name(String accountholdername) {
        this.accountholdername = accountholdername;
    }

    public double getAccount_balance() {
        return accountbalance;
    }

    public void setAccount_balance(double accountbalance) {
        this.accountbalance = accountbalance;
    }

       // Deposit 

     public void deposit(double amount) {
        if (amount > 0) {
            accountbalance += amount;
            System.out.println("Deposited $" + amount + ". New Balance: $" + accountbalance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // withdrow 
public void withdraw(double amount) {
        if (amount > 0) {
            if (accountbalance >= amount) {
                accountbalance -= amount;
                System.out.println("Withdrawn $" + amount + ". New Balance: $" + accountbalance);
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    
    public void displayTranSactionSummary(){
           	
		System.out.println("<-----BankAccount----->");
		System.out.println("Account Number  : " +accountnumber);
		System.out.println("Account Holder Name :" +accountholdername);
        System.out.println("Account Balance :" +accountbalance);
		
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