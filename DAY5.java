import java.util.Scanner;


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

public class DAY5 {

    public static void main(String...args) {

        Scanner scan = new Scanner(System.in);

         System.out.println(" InPatient Record Entry");
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

// 3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). 
//Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.

class Employe {
    String name;
    int id;


    public Employe (String name,int id){
        this.name=name;
        this.id=id;

    }

    public double calculateSalary(){
        return 0.0;
    }

    public void displayRecord(){
        System.out.println("This is Employe Name :" +name);
        System.out.println("This is Employe ID :" +id);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        this.name.name;
        this.monthlySalary = monthlySalary;
    }
}
