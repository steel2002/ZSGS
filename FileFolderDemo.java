import java.io.File;
import java.io.IOException;

public class FileFolderDemo {
    public static void main(String[] args) throws IOException {
        
        // File file = new File("D:\\FileDemo\\Demo1\\Demo2");

        // boolean Check = file.exists();
        // System.out.println("Check The File Folder :" + Check);   // FileFolder Create 
          
        // if(Check==false)

        // file.mkdirs(); 

        //  Check= file.exists();
        //  System.out.println("Check The File Folder :"+ Check);


        //  File Create--------------------------------------------------------------------------------------------------------------------------

        // File file = new File("D:\\FileDemo\\tst.tex");

        // boolean Check = file.exists();

        // if(Check==false)
        // try {
        //     boolean create = file.createNewFile();
        //     System.out.println("File Create " + create);
            
        // } catch (IOException e) {

        //     System.out.println("" +e.getMessage());
        //     e.printStackTrace();
        //  }


        // File Delete -----------------------------------------------------------------------

        // File file = new File("D:\\FileDemo\\tst.tex");

        // file.delete();

        // file.exists();
        // boolean Check = file.exists();
        // System.out.println("check is Delete File :" +Check);


     // File Rename-----------------------------------------------------

     File file = new File("D:\\FileDemo\\tst.tex");
     
     file.createNewFile();

     File rename =new File("D:\\FileDemo\\ts.tex");

     boolean check =  file.renameTo(rename);

     System.out.println("Checking File :" + check);

      
     System.out.println("Print File Name :" + rename.getName());   // File Name get Value :
     System.out.println("Excecute File " + rename.canExecute());
     System.out.println("Read File Check : "+ rename.canRead());
     System.out.println("Write File Check :" +rename.canWrite());


        
    }
    
}
