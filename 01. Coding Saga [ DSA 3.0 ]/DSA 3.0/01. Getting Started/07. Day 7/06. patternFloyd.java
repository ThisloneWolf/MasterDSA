import java.util. *;

/**
 *  Pattern:
 *  1
 *  2 3
 *  3 4 5
 *  5 6 7 8
 */

public class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for (int row = 1; row <= num; row++) {
            int val = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }
}