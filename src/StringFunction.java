public class StringFunction {
    public static void main(String[] args) {
        
    }
    
}

//------------------------------------String Functions----------------------------------------

// Method 1: charAt(int index)


class DemoCharAt {
    public static void main(String[] args) {
        String str = "Hello";

        // Get character at index 0
        System.out.println("Char at 0: " + str.charAt(0));

        // Get character at index 4
        System.out.println("Char at 4: " + str.charAt(4));

        // Example: loop through all characters
        for(int i=0; i<str.length(); i++) {
            System.out.println("Index " + i + " → " + str.charAt(i));
        }
    }
}


// Method 2: length()

class DemoLength {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " Java Programming ";
        String s3 = "";

        System.out.println("Length of '" + s1 + "' = " + s1.length());
        System.out.println("Length of '" + s2 + "' = " + s2.length());
        System.out.println("Length of empty string = " + s3.length());

        // Using length in a loop
        for(int i=0; i<s1.length(); i++) {
            System.out.println("Index " + i + " → " + s1.charAt(i));
        }
    }
}


// Method 3: substring(int beginIndex)

class DemoSubstring1 {
    public static void main(String[] args) {
        String str = "HelloWorld";

        // Substring starting from index 5
        String sub1 = str.substring(5);
        System.out.println("Substring from 5: " + sub1);

        // Substring starting from index 0 (full string)
        String sub2 = str.substring(0);
        System.out.println("Substring from 0: " + sub2);

        // Substring starting from last index
        String sub3 = str.substring(str.length()-1);
        System.out.println("Substring last char: " + sub3);
    }
}


// Method 4: substring(int beginIndex, int endIndex)


class DemoSubstring2 {
    public static void main(String[] args) {
        String str = "HelloWorld";

        // Substring from index 0 to 5 (not including 5)
        String sub1 = str.substring(0, 5);
        System.out.println("Substring 0 to 5: " + sub1);

        // Substring from index 5 to 10
        String sub2 = str.substring(5, 10);
        System.out.println("Substring 5 to 10: " + sub2);

        // Substring from middle
        String sub3 = str.substring(3, 8);
        System.out.println("Substring 3 to 8: " + sub3);
    }
}


// Method 5: equals(String another)

class DemoEquals {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";

        System.out.println("s1 equals s2: " + s1.equals(s2)); // true
        System.out.println("s1 equals s3: " + s1.equals(s3)); // false

        // Comparing with new String object
        String s4 = new String("Java");
        System.out.println("s1 equals s4: " + s1.equals(s4)); // true
    }
}


// Method 6: equalsIgnoreCase(String another)

class DemoEqualsIgnoreCase {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        String s3 = "JAVA";
        String s4 = "Python";

        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2)); // true
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3)); // true
        System.out.println("s1 equalsIgnoreCase s4: " + s1.equalsIgnoreCase(s4)); // false
    }
}


// Method 7: compareTo(String another)

class DemoCompareTo {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        String s3 = "apple";

        System.out.println("s1 vs s2: " + s1.compareTo(s2)); // negative
        System.out.println("s2 vs s1: " + s2.compareTo(s1)); // positive
        System.out.println("s1 vs s3: " + s1.compareTo(s3)); // 0
    }
}


// Method 8: compareToIgnoreCase(String another)

class DemoCompareToIgnoreCase {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "apple";
        String s3 = "Banana";

        System.out.println("s1 vs s2: " + s1.compareToIgnoreCase(s2)); // 0
        System.out.println("s1 vs s3: " + s1.compareToIgnoreCase(s3)); // negative
        System.out.println("s3 vs s1: " + s3.compareToIgnoreCase(s1)); // positive
    }
}


// Method 9: concat(String str)

class DemoConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        // Using concat()
        String result1 = s1.concat(" ").concat(s2);
        System.out.println("Using concat: " + result1);

        // Using + operator
        String result2 = s1 + " " + s2;
        System.out.println("Using + operator: " + result2);

        // Multiple concat
        String result3 = s1.concat(" Java").concat(" Programming");
        System.out.println("Multiple concat: " + result3);
    }
}


// Method 10: contains(CharSequence seq)

class DemoContains {
    public static void main(String[] args) {
        String str = "Java Programming Language";

        System.out.println("Contains 'Java'? " + str.contains("Java"));     // true
        System.out.println("Contains 'java'? " + str.contains("java"));     // false (case-sensitive)
        System.out.println("Contains 'Programming'? " + str.contains("Programming")); // true
        System.out.println("Contains 'Python'? " + str.contains("Python")); // false
    }
}


