import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }                                       // array created
        int triple = 0;
        for (int i = 2; i < a.length; i++) {
            if (a[i] - a[i - 1] == 1 && a[i - 1] - a[i - 2] == 1) {
                triple++;
            }
        }
        System.out.println(triple);
    }
}