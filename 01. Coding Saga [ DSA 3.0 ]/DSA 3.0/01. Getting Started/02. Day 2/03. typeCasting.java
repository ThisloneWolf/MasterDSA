import java.util. *;
public class Main {
    public static void main(String[] args) {
        /**
         * Upcasting happenign here, i.e Implicit Type converion happening here
         * i.e char ---> int
         * 2byte    -----> 4 byte
         */
        int num = 'a';
        System.out.println(num);

        int num1 = '0';
        System.out.println(num1);

        int num3 = 'Z';
        System.out.println(num3);

        int num4 = 'a' + 5;
        System.out.println(num4);

        /**
         * Explicit Conversion
         * i.e from storing long in int here in below example
         */

         int num5 = 100;
         long num6 = 12;
         System.out.println(num6);

         /**
          * Here results in garbage value sometimes, if value is larger than int while explicit conversion
          */
         int c = (int)num6; 
         System.out.println(c);
         
         int char1 = 97;
         char char2 = (char)char1;
         System.out.println(char2);
    }
}