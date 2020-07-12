import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean res = false;
        int len = input.nextInt();

        int[] num = new int[len];
        for (int i = 0; i < len; i++) {
            num[i] = input.nextInt();
        }

        int check = input.nextInt();
        for (int n : num) {
            if (n == check) {
                res = true;
            }
        }
        System.out.println(res);
    }
}