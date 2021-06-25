package com.pattern.craft;

public class TankState extends State {
    private static final int damage = 10;
    private static final boolean canMove = true;

    public TankState(Tank tank) {
        super(tank);
        tank.setDamage(damage);
        tank.setCanMove(canMove);
    }

    @Override
    void toSiegeState() {
        tank.changeState(new SiegeState(tank));
    }

    @Override
    void toTankState() {
        System.out.println("Already in TankState");
    }

    @Override
    void move(int x, int y) {
        System.out.println("Move to the X:"+x+" y:" +y);
    }

    @Override
    void move() {
        System.out.println("Move to the new location");
    }
}
