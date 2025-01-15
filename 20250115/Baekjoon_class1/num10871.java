package Baekjoon_class1;
import java.util.Scanner;
public class num10871 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int count = sc.nextInt();
        int num = sc.nextInt();
        int x;

        for(int i = 0; i < count; i++)
        {
            x = sc.nextInt();
            if(x < num) System.out.print(x + " ");
        }
        sc.close();
    }
}
