package com.pattern.craft;

import java.util.Scanner;

public class Main {
    public static ITank state;
    public static SiegeState siegeState;
    public static TankState tankState;

    public static void main(String[] args) {
        tankState = new TankState();
        siegeState = new SiegeState();
        toTankMode();
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.print("Ready for a new command sir: ");
            String input = userInput.nextLine();
            if (input.isEmpty()) {
                System.out.println("Nothing to do");
            } else {
//                clearConsole();
                switch (input) {
                    case "1": {
                        toTankMode();
                        break;
                    }
                    case "2": {
                        toSiegeMode();
                        break;
                    }

                    case "attack": {
                        attack();
                        break;
                    }

                    case "move": {
                        state.move();
                        break;
                    }

                    case "quit": {
                        System.exit(0);
                        break;
                    }
                    default:
                        System.out.println("Nothing to do");
                }
            }
        }
    }

    private static void clearConsole() {
        for (int i = 0; i < 9; i++) {
            System.out.println();
        }
    }

    private static void toTankMode() {
        state = tankState;
        printState();
    }

    private static void toSiegeMode() {
        state = siegeState;
        printState();
    }

    private static void attack() {
        System.out.println("Damage is: " + state.getDamage());
    }

    private static void printState() {
        System.out.println("State: " + state.getClass().getName() + "\n Damage: "
                + state.getDamage() + "\n canMove: " + state.getCanMove());
    }
}
