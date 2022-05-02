import java.util.Scanner;

public class Bai07 {
    public static void main(String[] args) {
        System.out.print("Mời bạn nhập vào xâu s1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.print("Mời bạn nhập vào xâu s2: ");
        String s2 = new Scanner(System.in).nextLine();

        if (s1.contains(s2)) {
            System.out.print("Chuỗi s1 sau khi loại bỏ chuỗi s2 là: ");
            String s3 = s1.replace(s2, "");
            System.out.println(s3);
        } else {
            System.out.println("Chuỗi s1 không chứa chuỗi s2.");
        }
    }

    private static String input() {
//        System.out.print("Mời bạn nhập vào một chuỗi bất kỳ: ");
        return new Scanner(System.in).nextLine();
    }
}
