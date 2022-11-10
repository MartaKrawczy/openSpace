package vechicle;

public abstract class Car extends Vechicle {
    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public boolean engine(boolean isEngine) {
        isEngine = true;
        return isEngine;
    }

    public abstract void tires(int number);

}
