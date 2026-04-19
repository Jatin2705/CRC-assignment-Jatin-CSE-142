import java.util.Scanner;

public class OnlyAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                result = result + ch;
            }
        }

        System.out.println("String after removing non-alphabets = " + result);
    }
}