// Day-4 Assignment Questions:

/*  1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
// ---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
// ---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
// Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
// Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
// Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike. */

import java.util.Scanner;

public class DAY4 {
    public static void main(String...args) {
}
}




class Vehicle {
    double mileage;
    double price;

  
}

class Car extends Vehicle {
    double Cost;
    int warrantyYears;
    int seatingCapacity;
    String fuelType;

   
}

class Audi extends Car {
    String model;

   
}



class Ford extends Car {
    String model;

}

class Bike extends Vehicle {
    int Cylinders;
    int Gears;
    String coolingType;
    String wheelType;
    double fuelTankSize;

   
}

class Bajaj extends Bike {
    String makeType;

}

class TVS extends Bike {
    String makeType;

}

class Moter {

    public static void displayCarInfo(String model, double Cost,int warrantyYears,int seatingCapacity,String fuelType, double mileage, double price) {

        
		System.out.println("\t\t\t "+model+"\t\t\t "+price+"\t\t\t "+Cost+"\t\t\t "+warrantyYears+"\t\t\t "+seatingCapacity+"\t\t\t "+fuelType+"\t\t\t "+mileage);
        return;
    }


    public static void displayBikeInfo(String makeType,int Cylinders,int Gears,String coolingType,String wheelType,double fuelTankSize,double mileage,double price) {

        System.out.println("\t\t\t "+makeType+"\t\t\t "+price+"\t\t\t "+Cylinders+"\t\t\t "+Gears+"\t\t\t "+coolingType+"\t\t\t "+wheelType+"\t\t\t "+fuelTankSize+"\t\t\t "+mileage);
        return;

    }

    public static void main(String... args) {
    
         Scanner scan = new Scanner(System.in);


         Audi a = new Audi();
         Ford f = new Ford();
         Bajaj b = new Bajaj();
         TVS t = new TVS();

     
        a.model = "Audi A4";
        a.Cost = 500000;
        a.warrantyYears = 5;
        a.seatingCapacity=4;
        a.fuelType ="Petrol";
        a.mileage = 15.0;
        a.price = 550000;

   
        f.model ="Ford Mustang";
        f.Cost =600000;
        f.warrantyYears =3;
        f.seatingCapacity =4;
        f.fuelType ="Petrol";
        f.mileage =12.0;
        f.price =650000;

      

        b.makeType ="Bajaj Pulsar";
        b.Cylinders =1;
        b.Gears =5;
        b.coolingType ="Air";
        b.wheelType ="Alloys";
        b.fuelTankSize =15.0;
        b.mileage =40.0;
        b.price =80000;

      
        t.makeType ="TVS Apache";
        t.Cylinders =1;
        t.Gears =5;
        t.coolingType ="Air";
        t.wheelType ="Spokes";
        t.fuelTankSize =12.0;
        t.mileage =45.0;
        t.price =70000;


        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Display Audi Car Info");
            System.out.println("2. Display Ford Car Info");
            System.out.println("3. Display Bajaj Bike Info");
            System.out.println("4. Display TVS Bike Info");
            System.out.println("5. Exit");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    displayCarInfo(a.model, a.Cost, a.warrantyYears, a.seatingCapacity, a.fuelType, a.mileage, a.price);
                    break;
                case 2:
                    displayCarInfo(f.model, f.Cost, f.warrantyYears, f.seatingCapacity, f.fuelType, f.mileage, f.price);
                    break;
                case 3:
                    displayBikeInfo(b.makeType, b.Cylinders, b.Gears, b.coolingType, b.wheelType, b.fuelTankSize, b.mileage, b.price);
                    break;
                case 4:
                    displayBikeInfo(t.makeType, t.Cylinders, t.Gears, t.coolingType, t.wheelType, t.fuelTankSize, t.mileage, t.price);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        }
     }

}


/*
2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
*/

class TwoD {
    private int x;
    private int y;

    public TwoD() {
        System.out.println("TwoD default constructor");
    }

    public  TwoD(int x, int y) {
      
        System.out.println("TwoD constructor with two arguments");
        setValue(x,y);
    }
    public void setValue(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

class ThreeD extends TwoD {
    private int z;

     ThreeD() {
        super();
        System.out.println("ThreeD default constructor");
    }

 ThreeD(int x, int y, int z) {
        super(x, y);
        System.out.println("ThreeD constructor with three arguments");
        this.z = z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public int getZ() {
        return z;
    }

    public void distance(ThreeD three) {
        
      int a=this.getX()-three.getX();
      int b=this.getY()-three.getY();
      int c=this.getZ()-three.getZ();

      System.out.println(" " +Math.sqrt(a*a+b*b+c*c));

    }
}

class Main {
    public static void main(String... args) {

        ThreeD three = new ThreeD(20,30,40);

         three.distance(three);

        three.setValue(10,20);

        three.setZ(30);

      
        
    }
}

// 3. A class Point is declared as follows:
// class Point{
// public:
// Point(){int=0;int=0;} //default constructor
// void setPoint(int,int); //set coordinates
// int getX() const {return x;} //get x coordinates
// int getY() const {return y;} //get y coordinates
// void printPoint(); // print (x,y) coordinates
// private int x;
// private int y;
// };
// Write the implementation of the class Point in the same file.
// Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
// Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
// Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
// Enter x: 2
// Enter y: 2
// Enter radius: 1
// Circle center is (2,2)
// Radius is 1
// Area is 3.14

class Point{
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;

        System.out.println("The default constructor value " + this.x + " " + this.y);
    }

    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
}

// 4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.

class A {
    void display() {
        System.out.println("A");
    }
}

class B {
    void display() {
        System.out.println("B");
    }
}


// class C extends A, B { 
//     public static void main(String[] args) {
//         C obj = new C();
//         obj.display();
//     }
// }

// Multiple inheritance using classes is not allowed in Java.





/*
5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon 
inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the 
same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same 
method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.
*/


class Shape {
    public void display() {
        System.out.println("This is a shape");
    }
    
}

class Polygon extends Shape {

    public void display(){
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Shape {
    public void display(){
        System.out.println("Rectangle is a Polygon");
    }
}
class Triangle extends Shape {
    public void display(){
        System.out.println("Triangle is a Polygon");
    }
}
class Square extends Shape {
    public void display(){
        System.out.println("Square is a Triangle");
    }
}

class ShapeDemo {
    public static void main(String[] args) {

        Shape s = new Shape();
        s.display();

        Polygon p = new Polygon();
        p.display();

        Rectangle r = new Rectangle();
        r.display();

        Triangle t = new Triangle();
        t.display();

        Square sq = new Square();
        sq.display();
    }
}

