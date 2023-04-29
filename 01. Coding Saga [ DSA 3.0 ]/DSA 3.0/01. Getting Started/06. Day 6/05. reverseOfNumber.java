import java.util. *;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int res = 0;

        while(num != 0) {   // make sure put this condition for -ve number
            int digit = num % 10;
            int newRes = res * 10 + digit;

            if(newRes /10 != res) {
                System.out.println("Out Of Integer Range");
                // return 0;
            }
            res = newRes;
            num /= 10;
        }
        System.out.println(res);
    }
}