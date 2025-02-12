public class StringMethod {
    public static void main(String[] args)
    {
        StringBuilder strAppend = new StringBuilder();

        strAppend.append("Hello");
        strAppend.append(123);
        strAppend.append(3.141592);

        System.out.println("str : " + strAppend);
        System.out.println("str's Class : " + strAppend.getClass());

        // ------------------------------------------------------------------------ insert 메서드

        StringBuilder strInsert = new StringBuilder("HelloWorld");

        strInsert.insert(5, " ");
        System.out.println(strInsert);

        // ------------------------------------------------------------------------ delete 메서드 

        strInsert.delete(6, 11);
        System.out.println(strInsert);

        // ------------------------------------------------------------------------ replace 메서드 

        strInsert.replace(0, 5, "Apple");
        System.out.println(strInsert);

        // ------------------------------------------------------------------------ reverse 메서드

        StringBuilder strReverse = new StringBuilder("Hello World!");

        strReverse.reverse();
        System.out.println(strReverse);

        // ------------------------------------------------------------------------ substring 메서드 

        strReverse.reverse();
        String strSubstring = strReverse.substring(6);
        String strSubstring2 = strReverse.substring(0, 5);

        System.out.println(strSubstring);
        System.out.println(strSubstring2);

        // ------------------------------------------------------------------------ indexOf 메서드

        StringBuilder strIndexOf = new StringBuilder("Hello World!!");

        System.out.println(strIndexOf.indexOf("World"));

        // ------------------------------------------------------------------------ charAt 메서드

        StringBuilder strCharAt = new StringBuilder("Hello World!!!!");

        System.out.println(strCharAt.charAt(3));
        strCharAt.setCharAt(5, '-');
        System.out.println(strCharAt);
        strCharAt.deleteCharAt(5);
        System.out.println(strCharAt);


    }
}
