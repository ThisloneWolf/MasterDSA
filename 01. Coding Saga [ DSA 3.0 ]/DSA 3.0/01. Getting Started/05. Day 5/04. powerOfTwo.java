import java.util. *;

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        long power = 1;

        while (power < num) {
            power *= 2;
        }
        
        if(power == num) {
            System.out.println("Yes it is power of 2");
        } else {
            System.out.println("No it is not a power of 2");
        }
    }
}