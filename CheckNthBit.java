import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = sc.nextInt();

        if ((num & (1 << n)) != 0)
            System.out.println("Bit is set");
        else
            System.out.println("Bit is not set");
    }
}