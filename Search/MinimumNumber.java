public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {18,45,8,67,-4};
        System.out.println(min(arr));
    }
    // assume arr.length != 0
    // return minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
