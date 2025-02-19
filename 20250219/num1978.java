import java.util.Scanner;
public class num1978 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int i, j, number = sc.nextInt();
        int [] numArray = new int[number];
        int isItSoSu, result = 0;

        for(i = 0; i < numArray.length; i++)
        {
            numArray[i] = sc.nextInt();
            isItSoSu = 1;

            if(numArray[i] == 1) continue;

            for(j = 2; j < numArray[i]; j++)
            {
                if(numArray[i] % j == 0)
                {
                    isItSoSu = 0;
                    break;
                }
            }

            if(isItSoSu == 1) result++;
        }

        System.out.println(result);
    }
}