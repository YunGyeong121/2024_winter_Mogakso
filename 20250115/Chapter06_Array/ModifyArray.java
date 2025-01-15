public class ModifyArray 
{
    static void modifyArray(int[] b)
    {
        for(int j = 0; j < b.length; j++) b[j] *= 2;
    }
    public static void main(String[] args)
    {
        int[] t = new int[] {1, 2, 3};
        System.out.println("함수 호출 전");
        for(int num: t) System.out.print(num + " ");
        modifyArray(t);
        System.out.println("\n함수 호출 후");
        for(int num: t) System.out.print(num + " ");
    }
}
