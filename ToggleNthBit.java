import java.util.Scanner;

public class ToggleNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = sc.nextInt();

        int result = num ^ (1 << n);

        System.out.println("Result = " + result);
    }
}