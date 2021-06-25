package com.pattern.craft;

public class Tank {
    private State state;

    public Tank() {
        this.state = new TankState(this);
    }

    public void changeState(State state) {

        this.state = state;
    }

    public int getDamage() {
        return state.getDamage();
    }

    public boolean isCanMove() {
        return state.isCanMove();
    }

    public State getState() {
        return state;
    }

    public void toSiegeState() {
        state.toSiegeState();
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
