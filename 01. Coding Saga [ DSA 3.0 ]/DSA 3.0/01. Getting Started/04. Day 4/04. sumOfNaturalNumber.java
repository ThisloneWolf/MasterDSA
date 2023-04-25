import java.util. *;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int sum = 0;

        for(int idx = 0; idx <= num; idx++) {
            sum += idx;
        }

        System.out.println(sum);


    }
}