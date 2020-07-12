import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n = ((n / 10) % 10);
        System.out.println(n);
    }
}