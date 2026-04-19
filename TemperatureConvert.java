import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;

        System.out.println("Fahrenheit: " + f);

        System.out.print("Enter Fahrenheit: ");
        f = sc.nextDouble();
        c = (f - 32) * 5/9;

        System.out.println("Celsius: " + c);
    }
}