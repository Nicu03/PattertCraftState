package com.pattern.craft;

public class SiegeState implements ITank{

    @Override
    public int getDamage() {
        return 20;
    }

    @Override
    public boolean getCanMove() {
        return false;
    }

    @Override
    public String move() {
        return "We move to the new location";
    }
}
