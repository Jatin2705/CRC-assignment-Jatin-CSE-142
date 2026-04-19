import java.util.Scanner;

public class NumberCheckFunctions {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = 0;
        int temp = n;

        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++)
                power *= digit;
            sum += power;
            temp /= 10;
        }

        return sum == original;
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Prime: " + isPrime(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        System.out.println("Perfect: " + isPerfect(n));
    }
}