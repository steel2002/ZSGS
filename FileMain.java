import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

//  public class FileMain {
//   public static void main(String[] args) {
// //    File file = new File("filel.txt");
// //      try {
// //       if (file.createNewFile()) {
// //         System.out.println("File created: " + file.getName());
// //       } else {
// //         System.out.println("File already exists.");
// //       }
// //      } catch (IOException e) {
// //       System.out.println("An error occurred.");
// //        e.printStackTrace();
// //      }
   
      
//     }

//   }

import java.io.*;
import java.util.Scanner;

class FileExists {
    public static void main(String args[]) {
        try {
            File file = new File("file2.txt");

            // Check if file exists
            if (file.exists()) {
                System.out.println("File exists: " + file.getName());

                // Reading using Scanner (line by line)
                Scanner read = new Scanner(file);
                System.out.println("Reading file content with Scanner:");
                while (read.hasNextLine()) {
                    String data1 = read.nextLine();
                    System.out.println(data1);
                }
                read.close();
            } else {
                System.out.println("File does not exist.");
                file.createNewFile();
                System.out.println("File created successfully.");
            }

            // Append to the file
            FileWriter fw = new FileWriter(file, false); // true = append mode
            fw.write("\nWelcome to javaclass");
            fw.close();

            // Reading again with FileReader (character by character)
            FileReader fr = new FileReader(file);
            int data;
            System.out.println("\nReading file content with FileReader:");
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            fr.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
