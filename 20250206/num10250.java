import java.util.Scanner;
public class num10250 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int count = sc.nextInt();
        
        for(int i = 0; i < count; i++)
        {
            int compare = 0;
            int r = 1, s = 1;
            int story = sc.nextInt();
            int room = sc.nextInt();
            int customer = sc.nextInt();

            for(r = 0; r <= room; r++)
            {
                if(compare == customer) break;
                for(s = 1; s <= story; s++) 
                {
                    compare++;
                    if(compare == customer) break; 
                }
            }
            System.out.printf("%d%02d\n",s, r);
        }

        sc.close();   
    }
}
