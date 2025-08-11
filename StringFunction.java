
// Length

public class StringFunction {
    public static void main(String[] args) {

        String text ="Hello World";

        int len =text.length();
        System.out.println("Print the length :" +len);
        
    }
    
}

// CharAt()

class StringCharAtExample {
    public static void main(String[] args) {
        String word = "Java";
        char ch = word.charAt(2);
        System.out.println("Character at index 2: " + ch);
    }
}

// SubString()

 class StringSubstringExample {
    public static void main(String[] args) {
        String text = "Programming";
        String sub = text.substring(3, 7);
        System.out.println("Substring from 3 to 7: " + sub);
    }
}

// Concat()
class StringConcatExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String result = s1.concat(" " + s2);
        System.out.println(result);
    }
}

// Equals()

 class StringEqualsExample {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a.equals(b)); 
        System.out.println(a==c); 
    }
}

// EqualsIgnoreCase()

class StringEqualsIgnoreCaseExample {
    public static void main(String[] args) {
        String a = "java";
        String b = "JAVA";
        System.out.println(a.equalsIgnoreCase(b));
    }
}

//CompareTo()

 class StringCompareToExample {
    public static void main(String[] args) {
        String a = "Apple";
        String b = "Banana";
        System.out.println(a.compareTo(b));
    }
}

// contains()

class StringContainsExample {
    public static void main(String[] args) {
        String text = "Java programming";
        System.out.println(text.contains("program"));   //Check Value inside the class
    }
}

//  indexOf()

 class StringIndexOfExample {
    public static void main(String[] args) {
        String text = "banana";
        System.out.println(text.indexOf("na"));
    }
}

// LastIndex()

class StringLastIndexOfExample {
    public static void main(String[] args) {
        String text = "bananana";
        System.out.println(text.lastIndexOf("na"));
    }
}


