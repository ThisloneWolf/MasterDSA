import java.util. *;

public class Main {
    public static void main (String[] args) {
        // Approach 1

        for (int idx = 1; idx <=100; idx++) {
            if (idx % 3 == 0 && idx % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (idx % 3 == 0) {
                System.out.println("Fizz");
            } else if (idx % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(idx);
            }
        }

        // Approach 2 Better optimized checking the interval pattern

        int fizzCounter = 0;
        int buzzCounter = 0;

        for (int idx = 1; idx <=100; idx++) {
             fizzCounter++;
             buzzCounter++;
            if (fizzCounter == 3 && buzzCounter == 5) {
                System.out.println("FizzBuzz");
                fizzCounter = buzzCounter = 0;
            } else if(fizzCounter == 3) {
                System.out.println("Fizz");
                fizzCounter = 0;
            } else if (buzzCounter == 5) {
                System.out.println("Buzz");
                buzzCounter = 0;
            } else {
                System.out.println(idx);
            } 
        }


    }
}