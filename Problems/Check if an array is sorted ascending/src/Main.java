import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] a = new int[len];
        boolean asc = true;
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }                                       // Array created
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                asc = false;
            }
        }
        System.out.println(asc);
    }
}