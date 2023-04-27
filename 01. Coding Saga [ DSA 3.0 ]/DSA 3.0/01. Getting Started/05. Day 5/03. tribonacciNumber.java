import java.util. *;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        if ( n == 0 ) return 0;
        if ( n == 1 || n == 2) return 1;

        int a = 0;
        int b = 1;
        int c = 1;
        int sum = a + b + c + d;

        for (int idx = 3; idx <= num; idx++) {
            sum = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        System.out.println("Tribonacci of " + num + " is " + sum);
    }
}