import java.util.Scanner;

public class Q26_BinarySearch {
    static int binarySearch(int[] arr, int x, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == x) {
            int left = binarySearch(arr, x, low, mid - 1);
            return left == -1 ? mid : left;
        }
        if (arr[mid] < x) {
            return binarySearch(arr, x, mid + 1, high);
        }
        return binarySearch(arr, x, low, mid - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("%d%n", binarySearch(arr, x, 0, n - 1));
        sc.close();
    }
}
