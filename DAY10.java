import java.util.*;
import java.util.ArrayList;

// a. to create a new array list, add some colours (string) and print out the collection.
public class DAY10 {
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

             System.out.println(""+val);
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

        System.out.println("After :"+h1);

        boolean check = h.equals(h1);

        System.out.println("Is Compare :" +check);

    }
}

// 4. Write a Java program to---------------------------------------4--------------------------------------------------

// a. create a new tree set, add some colours (string) and print out the tree set.

class MyTreeSetDemo {
    public static void main(String[] args) {

        TreeSet<String> t = new TreeSet<>();

          t.add("Red");
          t.add("Blue");
          t.add("brown");
        System.out.println("TreeSet " +t);
    }
}


// b. iterate through all elements in a tree set.


class IterateTreeset {
    public static void main(String[] args) {
        
        TreeSet<String> t = new TreeSet<>();

          t.add("Red");
          t.add("Blue");
          t.add("brown");

          for(String c :t){
            System.out.println(c);
          }
        
    }

}

// c. add all the elements of a specified tree set to another tree set.

class Add{
    public static void main(String[] args) {
           TreeSet<String> t = new TreeSet<>();

          t.add("Red");
          t.add("Blue");
          t.add("brown");

          System.out.println("Before" +t);

          TreeSet<String> t1 = new TreeSet<>(t);

          System.out.println("After" +t1);
    }

}

// d. create a reverse order view of the elements contained in a given tree set.

class ReverseTreeSet{
    public static void main(String[] args) {
          TreeSet<Integer> t = new TreeSet<>();

          t.add(10);
          t.add(20);
          t.add(30);
          t.add(40);
         
          System.out.println("Before "+t);

         NavigableSet<Integer>  n = t.descendingSet();

         System.out.println("Revers order :" + n);

    }
}

// e. get the first and last elements in a tree set.


class FirstAndLast {
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>();

          t.add(10);
          t.add(20);
          t.add(30);
          t.add(40);
          

          int first=t.first();
          int last = t.last();
         
          System.out.println("First element :" +first);
          System.out.println("Last Element :" +last);

         

        
    }
    
}

class MyArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<String> colours = new ArrayList<>();
         colours.add("Blue");
          colours.add("Red");
           System.out.println("colours" + colours);

    }
}

class CloneTreeset{
    public static void main(String[] args) {
         TreeSet<Integer> t = new TreeSet<>();

          t.add(10);
          t.add(20);
          t.add(30);
          t.add(40);

          System.out.println("Normal :"+t);

          TreeSet<Integer> t1 = (TreeSet) t.clone();

          System.out.println("Clone "+t1);
        
    }
}
// g. get the number of elements in a tree set.

class GetElement {
    public static void main(String[] args) {

         TreeSet<Integer> t = new TreeSet<>();

          t.add(10);
          t.add(20);
          t.add(30);
          t.add(40);

          System.out.println("GetThe Element "+t.size());
        
    }
}

// h. compare two tree sets.

class CompareTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>();

          t.add(10);
          t.add(20);
          t.add(30);
          t.add(40);

          System.out.println("T"+t);

           TreeSet<Integer> t1 = new TreeSet<>();

          t1.add(10);
          t1.add(20);
          t1.add(30);
          t1.add(40);

          System.out.println("T1" +t1);

          boolean iscomper =t.equals(t1);

          System.out.println("IsComper Value :" +iscomper);


        
    }

}

// i. find the numbers less than 7 in a tree set.

class LessThen {
    public static void main(String[] args) {

         TreeSet<Integer> t = new TreeSet<>();

          t.add(1);
          t.add(2);
          t.add(3);
          t.add(40);
          
         for( int num : t){
            if(num <7){
                System.out.println("" + num);
            } else {
                break;
            }
         }
        
    }
}

// j. get the element in a tree set which is greater than or equal to the given element.

