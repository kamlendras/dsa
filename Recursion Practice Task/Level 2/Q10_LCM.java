import java.util.Scanner;

public class Q10_LCM {
    static long lcm(long a, long b, long multiple) {
        if (multiple % b == 0) return multiple;
        return lcm(a, b, multiple + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(lcm(a, b, a));
    }
}
