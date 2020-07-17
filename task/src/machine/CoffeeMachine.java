package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private final Scanner sc;

    int water;
    int milk;
    int coffeeBeans;
    int disposableCups;
    int money;


    CoffeeMachine() {
        this.sc = new Scanner(System.in);

        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.disposableCups = 9;
        this.money = 550;

    }


    boolean exit() {
        return false;
    }
    void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        var coffeeChoice = sc.next();
        switch (coffeeChoice) {
            case "1":
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    water -= 250;
                    coffeeBeans -= 16;
                    disposableCups -= 1;
                    money += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "2":
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    disposableCups -= 1;
                    money += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "3":
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    disposableCups -= 1;
                    money += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "back":
                this.menu();
            default:
                System.out.println("Wrong coffee choice");
                break;
        }
    }
    void take() {
        System.out.println("\nI gave you $" + money);
        money = 0;
    }
    void remaining() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
    }
    void fill() {
        System.out.println("\nWrite how many ml of water do you want to add:");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += sc.nextInt();
        System.out.println("Write how many ml of coffee beans do you want to add:");
        coffeeBeans += sc.nextInt();
        System.out.println("Write how many ml of disposable cups do you want to add:");
        disposableCups += sc.nextInt();
    }


    public static void main (String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        boolean condition;
       do {
              condition = machine.menu();
        } while (condition);

    }


    public boolean menu() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        String choice = this.sc.nextLine();
        switch (choice) {
            case "buy":
                this.buy();
                break;
            case "fill":
                this.fill();
                break;
            case "take":
                this.take();
                break;
            case "remaining":
                this.remaining();
                break;
            case "exit":
                return this.exit();
            default:
                break;
        }
        return true;
    }


}

