import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int d = sc.nextInt();
        char choice = sc.next().charAt(0); // L or R

        d = d % n;
        int[] result = new int[n];

        if (choice == 'L' || choice == 'l') {
            for (int i = 0; i < n; i++)
                result[i] = arr[(i + d) % n];
        } else if (choice == 'R' || choice == 'r') {
            for (int i = 0; i < n; i++)
                result[(i + d) % n] = arr[i];
        }

        for (int i = 0; i < n; i++)
            System.out.print(result[i] + " ");
    }
}