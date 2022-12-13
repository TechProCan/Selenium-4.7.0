package interviewCode;

import java.util.Arrays;

public class minMaxArray {
    public static void main(String[] args) {
        // given array
        int[] arr = {-1,3, 5, 1, 70, 2, 4};

// sort the array in ascending order
        Arrays.sort(arr);

// the first element is the minimum value
        int min = arr[0];

// the last element is the maximum value
        int max = arr[arr.length - 1];

// print the minimum and maximum values
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
