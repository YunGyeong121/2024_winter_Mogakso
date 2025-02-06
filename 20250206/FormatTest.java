public class FormatTest {
    public static void main(String[] args)
    {
        String str = "I'm %d years old.";
        int age = 21;
        String formatStr = String.format(str, age);

        System.out.println(formatStr);
    }
}
