public class TypeConversionStringInt {
    public static void main(String[] args)
    {
        String str = "21";
        int num = Integer.parseInt(str);

        System.out.println(num);

        int number = 21;
        String str2 = String.valueOf(number);

        System.out.println(str2);

        int number2 = 21;
        String str3 = Integer.toString(number2);

        System.out.println(str3);

    }
}
