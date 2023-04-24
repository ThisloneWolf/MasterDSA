import java.util. *;

public class Main {
    public static void main(String[] args) {
        System.out.println(5 < 5);
        System.out.println(5 >= 5);
        System.out.println(5 !=5);

        Scanner scn = new Scanner(System.in);
        int odd = scn.nextInt();
        int even = scn.nextInt();

        System.out.println(odd % 2 < even % 2);
    }
}