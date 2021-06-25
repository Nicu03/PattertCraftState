package com.pattern.craft;

public class SiegeState extends State {
    private static final int damage = 20;
    private static final boolean canMove = false;

    public SiegeState(Tank tank) {
        super(tank);
        tank.setDamage(damage);
        tank.setCanMove(canMove);
    }

    @Override
    void toSiegeState() {
        System.out.println("Already in SiegeState");
    }

    @Override
    void toTankState() {
        tank.changeState(new TankState(tank));
    }

    @Override
    void move(int x, int y) {
        System.out.println("Can't move");
    }

    @Override
    void move() {
        System.out.println("Can't move");
    }
}
