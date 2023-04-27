import java.util. *;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        if (num == 0) return 0;
        if (num == 1) return 1;

        int firstNo = 0;
        int secondNum = 1;
        int sum = firstNo + secondNum;

        for (int idx = 2; idx <=num; idx++) {
            sum = firstNo + secondNum; 
            firstNo = secondNum;
            secondNum = sum;
        }

        System.out.println("Fibonacci of "+ num + " is " + sum);
    }
}