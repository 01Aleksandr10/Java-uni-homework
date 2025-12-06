import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.println("Привет, " + name);
        scan.close();
    }
}
