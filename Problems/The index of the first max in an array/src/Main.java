import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();

        int[] a = new int[len];
        int max = 0;
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
            if (max < a[i]) {
                max = a[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}