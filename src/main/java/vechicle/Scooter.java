package vechicle;

public class Scooter extends ElectricScooter{
    @Override
    public void sound() {
        super.sound();
    }

    @Override
    public boolean engine(boolean isEngine) {
        isEngine = false;
        return engine(isEngine);
    }

    @Override
    public void tires(int number) {
        super.tires(number);
    }
}
