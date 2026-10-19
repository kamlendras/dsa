import java.util.Scanner;

public class Q17_DecimalToBinary {
    static String toBinary(long n) {
        if (n < 2) {
            return String.valueOf(n);
        }
        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.printf("%s%n", toBinary(n));
        sc.close();
    }
}
