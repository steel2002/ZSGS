
import java.util.*;

public class Collation  {
    public static void main(String[] args) {
        
    }

    public static Object reversh() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reversh'");
    }

    public static void sort(List<Interger> odd, Object reversh) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
    
}


class MyArrayListDemo {
    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

     /*    arr.add(1);
        arr.add("hello");
        arr.add(true);
        arr.add('x');

        */

        for (int i =10; i < 15; i++) {
            arr.add(i);
        }

        Iterator<Integer> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (int  c : arr) {
            System.out.println("" + c);
            
        }
    }
}


// PriorityQueueDemo.java

class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        
        pq.add("Apple");
        pq.offer("Banana");
        pq.add("Cherry");
         pq.add("Elderberry");
          pq.add("Elderberry");
     pq.add("Date");
        pq.add("Fig");
        pq.add("Grape");

        System.out.println("Priority Queue: " + pq);


        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());  // order by natural order
            
        }
    }
}

// HashSetDemo.java

class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new LinkedHashSet<>();    // LinkedHashSet maintains insertion order

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30); 
        set.add(null);
        set.add(20);

        System.out.println("HashSet: " + set);   // No duplicates, order not guaranteed
                                                 // HashSet does not maintain order
  }
}

// TreeSetDemo.java

class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> Set = new TreeSet<>();


        
        Set.add(10);
        Set.add(20);
        Set.add(30);
        Set.add(30); 
      // Set.add(null);
        Set.add(20);

        System.out.println("HashSet: " + Set);   // No duplicates, order is sorted
                                                  // null values are not allowed in TreeSet
    }

}


// Map Interface Example    TreeMapDemo.java  oder maintained by key

class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Apple");
        map.put(4, "Date");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Map: " + map);

    }
}