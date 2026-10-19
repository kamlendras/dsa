import java.util.Scanner;

public class Q22_ArraySortedCheck {
    static boolean isSorted(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (isSorted(arr, 0)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
        sc.close();
    }
}
