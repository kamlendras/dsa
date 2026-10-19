import java.util.Scanner;

public class Q1_PrintOneToN {
    static void printUp(int n) {
        if (n <= 0) {
            return;
        }
        printUp(n - 1);
        if (n > 1) {
            System.out.print(" ");
        }
        System.out.print(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printUp(n);
        System.out.println();
        sc.close();
    }
}
