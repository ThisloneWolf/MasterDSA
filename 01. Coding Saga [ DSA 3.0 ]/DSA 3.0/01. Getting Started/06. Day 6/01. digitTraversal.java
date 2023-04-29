import java.util. *;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        while(number != 0) {
            int digit = number % 10;
            number /= 10;
            System.out.println(digit);
        }
    }
}