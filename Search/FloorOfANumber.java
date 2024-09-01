// floor = greatest number in the array =< target

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {-13, -10, -9, -6, 0, 1, 4, 16, 35};
        int target = -5;
        // greatest element in the arr = {-13, -10, -9, -6};
        // greatest element = -6 <= target
        int ans = floor(arr, target);
        // ans = 3
        System.out.println(ans);

    }
    // return the index
    // return end if it does not exist
    static int floor(int[] arr, int target) {

        // but if the target is smaller than the smallest number in the array
        if (target < arr[arr.length - 1]){
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
        return end;
    }
}