class TreeSetDemo1 {
    public static void main(String[] args) {

        
         TreeSet<Integer> t = new TreeSet<>();

          t.add(1);
          t.add(2);
          t.add(3);
          t.add(40);

           int target = 4;

        Integer result = t.ceiling(target);    // Check greater equal 

        if (result != null) {
            System.out.println("Element greater than or equal to " + target + ": " + result);
        } else {
            System.out.println("No element greater than or equal to " + target);
        
    }
}
}

//  k. get the element in a tree set which is less than or equal to the given element

class TreeSetDemo2{
    public static void main(String[] args) {

         TreeSet<Integer> t = new TreeSet<>();

          t.add(1);
          t.add(2);
          t.add(3);
          t.add(40);

          int target =4;

          Integer reault = t.floor(target);

          if(reault != null){
            System.out.println("Element Less than or equal to " + target + " :" + reault);
          } else {
             System.out.println("No element greater than or equal to " + target);
          }
        
    }
}

// l. get the element in a tree set which is strictly greater than or equal to the given element.

class strictly {
    public static void main(String[] args) {
        
          TreeSet<Integer> t = new TreeSet<>();

          t.add(1);
          t.add(2);
          t.add(3);
          t.add(40);

           int target = 4;

        Integer result = t.ceiling(target);    // Check greater equal 

        if (result != null) {
            System.out.println("Element greater than or equal to " + target + ": " + result);
        } else {
            System.out.println("No element greater than or equal to " + target);
        
    }
    }
}

// m. get an element in a tree set which is strictly less than the given element.

class strictly1{
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>();

          t.add(1);
          t.add(2);
          t.add(3);
          t.add(40);

          int target =4;

          Integer reault = t.floor(target);  // Check the less Then Equal 

          if(reault != null){
            System.out.println("Element Less than or equal to " + target + " :" + reault);
          } else {
             System.out.println("No element greater than or equal to " + target);
          }
        
    }
}

// n. retrieve and remove the first element of a tree set.

class RemoveFirst{
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>();

          t.add(10);
          t.add(2);
          t.add(3);
          t.add(40);

          System.out.println("Before :"+t);

          System.out.println("After :" +t.pollFirst());

        
    }
}

// o. retrieve and remove the last element of a tree set.

class RemoveLast{
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>();

          t.add(10);
          t.add(2);
          t.add(3);
          t.add(40);

          System.out.println("Before :"+t);

          System.out.println("After :" +t.pollLast());

        
    }
}

// p. remove a given element from a tree set.

class Remove{
    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>();

          t.add(10);
          t.add(2);
          t.add(3);
          t.add(40);

          System.out.println("Before :"+t);

          t.remove(2);
          System.out.println("After :"+t);


        
    }
}


// 5. Write a Java program to,

// 1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.

class Queue {
    public static void main(String[] args) {
        PriorityQueue<String> q =new PriorityQueue<>();

        q.add("Red");
        q.add("Blue");
        q.add("Brown");

        System.out.println("Add Element :"+q);
    }
}

// 2. iterate through all elements in priority queue.

class IterateQ {
    public static void main(String[] args) {

        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        for(Integer i : q){
            System.out.println(" Iterate Element :"+i);
        }
        
    }
}

// 3. add all the elements of a priority queue to another priority queue.

class AddElementQ {
    public static void main(String[] args) {

         PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("First Eleament :"+q);

        PriorityQueue<Integer> q1 = new PriorityQueue<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

        System.out.println("Second Element :"+q1);

        q.addAll(q1);

        System.out.println("Final Value :"+q);

        
    }
}

// 4. insert a given element into a priority queue.

class Insert {
    public static void main(String[] args) {

          PriorityQueue<Integer> q1 = new PriorityQueue<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.offer(2);

        System.out.println("Insert Value :"+q1);
        
    }
}

// 5. remove all the elements from a priority queue.

class RemoveQ {
    public static void main(String[] args) {

           PriorityQueue<Integer> q1 = new PriorityQueue<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

        System.out.println(" Demo :" +q1);

        System.out.println("Remove All "+q1.removeAll(q1));

        System.out.println(" " +q1);
        
    }
}

