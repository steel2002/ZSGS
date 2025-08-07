

//---------------------------------------------------DAY8----------------------------------------------------------------

// 1. Illustrates with an example of using Singleton class.

import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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






class Main{
    public static void main(String[] args) {


        
    }
}












