package Baekjoon_class1;
import java.util.Scanner;
public class num2475 {
    public static void main(String[] args)
    {
        int [] num = new int[5];
        int result = 0;
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < 5; i++) num[i] = sc.nextInt();
        sc.close();

        for(int a:num) result += a * a;
        System.out.println(result % 10);
    }
}
