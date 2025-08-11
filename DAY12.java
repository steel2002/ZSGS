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