import java.util. *;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();

        System.out.println("Before If");
        
        if(marks >= 30) {
            System.out.println("Passed");
        } 

        System.out.println("After If");
    }
}