import java.util.Scanner;
public class num2577 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        int result = a * b * c;
        int [] resultArray = new int[10];
        while (result > 0)
        {
            resultArray[result % 10]++;
            result /= 10;
        }

        for(int num : resultArray) System.out.println(num);

    }
}
