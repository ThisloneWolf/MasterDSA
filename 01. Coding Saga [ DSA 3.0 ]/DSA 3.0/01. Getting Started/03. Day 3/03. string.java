import java.util. *;

public class Main {
    public static void main(String[] args) {
        String name = "I am loneWolf, I will be billonaire by 2035";
        System.out.println(name);

        Scanner scn = new Scanner(System.in);

        String lastName = scn.next();
        System.out.println(lastName);

        String middleName = scn.nextLine();
        System.out.println(middleName);

        char letter = scn.next().charAt(0);
        System.out.println(letter);
    }
}