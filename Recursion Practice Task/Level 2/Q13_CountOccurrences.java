import java.util.Scanner;

public class Q13_CountOccurrences {
    static int count(String s, char c) {
        if (s.isEmpty()) return 0;
        return (s.charAt(0) == c ? 1 : 0) + count(s.substring(1), c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(count(s, c));
    }
}
