

//---------------------------------------------------DAY8----------------------------------------------------------------

// 1. Illustrates with an example of using Singleton class.


class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created:");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, this is the Singleton class.");
    }
}

// DAY8.java
public class DAY8 {
    public static void main(String[] args) {

       
        Singleton obj = Singleton.getInstance();

       
        obj.showMessage();
    }
}

// 2. Develop a Java program which illustrates the usage of Comparator Interface.
