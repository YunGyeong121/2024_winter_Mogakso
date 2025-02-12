import java.util.Scanner;
public class num3052 {
    public static void main(String[] args)
    {
        int [] input = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < input.length; i++) input[i] = sc.nextInt() % 42;

        sc.close();

        int count = 0;

        for(int k = 0; k < input.length-1; k++)
        {
            for(int i = k+1; i < input.length; i++)
            {
                if(input[k] == input[i]) break;
            
                if(i == 9)
                {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count+1);

    }
}