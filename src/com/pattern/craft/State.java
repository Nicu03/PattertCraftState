package com.pattern.craft;

abstract class State {
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

    abstract void toSiegeState();

    abstract void toTankState();

    abstract void move(int x,int y);

    abstract void move();
}
