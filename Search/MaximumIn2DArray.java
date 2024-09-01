public class MaximumIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,56,78},
                {14,58,63,72},
                {1,5,90,2},
                {6,9}
        };
        System.out.println(max(arr));

        System.out.println(Integer.MIN_VALUE);
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