// Method 11: startsWith(String prefix)

class DemoStartsWith {
    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println("Starts with 'Hello'? " + str.startsWith("Hello")); // true
        System.out.println("Starts with 'World'? " + str.startsWith("World")); // false
        System.out.println("Starts with 'H'? " + str.startsWith("H"));         // true
        System.out.println("Starts with 'h'? " + str.startsWith("h"));         // false (case-sensitive)
    }
}


// Method 12: endsWith(String suffix)

class DemoEndsWith {
    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println("Ends with 'World'? " + str.endsWith("World")); // true
        System.out.println("Ends with 'Hello'? " + str.endsWith("Hello")); // false
        System.out.println("Ends with 'd'? " + str.endsWith("d"));         // true
        System.out.println("Ends with 'D'? " + str.endsWith("D"));         // false (case-sensitive)
    }
}

// Method 13: isEmpty()

class DemoIsEmpty {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "Hello";
        String s3 = " ";

        System.out.println("s1 is empty? " + s1.isEmpty()); // true
        System.out.println("s2 is empty? " + s2.isEmpty()); // false
        System.out.println("s3 is empty? " + s3.isEmpty()); // false (contains space)
    }
}

// Method 14: isBlank()

class DemoIsBlank {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "   ";
        String s3 = "Hello";

        System.out.println("s1 is blank? " + s1.isBlank()); // true
        System.out.println("s2 is blank? " + s2.isBlank()); // true (only spaces)
        System.out.println("s3 is blank? " + s3.isBlank()); // false
    }
}


// Method 15: indexOf(String str)


class DemoIndexOf {
    public static void main(String[] args) {
        String str = "Java Programming Language";

        System.out.println("Index of 'Java': " + str.indexOf("Java"));       // 0
        System.out.println("Index of 'Programming': " + str.indexOf("Programming")); // 5
        System.out.println("Index of 'Language': " + str.indexOf("Language"));       // 16
        System.out.println("Index of 'Python': " + str.indexOf("Python"));   // -1 (not found)
    }
}

// Method 16: indexOf(String str, int fromIndex)

class DemoIndexOfFrom {
    public static void main(String[] args) {
        String str = "Java Programming Java Language";

        // Find first "Java"
        int first = str.indexOf("Java");
        System.out.println("First 'Java': " + first);

        // Find "Java" after index 5
        int second = str.indexOf("Java", 5);
        System.out.println("Second 'Java': " + second);

        // Find "Java" after index 20
        int third = str.indexOf("Java", 20);
        System.out.println("Third 'Java': " + third);

        // Search for non-existing substring
        int notFound = str.indexOf("Python", 0);
        System.out.println("Python found at: " + notFound);
    }
}


//Method 17: lastIndexOf(String str)


class DemoLastIndexOf {
    public static void main(String[] args) {
        String str = "Java Programming Java Language Java";

        // Find last occurrence of "Java"
        int last = str.lastIndexOf("Java");
        System.out.println("Last 'Java': " + last);

        // Find last occurrence of "Language"
        int lang = str.lastIndexOf("Language");
        System.out.println("Last 'Language': " + lang);

        // Substring not found
        int python = str.lastIndexOf("Python");
        System.out.println("Last 'Python': " + python);
    }
}

// Method 18: lastIndexOf(String str, int fromIndex)

class DemoLastIndexOfFrom {
    public static void main(String[] args) {
        String str = "Java Programming Java Language Java";

        // Find last "Java" before index 25
        int result1 = str.lastIndexOf("Java", 25);
        System.out.println("Last 'Java' before index 25: " + result1);

        // Find last "Java" before index 10
        int result2 = str.lastIndexOf("Java", 10);
        System.out.println("Last 'Java' before index 10: " + result2);

        // Not found example
        int result3 = str.lastIndexOf("Python", 30);
        System.out.println("Last 'Python' before index 30: " + result3);
    }
}


// Method 19: toUpperCase()


class DemoToUpperCase {
    public static void main(String[] args) {
        String str1 = "java programming";
        String str2 = "Hello World 123";

        String upper1 = str1.toUpperCase();
        String upper2 = str2.toUpperCase();

        System.out.println("Original: " + str1);
        System.out.println("Uppercase: " + upper1);

        System.out.println("Original: " + str2);
        System.out.println("Uppercase: " + upper2);
    }
}

// Method 20: toLowerCase()