// 6. count the number of elements in a priority queue.

class CountQ{
    public static void main(String[] args) {

          PriorityQueue<Integer> q1 = new PriorityQueue<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

        System.out.println(" Count Element :"+q1.size());
        
    }
}


// 7. compare two priority queues.

class CompareQ {
    public static void main(String[] args) {

          PriorityQueue<Integer> q1 = new PriorityQueue<>();

        q1.add(1);
        q1.add(2);
        q1.add(3);
       q1.add(4);

       PriorityQueue<Integer> q = new PriorityQueue<>(q1);


        boolean check = new HashSet<>(q1).equals(new HashSet<>(q));

         System.out.println("To Comper check :"+check);
  }

}
// 8. retrieve the first element of the priority queue.


class FirstElement {
    public static void main(String[] args) {
        
          PriorityQueue<Integer> q1 = new PriorityQueue<>();
        q1.add(0);
        q1.add(1);
        q1.add(2);
        q1.add(3);
       q1.add(4);


       System.out.println("First Element :" +q1.element());
    }
}

// 9. retrieve and remove the first element


class RemoveQu {

    public static void main(String[] args) {

          PriorityQueue<Integer> q1 = new PriorityQueue<>();
        
        q1.add(1);
        q1.add(2);
        q1.add(3);
       q1.add(4);

       int First = q1.poll();

       System.out.println("Remove First Element :"+First);

       System.out.println("After :" +q1);
        
    }
    
}

// 10. convert a priority queue to an array containing all of the elements of the queue.

class ConvertArray {
    public static void main(String[] args) {
        
        PriorityQueue<String> Q = new PriorityQueue<>();

        Q.add("java");
        Q.add("CSS");
        Q.add("HTML");
        Q.add("JS");
        Q.add("REACT");

     String [] s = new String[Q.size()];

     int i=0;

     for(String val :Q){
        s[i++]=val;

        System.out.println("Convert to Array :" +val);
     }

  }
}

// 6. Write a Java program to,----------------------------------------------------------------------------------------------------------------------

// 1. associate the specified value with the specified key in a Tree Map.

class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "One");
        t.put(2, "Two");
        System.out.println("TreeMap: " + t);
    }
}


// 2. copy a Tree Map content to another Tree Map.

class Copy {
    public static void main(String[] args) {

         TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "One");
        t.put(2, "Two");
        t.put(3, "six");
        System.out.println("TreeMap: " + t);
        
        TreeMap<Integer,String> t1 = (TreeMap<Integer, String>) t.clone();

        System.out.println("Clone the Value :"+t1);
    }
}
// 3. search a key in a Tree Map.

class SearchElement {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "One");
        t.put(2, "Two");
        t.put(3, "Six");

        int key = 2;
        if (t.containsKey(key)) {
            System.out.println("Key " + key + " found with value: " + t.get(key));
        } else {
            System.out.println("Key " + key+ " not found.");
        }
    }
}
// 4. search a value in a Tree Map.
class Search1{
    public static void main(String[] args) {

    TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "One");
        t.put(2, "Two");
        t.put(3, "Six");

        String val = "Six";

        if(t.containsValue(val)){
            System.out.println(" Value " + val +  " Found with Value :");
        } else {
            System.out.println("Value Not Found");
        }
        
    }
}
// 5. get all keys from the given a Tree Map.
class GetallKey {
    public static void main(String[] args) {

          TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "One");
        t.put(2, "Two");
        t.put(3, "Six");

        Set<Integer> key = t.keySet();

        System.out.println("GEt All keys :" +key);
        
    }
}
// 6. delete all elements from a given Tree Map.

class Delete {
    public static void main(String[] args) {

           TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "One");
        t.put(2, "Two");
        t.put(3, "Six");

        t.clear();
        System.out.println("Delete all Value : All elements deleted." +t);
        
    }
}

// 7. sort keys in Tree Map by using comparator.

