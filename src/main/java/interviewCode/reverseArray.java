package interviewCode;

public class reverseArray {
    public static void main(String[] args) {
       // 1-For a given array of size N, write a code to print the reverse of the array
        int[] arr = {1, 2, 3, 4, 5};

// loop through the array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
