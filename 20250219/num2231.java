import java.util.Scanner;
public class num2231 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        sc.close();
        int i, j, sum;
        String strNumber;
        char [] charNumber;
        int [] intNumber;

        for(i = 1; i<=number; i++)
        {
            sum = 0;
            strNumber = String.valueOf(i);
            charNumber = strNumber.toCharArray();
            intNumber = new int[charNumber.length];

            for(j = 0; j < intNumber.length; j++)
            {   
                intNumber[j] = charNumber[j] - '0';
                sum += intNumber[j];
            }

            if(number == (i + sum))
            {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("0");
    }
}
