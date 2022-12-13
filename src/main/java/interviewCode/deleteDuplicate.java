package interviewCode;

import java.util.HashSet;
import java.util.Set;

public class deleteDuplicate {
    public static void main(String[] args) {
        // given array
        int[] arr = {1, 2, 3, 3, 4, 5, 5};

// create a set to store the unique values
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
