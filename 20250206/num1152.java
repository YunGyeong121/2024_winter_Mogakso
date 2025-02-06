import java.util.Scanner;
public class num1152 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine().trim();

        if(str.isEmpty()) System.out.println("0");
        else
        {
            String[] splitStr = str.split(" ");
            System.out.println(splitStr.length);
        }
        
    }
}
