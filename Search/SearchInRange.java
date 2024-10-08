public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,45,8,67,-4};
        int target = 67;
        System.out.println(linearSearch(arr, target, 1, 3));

    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for(int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
