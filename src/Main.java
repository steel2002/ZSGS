import java.util.*;


// a. to create a new array list, add some colours (string) and print out the collection.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Blue");
        System.out.println("Colours " + colours);


        // b. to iterate through all elements in an array list.


        for(String demo : colours){
            System.out.println("Iterate :" +demo);
        }


        // c. to insert an element into the array list at the first position.

        colours.add("Brown");
        colours.add("White");
        colours.set(0,"Yellow");

        System.out.println("Set The Value :" + colours);


        // d. to retrieve an element (at a specified index) from a given array list.

        colours.get(1);

        System.out.println("GetIndex Value :" +colours.get(1));


        // e. to update a specific array element by given element.


        colours.set(2,"Green");

        System.out.println("Update Value :" +colours.set(2,"Green"));


        // f. to remove the third element from an array list.

        System.out.println("Remove the value :" +colours.remove(3));


        // g. to search an element in an array list.

        System.out.println("Search The Element :"+colours.indexOf("Blue"));




    }
}
// h. to sort a given array list.

class Sort {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("selvin");
        s.add("david");
        s.add("Amutha");
        s.add("Ramesh");
        s.add("Gopal");

        System.out.println("Before" +s);

        Collections.sort(s);

        System.out.println("After" +s);
    }
}

// i. to copy one array list into another.

class Clone {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Ford");
        cars.add("MG");
        cars.add("Volvo");

        System.out.println("Original "+cars);

        ArrayList cars1 =(ArrayList) cars.clone();

        System.out.println("Copy "+ cars1);

    }
}

// j. to shuffle elements in an array list.

class Shuffle {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("Java");
        s.add("C++");
        s.add("c");
        s.add("JS");
        s.add("React");
        s.add("Html");
        s.add("css");

        System.out.println("before " +s);

        Collections.shuffle(s);

        System.out.println("After "+s);
    }
}

// 2. Write a Java program to-------------------------------------------------------------------------------------------

class  Linkedlist {
    public static void main(String[] args) {

        // a. append the specified element to the end of a linked list.

        LinkedList<Integer> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(60);
        l.add(70);
        l.add(88);

        System.out.println("add the Value :" +l);

    }
}

// b. iterate through all elements in a linked list.

class Iterate {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(60);
        l.add(88);

        for(int c : l){
            System.out.println("Iterate the value " +c);
        }
    }
    }

    // c. iterate through all elements in a linked list starting at the specified position.

    class Position {
        public static void main(String[] args) {

            LinkedList<Integer> l = new LinkedList<>();

            l.add(10);
            l.add(20);
            l.add(30);
            l.add(60);
            l.add(88);

            int starting =2;

            ListIterator<Integer> listIterator = l.listIterator(starting);

            System.out.println("Elements from index " + starting);

            while (listIterator.hasNext()) {
                System.out.println(listIterator.next());
            }
        }
    }

    // d. iterate a linked list in reverse order.

class ReverseOrder {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(60);
        l.add(88);

        for(int i=l.size()-1;i>=0;i--){
            System.out.println("Reverse Orders : "+ l.get(i));
        }

    }
}

//  insert the specified element at the specified position in the linked list.

class PositionList {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(60);
        l.add(88);
        System.out.println("specified element " + l);
        l.set(0,100);
        System.out.println("Before" +  l);
    }
}

// f. insert elements into the linked list at the first and last position.
class InsertAtFirstAndLast{
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(60);
        l.add(88);
        l.addFirst(100);
        l.addLast(200);

        System.out.println("Insert element First and last Position :" +l);
    }
}

// g. insert the specified element at the front of a linked list.

class InsertFront {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(60);
        l.add(88);
        l.addFirst(100);

        System.out.println("InsertFront Elements :" +l);

    }
}

// h. insert the specified element at the end of a linked list.

class InsertEnd {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(60);
        l.add(88);
        l.addLast(1000);

        System.out.println("Insert End Position " +l);
    }
}

// i. insert some elements at the specified position into a linked list.

class InsertSome {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(60);
        l.add(88);
        System.out.println("Before "+l);
        l.add(0,1);

        l.add(l.size(),0);

        System.out.println("After "+l);

    }
}

// j. get the first and last occurrence of the specified elements in a linked list.

class GetFirstAndLast {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(60);
        l.add(88);

        System.out.println("Before value :"+l);

        System.out.println("After First Value:"+ l.getFirst());
        System.out.println("After Last Value " +l.getLast());

    }
}


// 3. Write a Java program to-------------------------------------------------------------------------------------------


// a. append the specified element to the end of a hash set.

class AddElement {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);
        System.out.println("Append The Element :"+h);
    }
}

// b. iterate through all elements in a hash list.
class IterateHas{
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);

        for(Integer c : h ){
            System.out.println("Interate the Value :" +c);
        }

    }
}
// c. get the number of elements in a hash set.

class GetNumber {
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);

        // int size = h.size();

        System.out.println("GetNumber " +h.size());
    }
}


// d. empty the hash set.


class Empty {
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);

        System.out.println("Before "+ h);

        h.clear();

        System.out.println("After " +h);

    }
}
// e. test a hash set is empty or not.

class IsEmpty {
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();

        System.out.println("Is Empty check" + h.isEmpty());

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);
        System.out.println(" Is Empty value check :" +h.isEmpty());

    }
}

// f. clone a hash set to another hash set

class LinkListClone {
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);
        System.out.println("Original value "+h);

        HashSet h1 =(HashSet) h.clone();

        System.out.println("After clone value " +h1);
    }
}

// g. convert a hash set to an array.


class Convert {
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);
        System.out.println("Before :"+h);

         int arr[] = new int[h.size()];
         int i=0;

         for(Integer val : h) {
             arr[i++] = val;
         }
             for (int c : arr) {
                 System.out.println(c);
             }
    }
    }

    // h. convert a hash set to a tree set.

class ConvertTreeSet{
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);

        System.out.println("Before :"+h);

        TreeSet<Integer> HashsettoTreeset = new TreeSet<>(h);

        System.out.println("Covert TreeSet" +HashsettoTreeset);

    }
}

// i. convert a hash set to a List/ArrayList.

class ConvertArrayList{
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);

        System.out.println("Before :"+h);

        ArrayList<Integer> HashsettoArrayList = new ArrayList<>(h);

        System.out.println("Convert to ArrayList :"+ HashsettoArrayList);

    }
}

// j. compare two hash set\

class Compare {
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);

        System.out.println("Before :"+h);


        HashSet<Integer> h1 = new HashSet<>();

        h1.add(10);
        h1.add(20);
        h1.add(30);
        h1.add(40);
        h1.add(50);
       //  h1.add(60);

        System.out.println("Before :"+h1);

        boolean check = h.equals(h1);

        System.out.println("Is Compare :" +check);

    }
}

// 4. Write a Java program to-----------------------------------------------------------------------------------------
