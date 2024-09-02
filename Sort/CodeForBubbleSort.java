import java.util.Arrays;

public class CodeForBubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,45,6,2,31,67};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;

        // run the steps n-1 times
        for (int i=0; i<arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the respective index
            for (int j=1; j< arr.length-i; j++) {
                // swap if the item is smaller thn the previous item
                if (arr[j] < arr[j-1]) {
                    //swap
                    int  temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if an element is not swap for a particular value
            // means, the array is sorted
            // hence, stop the program
            if (!swapped) {   // (swapped == false)
                // !false = true
                break;
            }
        }
    }
}
