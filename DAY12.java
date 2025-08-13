import java.util.concurrent.SynchronousQueue;

public class DAY12 {
    public static void main(String[] args) {
        
    }
    
}

// *Day-12 Assignment Questions:*

// 1. Write a Java program to demonstrate multithreading by extending the Thread class.
// --->Create a class MyThread that extends Thread.
// --->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds between prints.
// --->In the main() method, create two objects of MyThread and start them.
// --->Each thread prints its message independently, showing concurrent execution.


class MyThread extends Thread {

    public void run(){
   
        for(int i=0;i<5;i++){

            System.out.println(Thread.currentThread().getName() + " Notify");

           try {
                
            Thread.sleep(500);
             
           } catch (InterruptedException e) {

               System.out.println(" " + e.getMessage());
            
           }
        }
    }


    public static void main(String[] args) {
       MyThread t1 = new MyThread();
       MyThread t2 = new MyThread();
       MyThread t3 = new MyThread();

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");

        t1.start();
        t2.start();
        t3.start();
          
    }
}

// 2. Write a Java program to create a thread using the Runnable interface.
// --->Create a class TaskRunner that implements Runnable.
// --->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
// --->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
// --->The console should reflect the concurrent execution of both tasks.

class TaskRunner implements Runnable {

    public void run(){

        for(int i=0;i<10;i++){

           System.out.println(Thread.currentThread().getName() + " Notify :");


           try {
              
            Thread.sleep(1000);

           } catch(InterruptedException e){

            System.out.println(" " + e.getMessage());

           }

        }
    }


public static void main(String[] args) {

    TaskRunner t1 = new TaskRunner();
    TaskRunner t2 = new TaskRunner();

    Thread t3 = new Thread(t1);
    Thread t4 = new Thread (t2);

      t3.setName(" A ");
      t4.setName(" B ");
      
      t3.start();
      t4.start();

        
    }

}

// 3. Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20. 
// Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...)

class NumberPrint {
      private int number=1;
      private int Max =20;

      public synchronized void PrintOdd(){

        while(number <= Max){

            if(number %2 !=0){

                System.out.println("Print Odd Number :" + number);
                number++;
                 notify();
                
             } else {

                try {

                wait();
                

                } catch (InterruptedException e){

                    System.out.println(" " + e.getMessage());

                }
             }

        }
    }

        public synchronized void PrintEven(){ 

            while (number <= Max) {

                if(number %2==0){
                    System.out.println("Even Number : " +number);
                    number++;
                    notify();
                

                } else {
                    try {
                      wait();
                        
                    } catch(InterruptedException e){
                        System.out.println("" + e.getMessage());

                    }

                }
                
            }
        }

    public static void main(String[] args) {

        NumberPrint n = new NumberPrint();

        Thread t1 = new Thread (()-> n.PrintOdd());
        Thread t2 = new Thread (()-> n.PrintEven());

        t1.start();
       t2.start();

        
    }
}

// 4. Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times.
//  Use synchronization to avoid race conditions and display the final value.


class SharedCounter {
    private int count;

    public synchronized void increment(){
        count++;
    }

    public int getcount(){
        return count;
    }

    public static void main(String[] args) {
        
        SharedCounter s = new  SharedCounter();

        Runnable Task = () -> {
            for(int i=0;i<100;i++){
                s.increment();

            }
        };
        Thread t1 = new Thread(Task);
        Thread t2 = new Thread(Task);
        Thread t3 = new Thread(Task);

        t1.start();
        t2.start();
        t3.start();

        try {

            t1.join();
            t2.join();
            t3.join();
            
        } catch (InterruptedException e) {

            System.out.println(" " +e.getMessage());
           
        }
        System.out.println("Get Count Value : " + s.getcount());
    }
}

// 5. Implement a basic producer-consumer problem using wait() and notify().
// --->Producer thread should add items to a shared buffer.
// --->Consumer thread should remove items.
// Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM machine, where create thread to check the PIN number, 
// another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.

class ATM{
    private int balance =10000;
    private final int correctPin =2002;
  
    public synchronized boolean checkPin(int enterPin){

        System.out.println("checking PIN :");
        return enterPin == correctPin;
    }

    public synchronized void withdrawal (int amount){
        System.out.println("Processing Withdrawal :");

        if(amount <=balance){
            balance-=amount;
            System.out.println("Withdrawal successful :"+ amount);
        } else {
            System.out.println("No Balance :");
        }
    }
   public synchronized int checkBalance(){

    System.out.println("Checking balance :");
    return balance;
   }


   public synchronized void printReceipt(int amount){

    System.out.println("Printing receipt :");
    System.out.println("Amount Withdrow : "+ amount );
    System.out.println("Remaining balance :" + balance);
   }


}