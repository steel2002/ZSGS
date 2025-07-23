public class Multi {
    public static void main(String... args) {

         C obj = new C();
        
    }
    
}
class A {
    int x;
    void readX(){}
    void showX(){}
}

interface B {
    
    void showX();
}
class C extends A implements B {
       public void showX() {
           // Implementation of showX
           System.out.println("showX in C");
       }
       // Optionally override readX if needed
       @Override
       void readX() {
           // Implementation of readX
           System.out.println("readX in C");
       }
}
