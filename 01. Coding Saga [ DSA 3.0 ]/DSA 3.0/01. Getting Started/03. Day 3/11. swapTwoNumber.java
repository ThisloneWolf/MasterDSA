import java.util. *;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int tempNum = num2;
        num2 = num1;
        num1 = tempNum;

        System.out.println(num1);
        System.out.print(num2);

    }
}