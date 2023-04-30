import java.util. *;

/**
 *  Pattern:
 *   _ _ _ _ *
 *   _ _ _ * *
 *   _ _ * * *
 *   _ * * * *
 *   * * * * *
 */ 

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for(int row = 1; row <= num; row++) {
            for(int col = 1; col <= num; col++) {
                if(row + col > num) System.out.print(" *");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}