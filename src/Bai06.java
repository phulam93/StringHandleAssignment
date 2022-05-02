import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai06 {
    public static void main(String[] args) {
        sortInString(input());
    }

    private static void sortInString(String input) {
        StringTokenizer str = new StringTokenizer(input.trim());
        String[] strings = new String[input.length()];
        int k = 0;
        while (str.hasMoreTokens()) {
            strings[k] = str.nextToken();
            k++;
        }

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i] != null && strings[j] != null && strings[i].compareTo(strings[j]) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;

                }
            }
        }
        System.out.println("Các từ trong câu được tách ra và sắp xếp là: ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i]!= null){
                System.out.println(strings[i]);
            }
        }
    }

    private static String input() {
        System.out.print("Mời bạn nhập vào một chuỗi bất kỳ: ");
        return new Scanner(System.in).nextLine();
    }
}
