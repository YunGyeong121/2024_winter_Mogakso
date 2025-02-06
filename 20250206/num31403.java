import java.util.Scanner;
public class num31403 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        String ab = a + b;
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c));
        System.out.println(Integer.parseInt(ab) - Integer.parseInt(c));
    }
}