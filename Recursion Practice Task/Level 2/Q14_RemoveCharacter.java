import java.util.Scanner;

public class Q14_RemoveCharacter {
    static String remove(String s, char c) {
        if (s.isEmpty()) return s;
        if (s.charAt(0) == c) return remove(s.substring(1), c);
        return s.charAt(0) + remove(s.substring(1), c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(remove(s, c));
    }
}
