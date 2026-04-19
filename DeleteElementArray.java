import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int pos = sc.nextInt();

        for (int i = pos - 1; i < n - 1; i++)
            arr[i] = arr[i + 1];

        n--;

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}