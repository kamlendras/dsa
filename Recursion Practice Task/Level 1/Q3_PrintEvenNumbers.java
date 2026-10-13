import java.util.Scanner;

public class Q3_PrintEvenNumbers {
    static void print(int n) {
        if (n < 2) return;
        print(n - 1);
        if (n % 2 == 0) System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
