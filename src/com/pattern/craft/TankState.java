package com.pattern.craft;

public class TankState implements ITank{

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public boolean getCanMove() {
        return true;
    }

    @Override
    public String move() {
        return "Can't move";
    }
}
