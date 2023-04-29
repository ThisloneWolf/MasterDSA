import java.util. *;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = num;

        int count = 0;

        while(num != 0) {
            int digit = num % 10;
            if (digit > 0 && temp % digit == 0 ) {
                count ++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}