package Baekjoon_class1;
import java.util.Scanner;
public class num10950 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int a, b;
        for(int i = 0; i < num; i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }
}
