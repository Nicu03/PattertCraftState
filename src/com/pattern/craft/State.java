package com.pattern.craft;

abstract class State {
    protected Tank tank;

    public State(Tank tank) {
        this.tank = tank;
    }

    abstract void toSiegeState();

    abstract void toTankState();

    abstract void move(int x,int y);

    abstract void move();
}
