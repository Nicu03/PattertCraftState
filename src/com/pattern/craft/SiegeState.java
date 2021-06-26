package com.pattern.craft;

public class SiegeState extends State {
    private static final int damage = 20;
    private static final boolean canMove = false;

    public SiegeState(Tank tank) {
        super(tank);
        super.damage = damage;
        super.canMove = canMove;
    }

    @Override
    boolean toSiegeState() {
        return false;
    }

    @Override
    boolean toTankState() {
        super.tank.changeState(new TankState(super.tank));
        return true;
    }
}