class Sorted {
    public static void main(String[] args) {
    
          Comparator<Integer> com = (a,b) ->b-a;

            TreeMap<Integer, String> t = new TreeMap<>(com);
        t.put(1, "One");
        t.put(2, "Two");
        t.put(5, "ten");
        t.put(3, "Six");

        System.out.println("Normal value :" +t);

       
    }
}
// 8. get a key-value mapping associated with the greatest key and the least key in a map.

class Mapping {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "One");
        t.put(2, "Two");
        t.put(5, "Ten");
        t.put(3, "Six");

        
        Integer leastKey = t.firstKey();
        String leastValue = t.get(leastKey);
        System.out.println("Least key: " + leastKey + ", value: " + leastValue);

      
        Integer greatestKey = t.lastKey();
        String greatestValue = t.get(greatestKey);
        System.out.println("Greatest key: " + greatestKey + ", value: " + greatestValue);
    }
}


// 9. get the first (lowest) key and the last (highest) key currently in a map.

class Mapping1 {
    public static void main(String[] args) {
         TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "One");
        t.put(2, "Two");
        t.put(5, "Ten");
        t.put(3, "Six");

        Integer first = t.firstKey();
        Integer last = t.lastKey();

        System.out.println("Lowest Key :" +first);
        System.out.println("Highest Key :" +last);
        
    }
}
// 10. get a reverse order view of the keys contained in a given map.

class Revers1 {
    public static void main(String[] args) {
         TreeMap<Integer, String> t = new TreeMap<>();
        t.put(1, "One");
        t.put(2, "Two");
        t.put(5, "Ten");
        t.put(3, "Six");

        NavigableSet<Integer> revSet = t.descendingKeySet();

        System.out.println("Revers order : "+revSet);
        
    }
}

// 7. Write a Java program to,----------------------------------------------------------------------------------------------------

// 1. associate the specified value with the specified key in a HashMap.
class HashMapDemo {
    public static void main(String[] args) {
        
        HashMap<Integer ,String> h = new HashMap<>();

        h.put(1, "JAVA");
        h.put(2, "CSS");
        h.put(4, "HTML");
        h.put(3, "JS");

        System.out.println("HashMAp Add value :" +h);
    }
}

// 2. count the number of key-value (size) mappings in a map.
class CountH {
    public static void main(String[] args) {
        
        HashMap<Integer ,String> h = new HashMap<>();

        h.put(1, "JAVA");
        h.put(2, "CSS");
        h.put(4, "HTML");
        h.put(3, "JS");

        System.out.println("Count Of HashMap :" +h.size());
        
    }
}
// 3. copy all of the mappings from the specified map to another map.

class CopyH {
    public static void main(String[] args) {
           HashMap<Integer ,String> h = new HashMap<>();

        h.put(1, "JAVA");
        h.put(2, "CSS");
        h.put(4, "HTML");
        h.put(3, "JS");

        HashMap<Integer ,String> h1 = (HashMap<Integer, String>) h.clone();

       System.out.println("Copy All Element in " + h1);

       HashMap<Integer,String> h2 = new HashMap<>();
       h2.putAll(h);
       System.out.println("Copy Element in " +h2);


        
    }
}
// 4. remove all of the mappings from a map.
 class RemoveH {
    public static void main(String[] args) {

          HashMap<Integer ,String> h = new HashMap<>();

        h.put(1, "JAVA");
        h.put(2, "CSS");
        h.put(4, "HTML");
        h.put(3, "JS");

        System.out.println("Remove All Element Before  :" +h);
        h.clear();
        System.out.println("Remove All Element After :" +h);

        
    }
 }
// 5. check whether a map contains key-value mappings (empty) or not.

class IsComper {
    public static void main(String[] args) {

           HashMap<Integer ,String> h = new HashMap<>();

        h.put(1, "JAVA");
         h.put(2, "CSS");
        h.put(4, "HTML");
        h.put(3, "JS");

        System.out.println("Is map empty after " +h.isEmpty());
        
    }
}
// 6. get a shallow copy of a HashMap instance.

