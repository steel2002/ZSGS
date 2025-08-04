import java.io.*;

class Student implements Serializable {
    // private static final long serialVersionUID = 1L;
    String name;
    int age;
}

public class Demo {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.name = "Selvin";
        s.age = 22;

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
        out.writeObject(s);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
        Student s2 = (Student) in.readObject();
        in.close();

        System.out.println(s2.name + " " + s2.age);
    }
}