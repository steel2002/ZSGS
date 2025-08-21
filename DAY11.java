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

class Ques2
{
	public static void main(String[]args)
	{
		
	//a) to read content from the user and write it into another file
		try
		{	
			String line;	
			Scanner input = new Scanner(System.in);
		
			BufferedWriter bw = new BufferedWriter(new FileWriter("File.txt"));

			System.out.println("Enter something: ");
			line = input.nextLine();
			bw.write(line);
			bw.close();
			System.out.println("\n\n");
			
			BufferedReader br = new BufferedReader(new FileReader("File.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
			System.out.println("\n\n");

	//b) from the file to another file 	
		
			File file = new File();
			file.createNewFile();
			bw = new BufferedWriter(new FileWriter("File1.txt"));
			br = new BufferedReader(new FileReader("File.txt"));

			while((line = br.readLine())!=null)
			{
				bw.write(line);
			}
			bw.close();
			br.close();

			br= new BufferedReader(new FileReader("File1.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}	
			br.close();
			System.out.println("\n\n");

	//c) to modify the content of a file

			bw = new BufferedWriter(new FileWriter("File1.txt"));
			System.out.println("Enter something to modify the content: ");
			line = input.nextLine();
			bw.write(line);
			bw.close();

			br = new BufferedReader(new FileReader("File1.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
			System.out.println("\n\n");

	//d) to search for a particular word in a file and display how many times it appears 

			String word = "java";
			int count = 0;
			br = new BufferedReader(new FileReader("File.txt"));
			while((line = br.readLine())!=null)
			{
				String[]words = line.split("\\s+");
				for(String str:words)
				{
					if(str.equalsIgnoreCase(word))
					{
						count++;
					}
				}
			}
			br.close();
			System.out.println("The presence of the given word in the file is: "+count+" times...");
			System.out.println("\n\n");

	//e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
			
			file = new File();
			bw = new BufferedWriter(new FileWriter("products.csv"));
			br = new BufferedReader(new FileReader("elecproducts.txt"));
			while((line = br.readLine())!=null)
			{
				String newLine = line.replaceAll("\\s+", ", ");
				bw.write(newLine);
			}
			bw.close();
			br.close();

			br = new BufferedReader(new FileReader("products.csv"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
			input.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}	
	}
}







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


class Ques4
{
	public static void main(String[]args)
	{
		try
		{
			String line;
			BufferedReader br = new BufferedReader(new FileReader("File1.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			System.out.println("\n\n");

			Scanner input = new Scanner(System.in);
			BufferedWriter bw = new BufferedWriter(new FileWriter("File1.txt", true));
			System.out.println("Enter something to append: ");
			line = input.nextLine();
			bw.write(line);
			bw.close();
			input.close();
			System.out.println("\n\n");	

			br = new BufferedReader(new FileReader("File1.txt"));
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			br.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
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
