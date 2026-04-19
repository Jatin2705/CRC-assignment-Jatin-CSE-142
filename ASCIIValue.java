import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        int ascii = (int)c;

        System.out.println("ASCII Value: " + ascii);
    }
}