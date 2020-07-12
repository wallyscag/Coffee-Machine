import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int anum = 1;
        int bnum = 2;
        int cnum = 3;

        Math.max(a, Math.max(b, c));

        if (a >= b && a >= c) {
            return anum;
        } else if (b >= a && b >= c) {
            return bnum;
        } else
        return cnum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}