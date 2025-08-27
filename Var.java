// Online Java Compiler
// Use this edito*r to write, compile and run your Java code online
import java.util.*;
 public class Var {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the k value :");
       int k =scan.nextInt();
       int arr [] = {1,0,1,1,0,1,1,0,1,1,1,1};
       
      
        int  c = 0; 
     

        for(int i : arr){
            if(i==1){
                c++;
             System.out.print(i +" ");
             if(c==k) {
              
               
                System.out.print(0+" ");
                  c=0;
             }
           
            } else {
                c=0;
                System.out.print(i+" ");
            }

        }
        System.out.print(" "+ c);
       
    }
}