import java.util.Scanner;

public class Q20_BinarySearch {
    static int search(int[] a, int low, int high, int key) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (a[mid] == key) return mid;
        if (a[mid] < key) return search(a, mid + 1, high, key);
        return search(a, low, mid - 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int key = sc.nextInt();
        System.out.println(search(a, 0, n - 1, key));
    }
}
