import java.util.Scanner;

public class Q25_LinearSearch {
    static int linearSearch(int[] arr, int x, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == x) {
            return index;
        }
        return linearSearch(arr, x, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.printf("%d%n", linearSearch(arr, x, 0));
        sc.close();
    }
}
