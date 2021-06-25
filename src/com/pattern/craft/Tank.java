package com.pattern.craft;

public class Tank {
    private State state;
    private int damage;
    private boolean canMove;

    public Tank() {
        this.state = new TankState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public void toSiegeState() {
        state.toSiegeState();
    }

    public State getState() {
        return state;
    }

    public void toTankState() {
        state.toTankState();
    }

    public void move(int x, int y){
        state.move(x,y);
    }

    public void move(){
        state.move();
    }
}
