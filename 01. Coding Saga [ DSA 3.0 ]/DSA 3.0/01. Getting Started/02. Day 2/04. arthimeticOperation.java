import java.util. *;

public class Main {
    public static void main(String[] args) {
        int a = 20, b = 10;
        int c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);
    
        /** Operation happens from left to right in Java
         * integer/integer  -----> interger division
         * integer/double   -----> double division
         * integer + string  -----> string
        */

        System.out.println(3 / 2);
        System.out.println(3 / 4.0);

        double d = 3 / 2;
        System.out.println(d);

        double e = 4 / 2;
        System.out.println(e);

        /**
         * Double quotes and single quotes are different
         */
        System.out.println(-10 % 6);
        System.out.println("A" + "B");
        System.out.println('a' + 5);
        System.out.println(10 + 20 + "10 + 20" + 10 + 20);

        // String literal i.e double quotes here concatination is happening
        System.out.println("1" + "2");

        // Here single quotes, taking it as a char, we will use ASCII value
        System.out.println('1' + '2');

    }
}