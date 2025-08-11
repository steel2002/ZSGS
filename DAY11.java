import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DAY11 {
    public static void main(String[] args) {
        System.out.println("Welcome to DAY11 Qustions :");
    }
    
}

// *Day-11 Assignment Questions:*---------------------------------------------------------------------------------------------------------------

// 1. Write a Java program to read the contents of a text file and display it on the console.

class FileRead {
    public static void main(String[] args) {
        
          try {
           FileReader file = new FileReader("D:\\FileDemo\\tst.tex");

            int Reading =file.read();

            System.out.println("File Reading sucessfull :" + Reading);
            
          } catch (Exception e) {

            System.out.println("" +e.getMessage());
        
          }
    }
}
// 2. Write a Menu driven Java program a) to read content from the user and write it into another file and b) 
// from the file to another file c) to modify the content of a file d) to search for a particular word in a 
// file and display how many times it appears e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.








// 3. Write a Java program that reads a file and prints the number of lines, words, and characters.

class Read{
  public static void main(String[] args) throws IOException{
    
    String filePath="D:\\FileCheck\\DAY8.txt";

    int linecount=0;
    int wordcount=0;
    int charcount=0;
    
    try {

      BufferedReader reader = new BufferedReader(new FileReader(filePath));

      String line;

      while ((line=reader.readLine()) !=null) {

        linecount++;

        charcount += line.length();

        String [] word =line.trim().split("\\s");


        if(!line.trim().isEmpty()){
          
          wordcount +=word.length;
        }
        
      }

      reader.close();

      System.out.println("Line Count "+ linecount);
      System.out.println("Word Count " +wordcount);
      System.out.println("Char Coutn "+charcount);

      
    } catch (IOException e) {

      System.out.println(" " + e.getMessage());
     
    }
  }
}
// 4. Write a Java program to append a text read from the user to an existing file without overwriting the original content.


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main{
    public static void main(String[] args) throws IOException {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\FileCheck\\DAY8.txt",true))){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the content you want to append into the file:");
            System.out.println("type exit to stop!");
            while (true) {
                String line=sc.nextLine();
                if(line.equalsIgnoreCase("exit")){
                    break;
                }
                bw.write(line);
                bw.newLine();
            }
        }
    }
}


// 5. Design a Java application to manage a product inventory system using file handling and object serialization.
// Create a class Product with the following attributes:
// --->int productId
// --->String name
// --->double price
// --->int quantity
// a. Ensure the class implements the Serializable interface. 
// b. Methods:
// --->Add a Product: Accept product details from the user and write the object to a file (products.dat).
// --->View All Products: Read all product objects from the file and display them.
// --->Search Product by ID: Search for a product by productId in the file and display its details if found.
// --->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to the file.
// --->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
// --->Use proper exception handling and ensure that object serialization and deserialization are handled safely and efficiently.
