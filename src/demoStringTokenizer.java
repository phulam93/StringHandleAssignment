import java.util.StringTokenizer;

public class demoStringTokenizer {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("  Lập trình   Java    ");
        int count = 0;
        while (stringTokenizer.hasMoreTokens()){
            String string = stringTokenizer.nextToken();
            count++;
        }
        System.out.println(count);
    }
}
