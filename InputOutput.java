import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int a = sc.nextInt();

        System.out.print("Enter float: ");
        float b = sc.nextFloat();

        System.out.print("Enter character: ");
        char c = sc.next().charAt(0);

        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Character: " + c);
    }
}