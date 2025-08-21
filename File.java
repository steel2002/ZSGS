
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        
    }

    public void createNewFile() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createNewFile'");
    }
    
}



// class FileHandls {
//     public static void main(String[] args) {
        
//         File file = new File("D:\\");

//         File [] arr = file.listFiles();

//         for(File f : arr){

//         if (f.isFile()) {

//                 String filename =f.getName();
//                 int lastDot = filename.lastIndexOf(".");
//                 String extan = filename.substring(lastDot+1);

//                 if (extan.equals("java")) {

//                     if(filename.length() >50){
//                            System.out.println("File Length " + filename.length());
//                     }

//                  System.out.println(filename);
                    
//               }

                
//             }
//         }
//     }
    
//  }




class File1 {
    public static void main(String[] args) {

        String file = new String("D:\\FileDemo\\tst.tex");

        try {
            FileWriter w = new FileWriter(file);
            w.write(65); 
            w.write(" Welcome Selvin u are the code :");
            w.flush();
            w.close();

            FileReader r = new FileReader(file);
            int output = r.read();

            while (output != -1) {
                System.out.print((char) output); 
                output = r.read();
            }

            r.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("tst.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
