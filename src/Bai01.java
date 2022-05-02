public class Bai01 {
    public static void main(String[] args) {
        listSTN();
    }

    private static void listSTN() {
        System.out.println("Các số thuận nghịch có 6 chữ số là: ");
        for (int i = 100000; i <= 999999; i++) {
            if (isThuanNghich(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isThuanNghich(int number) {
        String str = String.valueOf(number);
        StringBuilder strCompare = new StringBuilder(str);
        strCompare.reverse();
        return str.equals(String.valueOf(strCompare));
    }
}
