package Baekjoon_class1;
import java.util.Scanner;
public class num10869 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println((a+b) + "\n" + (a-b) + "\n" + (a*b) + "\n" + (a/b) + "\n" + (a%b));
    }
}
