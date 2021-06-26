package com.pattern.craft;

public abstract class State {
    protected Tank tank;
    protected int damage;
    protected boolean canMove;

    public State(Tank tank) {
        this.tank = tank;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isCanMove() {
        return canMove;
    }

    abstract boolean toSiegeState();

    abstract boolean toTankState();
}
