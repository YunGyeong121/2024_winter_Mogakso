package Baekjoon_class1;
import java.util.Scanner;

public class num1330 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        if(a > b) System.out.println(">");
        else if (a < b) System.out.println("<");
        else System.out.println("==");
    }
}
