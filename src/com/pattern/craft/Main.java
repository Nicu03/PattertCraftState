package com.pattern.craft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();
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
                        tank.toTankState();
                        printTankStats(tank);
                        break;
                    }
                    case "2":{
                        tank.toSiegeState();
                        printTankStats(tank);
                        break;
                    }

//                    case "attack": {
////                        attack();
//                        break;
//                    }
//
                    case "move": {
                        tank.move();
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

    static void printTankStats(Tank tank){
        System.out.println("State = " + tank.getState().getClass().getName());
        System.out.println("Damage = " + tank.getDamage());
        System.out.println("CanMove: "+tank.isCanMove());
    }

}
