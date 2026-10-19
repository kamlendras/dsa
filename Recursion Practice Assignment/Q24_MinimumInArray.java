import java.util.Scanner;

public class Q24_MinimumInArray {
    static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return Math.min(arr[index], findMin(arr, index + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("%d%n", findMin(arr, 0));
        sc.close();
    }
}
