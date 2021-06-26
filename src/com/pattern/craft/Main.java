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
                switch (input) {
                    case "1": {
                        status(tank.toTankState(),"Normal Tank");
                        break;
                    }
                    case "2":{
                        status(tank.toSiegeState(),"Siege Tank");
                        break;
                    }

                    case "attack":{
                        System.out.println("Your damage is: " + tank.getDamage());
                        break;
                    }
                    case "move": {
                        String move = tank.move();
                        System.out.println(move);
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

    private static void status(Boolean status,String mode) {
        if(status) {
            System.out.println("State = " + mode);
        }else{
            System.out.println("Already in "+mode+" mode");
        }
    }
}
