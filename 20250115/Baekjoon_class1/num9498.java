package Baekjoon_class1;
import java.util.Scanner;
public class num9498 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();
        if (90 <= num  && num <= 100) System.out.println("A");
        else if (80 <= num  && num <= 89) System.out.println("B");
        else if (70 <= num  && num <= 79) System.out.println("C");
        else if (60 <= num  && num <= 69) System.out.println("D");
        else System.out.println("F");
    }
}
