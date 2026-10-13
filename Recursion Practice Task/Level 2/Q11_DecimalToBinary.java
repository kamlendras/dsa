import java.util.Scanner;

public class Q11_DecimalToBinary {
    static String toBinary(int n) {
        if (n < 2) return "" + n;
        return toBinary(n / 2) + n % 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toBinary(n));
    }
}
