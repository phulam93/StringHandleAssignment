import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai04 {
    public static void main(String[] args) {
        findStringLonggest(input());
    }

    private static void findStringLonggest(String input) {
        StringTokenizer str = new StringTokenizer(input.trim());
        String[] strings = new String[input.length()];
        int k = 0;
        while (str.hasMoreTokens()) {
            strings[k] = str.nextToken();
            k++;
        }
        int maxLength = 0;
        String strLonggest = "";
        int index = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && strings[i].length() > maxLength) {
                maxLength = strings[i].length();
                strLonggest = strings[i];
                index = input.indexOf(strings[i]);
            }
        }
        System.out.println("Từ dài nhất trong chuỗi \"" + input + "\" là từ \"" +
                strLonggest + "\" và xuất hiện ở vị trí thứ " + index);
    }

    private static String input() {
        System.out.print("Mời bạn nhập vào một chuỗi bất kỳ: ");
        return new Scanner(System.in).nextLine();
    }
}
