import java.util. *;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int product = 1;
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            product *= digit;
            sum += digit;
            num /= 10;
        }
        System.out.println("Product of the digit are " + product);
        System.out.println("Sum of the digit are " + sum);
        System.out.println("Difference is " + product - sum);
    }
}