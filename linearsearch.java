public class LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        int target = 4;

        int result = linearSearch(numbers, target);

        if (result == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at index: " + result);
        }
    }
}
