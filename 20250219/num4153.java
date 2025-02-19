import java.util.Scanner;
public class num4153 { 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        while(true)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if(a == 0 && b == 0 && c == 0) System.exit(0);
            else
            {
                if((a*a + b*b) == c*c) System.out.println("right");
                else if((a*a + c*c) == b*b) System.out.println("right");
                else if((b*b + c*c) == a*a) System.out.println("right");
                else System.out.println("wrong");
            }

        }

    }

}