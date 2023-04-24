import java.util. *;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        if (marks >= 91) {
            System.out.println("O");
        } else if (marks >= 82) {
            System.out.println("A+");
        } else if (marks >= 73) {
            System.out.println("A");
        } else {
            System.out.println("other");
        }
    }
}