class Copied {
    public static void main(String[] args) {
         HashMap<Integer ,String> h = new HashMap<>();

        h.put(1, "JAVA");
         h.put(2, "CSS");
        h.put(4, "HTML");
        h.put(3, "JS");

        HashMap<Integer,String> h1 = (HashMap<Integer, String>) h.clone();

        System.out.println("Copied Element Value :" +h1);
        
    }
}

// 7. test if a map contains a mapping for the specified key.

class TestMap {
    public static void main(String[] args) {
        HashMap<Integer ,String> h = new HashMap<>();

        h.put(1, "JAVA");
         h.put(2, "CSS");
        h.put(4, "HTML");
        h.put(3, "JS");

      Integer key =1;

      if (h.containsKey(key)) {

        System.out.println("Value is Found in HashMap :"+key);
        
      } else {
        System.out.println("Value Not Found in HashMap " +key);
      }
        
    }
}
// 8. test if a map contains a mapping for the specified value.

class ValueCheck {
    public static void main(String[] args) {
         HashMap<Integer ,String> h = new HashMap<>();

        h.put(1, "JAVA");
         h.put(2, "CSS");
        h.put(4, "HTML");
        h.put(3, "JS");

        String s = "CSSz";

        if (h.containsValue(s)) {

            System.out.println("Value is Found in HashMap " +s);
            
        } else {
            System.out.println("Value is NOt found in HashMap " +s);
        }

        
    }
}


// 9. create a set view of the mappings contained in a map.

class viewH {
    public static void main(String[] args) {
        HashMap<Integer ,String> h = new HashMap<>();

        h.put(1, "JAVA");
         h.put(2, "CSS");
        h.put(4, "HTML");
        h.put(3, "JS");

        Set<Map.Entry<Integer,String>> set = h.entrySet();
        System.out.println("Set View Mappings in HashMap :"+set);
            
        }
        
    }

// 10. get the value of a specified key in a map.

class GetValue {
    public static void main(String[] args) {
          HashMap<Integer ,String> h = new HashMap<>();

        h.put(1, "JAVA");
         h.put(2, "CSS");
        h.put(4, "HTML");
        h.put(3, "JS");

       System.out.println("Get The Value in HashMap " +h.get(2));
        
    }
}


// 8. Develop a Java program to manage a list of bank accounts using ArrayList.
// --->Create an Account class with the following attributes:
// a. accountNumber (int)
// b. holderName (String)
// c. balance (double)
// --->Use autoboxing to store the balance and interest as Double wrapper objects.
// --->Use manual boxing to convert a primitive interest rate into a Double object.
// --->Unbox the values (both automatic and manual) to calculate and update the new balance.
// --->Add at least three Account objects to an ArrayList<Account>.
// --->For each account:
// a. Display the holder name, account number, original balance
// b. Apply 5% interest
// c. Show the new balance using primitive values (unboxed).


class Account {
    int accountNumber;
    String holderName;
    double balance;
    double interestRate; 

    public Account(int accountNumber, String holderName, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.interestRate = interestRate; 
    }

    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }
}

class BankManagement {
    public static void main(String[] args) {
        ArrayList<Account> list = new ArrayList<>();
        
        Account account1 = new Account(1001, "Selvin", 50000.00, 4.5);
        Account account2 = new Account(1002, "Steel", 40000.00, 5.6);
        Account account3 = new Account(1003, "Hyfa", 100000.00, 8.0);

        list.add(account1);
        list.add(account2);
        list.add(account3);

        for (Account a : list) {
            System.out.println("Account Number: " + a.accountNumber);
            System.out.println("Account Holder Name: " + a.holderName);
            System.out.println("Account Balance: " + a.balance);
            System.out.println("Interest to Add: " + a.calculateInterest());
            System.out.println("Balance After Adding Interest: " + (a.balance + a.calculateInterest()));
            System.out.println("------------------------------------------------------------");
        }

        Integer n = 10; 
        int n1 = n;     
        System.out.println("After manual unboxing: " + n1);
        Integer num = n1; 
        System.out.println("After manual boxing: " + num);
    }
}
