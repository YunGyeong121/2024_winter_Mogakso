package Baekjoon_class1;
import java.util.Scanner;

public class num2438 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();
        for(int i = 1; i <= num; i++)
        {
            for(int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
