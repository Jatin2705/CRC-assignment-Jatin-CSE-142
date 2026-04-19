import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p, r, t;
        System.out.print("Enter Principal, Rate, Time: ");
        p = sc.nextDouble();
        r = sc.nextDouble();
        t = sc.nextDouble();

        double si = (p * r * t) / 100;
        double ci = p * Math.pow((1 + r/100), t) - p;

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}