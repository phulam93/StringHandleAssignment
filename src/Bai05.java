import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai05 {
    public static void main(String[] args) {
        //1. nhập vào 1 chuỗi họ tên
        String str = nhapChuoi("Nhập một chuỗi đầu vào: ");
        System.out.println("Chuỗi bạn vừa nhập là: " + str);

        //2. tách và đổi lại cấu trúc tên họ đệm
        System.out.println("++++++++++++++++++++++");
        doiHoTen(str);
    }

    public static String nhapChuoi(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextLine();
    }

    public static void doiHoTen(String input) {
        StringTokenizer str = new StringTokenizer(input.trim());
        String[] strings = new String[input.length()];
        int k = 0;
        while (str.hasMoreTokens()) {
            strings[k] = str.nextToken();
            k++;
        }
        for (int i = 2; i < strings.length; i++) {
            if (strings[i] != null) {
                System.out.print(strings[i] + " ");
            }
        }
        System.out.print(strings[0] + " ");
        System.out.println(strings[1]);

    }
}
