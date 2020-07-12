import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean adj = false;
        int len = input.nextInt();
        int n;
        int m;
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        n = input.nextInt();
        m = input.nextInt();
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] == n && a[i] == m || a[i] == n && a[i - 1] == m) {
                adj = true;
                break;
            }
        }
        System.out.println(adj);
    }
}