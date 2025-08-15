import java.util.Arrays;

class SimpleArrayOps {
    public static int access(int[] arr, int index) {
        return arr[index];
    }
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
    public static int[] insert(int[] arr, int index, int element) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = element;
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
    public static int[] delete(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Access index 2: " + access(arr, 2));
        int key = 4;
        System.out.println("Search for " + key + ": Index " + search(arr, key));
        arr = insert(arr, 3, 10);
        System.out.println("After insertion: " + Arrays.toString(arr));
        arr = delete(arr, 1);
        System.out.println("After deletion: " + Arrays.toString(arr));
		   Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
}
