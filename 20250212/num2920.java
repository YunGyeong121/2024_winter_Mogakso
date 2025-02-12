import java.util.Scanner;
public class num2920 {
    public static void main(String[] args)
    {
        int [] ascending = {1,2,3,4,5,6,7,8};
        int [] descending = {8,7,6,5,4,3,2,1};
        int [] input = new int[8];

        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < input.length; i++) input[i] = sc.nextInt();

        if(input[0] == 1)
        {
            for(int i = 1; i < input.length; i++)
            {
                if(ascending[i] != input[i])
                {
                    System.out.println("mixed");
                    System.exit(0);
                }
            }
            System.out.println("ascending");
        }
        else if(input[0] == 8)
        {
            for(int i = 1; i < input.length; i++)
            {
                if(descending[i] != input[i])
                {
                    System.out.println("mixed");
                    System.exit(0);
                }
            }
            System.out.println("descending");
        }
        else System.out.println("mixed");

    }
}
