// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1315764809/
public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target ) {

        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
//        // check for first occurrence of target
//        int start = search(nums, target, true);
//
//        // check for last occurrence 0f target
//        int end = search(nums, target, false);
//
//        ans[0] = start;
//        ans[1] = end;

        return ans;
    }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2;
            // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                // potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
