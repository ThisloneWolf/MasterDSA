import java.util. *;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int temp = num;
        int sumOfCube = 0;
        while(num > 0) {
            int digit = num % 10;
            sumOfCube += digit * digit * digit;
            num /= 10;
        }
        if (sumOfCube == temp) {
            System.out.println("Number is Armstrong");
        }
    }
}