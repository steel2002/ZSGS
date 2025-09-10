import java.util.Arrays;
public class ArraysFunction {
    public static void main(String[] args) {
        
    }
    
}

// 1. Arrays.sort()


class TestSort {
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1};
        Arrays.sort(nums);  // Sort array
        System.out.println(Arrays.toString(nums)); // Output: [1, 2, 5, 8]
    }
}


// 2. Arrays.binarySearch()

class TestBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 8};
        int index = Arrays.binarySearch(nums, 5);
        System.out.println(index); // Output: 2
    }
}



