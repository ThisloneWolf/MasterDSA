import java.util. * ;

public class Main {
    public static void main(String[] args) {
        long sum = 0;
        
        for(long idx = 1; idx <= 5;; idx++) {
            sum += idx * idx * idx;
        }

        System.out.println(sum);
    }
}