import java.util. *;


public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();   

        int digit = 0;
        int temp = num;

        while(temp != 0) {
            digit++;
            temp /= 10;
        }

        k = k % digit;

        if(k < 0) {
            k += digit;
        }

        int a = num % (int)Math.pow(10, k);
        int b = num / (int)Math.pow(10, k);

        int res = a * (int)Math.pow(10, digit - k) + b;
        System.out.println(res);

    }
}