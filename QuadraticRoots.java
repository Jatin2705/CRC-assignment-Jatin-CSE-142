import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;

        if(d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2*a);
            double r2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Roots: " + r1 + ", " + r2);
        }
        else if(d == 0) {
            double r = -b / (2*a);
            System.out.println("Equal Roots: " + r);
        }
        else {
            System.out.println("Imaginary Roots");
        }
    }
}