import java.util. *;

/**
 *  Pattern: 1                Pattern: 2
 *  0 1 2 3 4                 0 -1  -2  -3  -4
 *  1 2 3 4 5                 1  0  -1  -2  -3
 *  2 3 4 5 6                 2  1   0  -1  -2
 *  3 4 5 6 7                 3  2   1   0  -1
 *  4 5 6 7 8                 4  3   2   1   0  
 */

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        // Approach 1

        for (int row = 0; row <= num; row++) {
            int value = row;
            for (int col = 0; col < num; col++) {
                System.out.print(" "+ value);
                value++;
            }
            System.out.println();
        }

        // Approach : 2

        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                System.out.print(row + col + " ");
            }
            System.out.println();
        }

        // Pattern : 2
        
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                System.out.print(row - col + " ");
            }
            System.out.println();
        }
    }
}