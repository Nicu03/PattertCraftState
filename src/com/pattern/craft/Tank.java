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

    public boolean toSiegeState() {
        return state.toSiegeState();
    }

    public boolean toTankState() {
        return state.toTankState();
    }

    public String move(){
        if (state.isCanMove()){
            return "You move to the new destination";
        }else{
            return "You can't move";
        }
    }

}
