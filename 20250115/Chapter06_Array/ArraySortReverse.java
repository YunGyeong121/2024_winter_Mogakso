import java.util.Arrays;

public class ArraySortReverse {
    public static void main(String[] args)
    {
        int [] a = new int[] {4, 2, 3, 1, 5};
        Arrays.sort(a);

        for(int i = 0; i < a.length/2; i++)
        {
            int temp = a[i];
            a[i] = a[a.length-(i+1)];
            a[a.length-(i+1)] = temp;
        }

        for(int num:a) System.out.print(num + " "); 
    }
}
