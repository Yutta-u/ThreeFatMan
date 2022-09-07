import java.util.Scanner;

public class ThreeFatMan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

                int x = 0;
                if (a > b) {
                    x = a;
                    a = b;
                    b = x;
                }
                if (b > c) {
                    x = b;
                    b = c;
                    c = x;
                }
                if (a > b) {
                    x = a;
                    a = b;
                    b = x;
                }
            if (c > 727 || c < 94 || b > 727 || b < 94 || a > 727 || a < 94) {
                System.out.println("Error");
            } else {
                System.out.println(c);
            }
    }
}
