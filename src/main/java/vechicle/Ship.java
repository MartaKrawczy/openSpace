package vechicle;

public abstract class Ship extends Vechicle{
    @Override
    public boolean engine(boolean isEngine) {
        return isEngine;
    }

    public abstract boolean canSwim();
}
