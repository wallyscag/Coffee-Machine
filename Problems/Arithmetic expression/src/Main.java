import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = ((n + 1) * n + 2) * n + 3;
        System.out.println(a);
    }
}