import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = -1;
        int b = -1;
        boolean secNumZero = false;
        boolean isOrdered = true;
        a = kb.nextInt();
        b = kb.nextInt();
        if (b == 0) {
            secNumZero = true;
        }

        boolean ascStarted = false;
        boolean decStarted = false;
        boolean error = false;
        while (!secNumZero) {
            if (b == a) {
                a = b;
                b = kb.nextInt();
                if (b == 0) {
                    break;
                }
            }
            if (b > a) {
                if (decStarted) {
                    isOrdered = false;
                    break;
                }
                ascStarted = true;
                a = b;
                b = kb.nextInt();
            } else if (b < a && !ascStarted) {
                decStarted = true;
                a = b;
                b = kb.nextInt();
            } else if (b < a && ascStarted) {
                isOrdered = false;
                break;
            }
            if (b == 0) {
                break;
            }
        }
        System.out.println(isOrdered);
    }
}