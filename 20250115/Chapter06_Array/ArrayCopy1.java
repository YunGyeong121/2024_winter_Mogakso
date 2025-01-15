public class ArrayCopy1 {
    public static void main(String[] args)
    {
        int[] myArray1 = new int[] {1,2,3};
        int[] myArray2 = myArray1;

        myArray2[1] = 0;
        System.out.println(myArray1[1]);
    }
}
