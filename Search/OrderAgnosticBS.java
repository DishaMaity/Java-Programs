public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-13, -10, -9, -6, 0, 1, 4, 16, 35};
        int target = 1;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    // return the index
    // return -1 if it does not exist
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // to find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        boolean isAsc1;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

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
        return -1;
    }
}
