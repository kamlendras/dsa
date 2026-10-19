import java.util.Scanner;

public class Q2_PrintNToOne {
    static void printDown(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(n);
        if (n > 1) {
            System.out.print(" ");
        }
        printDown(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDown(n);
        System.out.println();
        sc.close();
    }
}
