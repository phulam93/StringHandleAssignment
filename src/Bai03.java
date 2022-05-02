import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai03 {
    public static void main(String[] args) {
        chuanHoaChuoi(input());
    }

    private static void chuanHoaChuoi(String input) {
        StringTokenizer str = new StringTokenizer(input.trim().toLowerCase());
        while (str.hasMoreTokens()) {
            String output = str.nextToken();
            char c = (char) ((int) output.charAt(0) - 32);
            System.out.print(c + output.substring(1) + " ");
        }
    }

    private static String input() {
        System.out.print("Mời bạn nhập vào một chuỗi bất kỳ: ");
        return new Scanner(System.in).nextLine();
    }
}
