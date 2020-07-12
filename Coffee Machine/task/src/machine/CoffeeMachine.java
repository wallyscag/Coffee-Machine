package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        String choice;
        boolean exit = false;
        System.out.println();

        while (!exit) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            choice = input.nextLine();

            switch (choice) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    choice = input.nextLine();
                    switch (choice) {
                        case "1": // Espresso
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                beans -= 16;
                                money += 4;
                                cups--;
                            }
                            break;
                        case "2": // Latte
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (beans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else if (water >= 350 && milk >= 75 && beans >= 20) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                money += 7;
                                cups--;
                            }
                            break;
                        case "3": // Cappuccino
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (beans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            } else if (cups < 1) {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                money += 6;
                                cups--;
                            }
                            break;
                        case "back":
                            continue;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += input.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += input.nextInt();
                    System.out.println("Write how many g of coffee beans do you want to add:");
                    beans += input.nextInt();
                    System.out.println("Write how many disposable cups do you want to add:");
                    cups += input.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you " + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:\n"
                            + water + " of water\n"
                            + milk + " of milk\n"
                            + beans + " of coffee beans\n"
                            + cups + " of disposable cups\n"
                            + "$" + money + " of money\n");
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    break;
            }
        }
    }
}
