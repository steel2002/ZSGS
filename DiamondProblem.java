 public class DiamondProblem {
   public static void main(String[] args) {
        
  }
    
}

// class A {
//     void Close(){
//         System.out.println("Close method in class A");
//     }
// }

// class B extends A {
//     @Override
//     void Close(){
//         System.out.println("Close method in class B");
//     }
// }

// class C extends A {
//     @Override
//     void Close(){
//         System.out.println("Close method in class C");
//     }
// }

// class D implements  C {
//     @Override
//  void Close() {
//         System.out.println("Close method in class D");
//     }
//     public static void main(String[] args) {
//         D d = new D();
//         d.Close(); 
//     }
//     }


// Run time polymorphism example

class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

class Main1 {
    public static void main(String... args) {
        Animal myDog = new Dog(); // Upcasting
        myDog.sound(); 
        Animal myCat = new Cat(); // Upcasting
        myCat.sound();
        
    }
}

// compile-time polymorphism example

class Calculate {
    int add(int a,int b){
        return a +b;
    }
     double add(double a, double b){
        return a + b;
     }
     String add (String a ,String b ,String c){
        return a + b + c ;
     }

    
}
 class Main2 {
        
        public static void main(String... args) {

            Calculate calc = new Calculate();

            System.out.println("Sum of two integers: " + calc.add(10, 10));
            System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));
            System.out.println("Concatenation of three strings: " + calc.add("Hello, ", "World", "!"));
            
            
        }
     }