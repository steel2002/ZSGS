
public class ThreadJoinEx
{
    public static void main(String[] args) {
    System.out.println("Application Started!!!!");
    myTask1 task1 = new myTask1(); 
	task1.start();
	myTask2 task2 = new myTask2();
	Thread t2 = new Thread(task2);
   	//t2.start();
    	try
	{
		task1.join();
	}      
	catch(InterruptedException e)
	{}

	t2.start();
        //till the jobs from myTask completed the following jobs will wait and are not executed. 
        //sometime some apps is hanging bz the main thread(long running operation) is blocked...
        for(int i=0;i<10;i++)
            System.out.println("Doing main_Last_Thread-Job-"+i);

        System.out.println("Application Finished!!!!");
    }
}

class myTask1 extends Thread
{
    public void run()
    {
	try
	{
		for(int i=1;i<=10;i++){
            		System.out.println("Doing myTask-Job using Thread Class-"+i);
			Thread.sleep(400);
        	}
	}      
	catch(InterruptedException e)
	{}
    }
}

class myTask2 implements Runnable
{
    public void run()
    {
	try
	{
		for(int i=201;i<=210;i++){
            		System.out.println("Doing myTask-Job using Runnable-"+i);
			Thread.sleep(400);
        	}
	}      
	catch(InterruptedException e)
	{}
    }
} 


