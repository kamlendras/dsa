import java.util.Scanner;

public class Q16_CheckArraySorted {
    static boolean isSorted(int[] a, int n) {
        if (n <= 1) return true;
        if (a[n - 2] > a[n - 1]) return false;
        return isSorted(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(isSorted(a, n));
    }
}
