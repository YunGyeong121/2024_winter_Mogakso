import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args)
    {
        int[] array = {1,5,3,2,4};
        System.out.println("[정렬 전]");
        for(int num:array) System.out.print(num + " ");

        Arrays.sort(array);

        System.out.println("\n[정렬 후]");
        for(int num:array) System.out.print(num + " ");
    }
}
