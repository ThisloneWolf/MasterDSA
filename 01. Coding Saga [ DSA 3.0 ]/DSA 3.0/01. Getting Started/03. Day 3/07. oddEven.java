import java.util. *;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        if (num1 % 2 == 0) {
            System.out.print(num1);
            System.out.print(num2);
        } else {
            System.out.print(num2);
            System.out.print(num1);
        }
    }
}