public class SplitTest {
    public static void main(String[] args)
    {
        String str = "Hello World! I'm 21 years old and I like oranges but I don't like watermelon";
        String[] splitStr = str.split("and|but");

        for(String s : splitStr) System.out.println(s.trim());
    }
}