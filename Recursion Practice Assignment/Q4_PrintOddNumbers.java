import java.util.Scanner;

public class Q4_PrintOddNumbers {
    static void printOdd(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i);
        if (i + 2 <= n) {
            System.out.print(" ");
        }
        printOdd(i + 2, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOdd(1, n);
        System.out.println();
        sc.close();
    }
}
