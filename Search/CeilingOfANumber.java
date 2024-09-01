// Ceiling = smallest element in the Array >= target

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {-13, -10, -9, -6, 0, 1, 4, 16, 35};
        int target = 2;
        // smallest element in the arr = {4, 16, 35};
        // smallest element = 4 >= target
        int ans = ceiling(arr, target);
        // ans = 6
        System.out.println(ans);
    }

    // return the index of smallest no >= target
    // return start if it does not exist
    static int ceiling(int[] arr, int target) {

        // but if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        // (order of agnostic in binary search) to find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2;
            // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (mid == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return start;
    }
}
