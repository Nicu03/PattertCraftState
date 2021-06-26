package com.pattern.craft;

public class TankState extends State {
    private static final int damage = 10;
    private static final boolean canMove = true;

    public TankState(Tank tank) {
        super(tank);
        super.damage = damage;
        super.canMove = canMove;
    }

    @Override
    boolean toSiegeState() {
        super.tank.changeState(new SiegeState(super.tank));
        return true;
    }

    @Override
    boolean toTankState() {
        return false;
    }
}
