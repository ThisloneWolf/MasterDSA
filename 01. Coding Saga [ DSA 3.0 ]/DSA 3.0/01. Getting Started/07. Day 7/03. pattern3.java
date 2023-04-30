import java.util. *;

/**
 *  Triangle Pattern :
 *   *
 *   * *
 *   * * *
 *   * * * *
 */

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        // Approach: 1

        for(int row = 0; row < num; row++) {
            for (int col = 0; col <row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Approach: 2

        for(int row = 0; row < num; row++) {
            for (int col = 0; col <num; col++) {
                if (col <= row) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }

        // Approach : 3 [Counting Stars and Spaces] i.e Stars = n, Spaces = n - 1

        int stars = 1;
        int spaces = num - 1;

        for(int row = 0; row < num; row++) {

            for (int count = 0; count < stars; count++) {
                System.out.print("* ");
            }

            for (int count = 0; count < spaces; count++) {
                System.out.print(" ");
            }

            System.out.println();
            stars++;
            spaces--;
            
        }

    }
}