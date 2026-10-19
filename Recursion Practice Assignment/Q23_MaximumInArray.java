import java.util.Scanner;

public class Q23_MaximumInArray {
    static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return Math.max(arr[index], findMax(arr, index + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("%d%n", findMax(arr, 0));
        sc.close();
    }
}
