

//---------------------------------------------------DAY8----------------------------------------------------------------

// 1. Illustrates with an example of using Singleton class.

import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.GregorianCalendar;
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

class Student
{
	String name;
	int age;

	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "Student [ Name: "+this.name+" ,Age: "+this.age+" ]";
	}
}

class Demo
{
	public static void main(String[]args)
	{
		Comparator<Student>cmp = new Comparator<Student>()
		{
			public int compare(Student i, Student j)
			{
				return i.age - j.age;                            
			}
		};

		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student("java", 25));
		studs.add(new Student("python", 15));
		studs.add(new Student("javascript", 24));
		Collections.sort(studs, cmp);
			
		for(Student s: studs)
		{
			System.out.println(s);
		}
	}
}

// 3. Develop a Java program which illustrates the usage of Comparable Interface.

class Student1 implements Comparable<Student1>
{
	String name;
	int age;

	public Student1(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "Student [ Name: "+this.name+" ,Age: "+this.age+" ]";
	}
	
	public int compareTo(Student1 that)
	{
		return this.age - that.age;
	}
}

class Demo1
{
	public static void main(String[]args)
	{

		List<Student1> studs = new ArrayList<Student1>();
		studs.add(new Student1("java", 25));
		studs.add(new Student1("python", 15));
		studs.add(new Student1("sql", 24));

		Collections.sort(studs);
	
		for(Student1 s: studs)
		{
			System.out.println(s);
		}
	}
}

// 4. Get some strings through the command-line prompt and use an array to store and display them.

class CommandLine{
	public static void main(String[] args) {
		
		int n =Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);

		int sum= n+b;

		System.out.println("Sum of Element :" + sum);
	}
}

// class GregorianCalender{
// 	public static void main(String[] args) {

// 		GregorianCalender g =new GregorianCalender();

// 		GregorianCalender g1 = (GregorianCalender)g.clone();
		
// 		System.out.println(g.getClass());
// 		System.out.println(g1.getClass());
		
// 	}
// }

//  5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.

class  Address {
	String City;

	 Address (String  City){
		this.City= City;
	 }
}

class Person implements Cloneable {
	String name;
	 Address address;

	 Person(String name, Address address){
		this.name=name;
		this.address=address;
	 }
    protected Object clone() throws CloneNotSupportedException {
	return (Person) super.clone();
}
}

class Main {
	public static void main(String[] args) {
		
		try {

			Address a = new Address("TVL");
			Person p1 = new Person("Steel", a);
			Person p2 = (Person) p1.clone();

			System.out.println("Name :" +p1.name+ "City :"+p1.address.City+"......");


			
		} catch (Exception e) {

			System.out.println("" +e.getMessage());
		
		}
	}
}

// 6. Develop a Java program to illustrate pass-by-value.

class CallByValue {

	static void changeValue(int num){
		System.out.println("Inside Value Pass :"+ num);
		num=100;
		System.out.println("Before Value :" + num);
	}
	public static void main(String[] args) {
		int x =50;
		changeValue(x);
		System.out.println("After Value :" + x);

		
	}
}
// 7. Develop a Java program to illustrate the usage of toString() method.















