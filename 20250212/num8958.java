import java.util.Scanner;
public class num8958 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int series, result, i, l;
        char [] inputChar;

        for(i = 0; i < num; i++)
        {
            series = 0;
            result = 0;
            String input = sc.next();
            inputChar = input.toCharArray();

            for(l = 0; l < inputChar.length; l++)
            {
                if(inputChar[l] == 'O')
                {
                    series++;
                    if(l != 0 && inputChar[l] == 'O' && inputChar[l-1] == 'O')
                    {
                        result += series;
                        continue;
                    }
                    result++;
                }
                else series = 0;
            }

            System.out.println(result);
        }
    }
}
