import java.util.Scanner;
public class NeedleInHaystack {
    public static int findNeedle(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        if (nLen == 0) return 0; 
        for (int i = 0; i <= hLen - nLen; i++) {
            int j;
            for (j = 0; j < nLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == nLen) {
                return i;  // Found needle starting at index i
            }
        }
        return -1;  // Needle not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the haystack string: ");
        String haystack = scanner.nextLine();

        System.out.print("Enter the needle string: ");
        String needle = scanner.nextLine();

        int index = findNeedle(haystack, needle);

        if (index != -1) {
            System.out.println("Needle found at index: " + index);
        } else {
            System.out.println("Needle not found in haystack.");
        }

        scanner.close();
    }
}
