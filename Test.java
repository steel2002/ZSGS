import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 public class Test {
    public static void main(String[] args) {
      
      
       int arr[]={1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i%2==0){
                odd.add(arr[i]);
            }else {
                even.add(arr[i]);
            }
        }
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(odd.get(j++) + " ");
            }else {
                System.out.print(even.get(k++) + " ");
            }
        }


    }
}


class Pattan {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Row Valuev :");
        int n= scan.nextInt();

        int Point =0;

        for(int i=1;i<=n;i++){

            Point =i+n;

            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print(i + " ");
                } else {
                    System.out.print(Point + " ");
                    Point++;

                }

            }
          System.out.println();
        }

       

    }
  
          
        }