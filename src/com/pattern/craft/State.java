package com.pattern.craft;

public abstract class State {
    protected Tank tank;
    protected int damage;
    protected boolean canMove;
    protected IDriver driver;

    public State(Tank tank,IDriver driver) {
        this.tank = tank;
        this.driver = driver;
    }

    public IDriver getDriver() {
        return driver;
    }

    public void Infect(){
        driver = new ZergDriver();
    }

    public void Recover(){
        driver = new TerranDriver();
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
