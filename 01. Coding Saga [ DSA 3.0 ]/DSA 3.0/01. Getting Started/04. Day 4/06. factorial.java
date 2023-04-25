import java.util. *;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        long product = 1;
        for(int idx = 1; idx <=num; idx++) {
            product *= idx;
        }
        System.out.println(product);
    }
}