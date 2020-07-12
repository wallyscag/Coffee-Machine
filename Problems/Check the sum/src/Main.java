import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean sum;

        if (a + b == 20 || b + c == 20 || a + c == 20) {
            sum = true;
        } else {
            sum = false;
        }

        System.out.println(sum);
    }
}