class DemoToLowerCase {
    public static void main(String[] args) {
        String str1 = "JAVA PROGRAMMING";
        String str2 = "Hello World 123";

        String lower1 = str1.toLowerCase();
        String lower2 = str2.toLowerCase();

        System.out.println("Original: " + str1);
        System.out.println("Lowercase: " + lower1);

        System.out.println("Original: " + str2);
        System.out.println("Lowercase: " + lower2);
    }
}


// Method 21: trim()

class DemoTrim {
    public static void main(String[] args) {
        String str1 = "   Hello World   ";
        String str2 = "Java   Programming";

        String trimmed1 = str1.trim();
        String trimmed2 = str2.trim();

        System.out.println("Original: '" + str1 + "'");
        System.out.println("After trim: '" + trimmed1 + "'");

        System.out.println("Original: '" + str2 + "'");
        System.out.println("After trim: '" + trimmed2 + "'");
    }
}


// Method 22: strip()

class DemoStrip {
    public static void main(String[] args) {
        String str1 = "   Hello World   ";
        String str2 = "\u2005  \u2005Java Programming\u2005   "; // Unicode spaces

        String result1 = str1.strip();
        String result2 = str2.strip();

        System.out.println("Original: '" + str1 + "'");
        System.out.println("After strip: '" + result1 + "'");

        System.out.println("Original with Unicode spaces: '" + str2 + "'");
        System.out.println("After strip: '" + result2 + "'");
    }
}

// Method 23: stripLeading(Front)


class DemoStripLeading {
    public static void main(String[] args) {
        String str1 = "   Hello World   ";
        String str2 = "\u2005\u2005Java Programming   "; // Unicode leading spaces

        String result1 = str1.stripLeading();
        String result2 = str2.stripLeading();

        System.out.println("Original: '" + str1 + "'");
        System.out.println("After stripLeading: '" + result1 + "'");

        System.out.println("Original with Unicode leading spaces: '" + str2 + "'");
        System.out.println("After stripLeading: '" + result2 + "'");
    }
}


// Method 24: stripTrailing(End)

class DemoStripTrailing {
    public static void main(String[] args) {
        String str1 = "   Hello World   ";
        String str2 = "   Java Programming\u2005\u2005  "; // Unicode trailing spaces

        String result1 = str1.stripTrailing();
        String result2 = str2.stripTrailing();

        System.out.println("Original: '" + str1 + "'");
        System.out.println("After stripTrailing: '" + result1 + "'");

        System.out.println("Original with Unicode trailing spaces: '" + str2 + "'");
        System.out.println("After stripTrailing: '" + result2 + "'");
    }
}

// Method 25: replace(char oldChar, char newChar)


class DemoReplaceChar {
    public static void main(String[] args) {
        String str = "JavA Programming";

        // Replace 'a' with 'o'
        String result1 = str.replace('a', 'o');

        // Replace 'm' with 'n'
        String result2 = str.replace('m', 'n');

        // Replace character not found
        String result3 = str.replace('x', 'y');

        System.out.println("Original: " + str);
        System.out.println("Replace 'a' -> 'o': " + result1);
        System.out.println("Replace 'm' -> 'n': " + result2);
        System.out.println("Replace 'x' -> 'y': " + result3);
    }
}

// 🔹 Method 26: replace(CharSequence target, CharSequence replacement)


class DemoReplaceSubstring {
    public static void main(String[] args) {
        String str = "I like Java. Java is powerful.";

        // Replace all "Java" with "Python"
        String result1 = str.replace("Java", "Python");

        // Replace "powerful" with "awesome"
        String result2 = str.replace("powerful", "awesome");

        // Replace substring not found
        String result3 = str.replace("C++", "Go");

        System.out.println("Original: " + str);
        System.out.println("Replace 'Java' -> 'Python': " + result1);
        System.out.println("Replace 'powerful' -> 'awesome': " + result2);
        System.out.println("Replace 'C++' -> 'Go': " + result3);
    }
}

// 🔹 Method 27: replaceFirst(String regex, String replacement)


class DemoReplaceFirst {
    public static void main(String[] args) {
        String str = "Java is fun. Java is powerful. Java is everywhere.";

        // Replace first "Java" with "Python"
        String result1 = str.replaceFirst("Java", "Python");

        // Replace first word (regex: \w+)
        String result2 = str.replaceFirst("\\w+", "Replaced");

        // Replace first occurrence of "is"
        String result3 = str.replaceFirst("is", "was");

        System.out.println("Original: " + str);
        System.out.println("Replace first 'Java' -> 'Python': " + result1);
        System.out.println("Replace first word -> 'Replaced': " + result2);
        System.out.println("Replace first 'is' -> 'was': " + result3);
    }
}
