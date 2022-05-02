import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        chuXenKe(input());
    }

    private static void chuXenKe(String input) {
        StringBuilder str = new StringBuilder(input.trim().toLowerCase());
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0 && str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                output.append((char) ((int) str.charAt(i) - 32));
            } else {
                output.append(str.charAt(i));
            }
        }
        System.out.println(output);
    }

    private static String input() {
        System.out.print("Mời bạn nhập vào một chuỗi bất kỳ: ");
        return new Scanner(System.in).nextLine();
    }
}
