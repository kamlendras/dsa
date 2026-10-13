import java.util.Scanner;

public class Q19_LinearSearch {
    static int search(int[] a, int i, int key) {
        if (i == a.length) return -1;
        if (a[i] == key) return i;
        return search(a, i + 1, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int key = sc.nextInt();
        System.out.println(search(a, 0, key));
    }
}
