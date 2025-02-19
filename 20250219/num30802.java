import java.util.Scanner;
public class num30802 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int i, people = sc.nextInt();
        int [] size = new int[6];
        for(i = 0; i < size.length; i++) size[i] = sc.nextInt();
        int t = sc.nextInt();
        int p = sc.nextInt();
        sc.close();
        int tResult = 0;

        for(i = 0; i < size.length; i++)
        {
            if(size[i] > 0)
            {
                if(size[i] <= t) tResult++;
                else
                {
                    if (size[i] % t == 0) tResult += (size[i]/t);
                    else tResult += (size[i]/t + 1);
                }
            }
            
        }

        System.out.println(tResult);
        System.out.println(people/p + " " + people%p);
    }
}