public class StringBuilderCapacity {
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder("Hello");

        System.out.println(str.capacity());
        System.out.println(str.length());

        System.out.println("str2's capacity : " + str2.capacity());
    }
}
