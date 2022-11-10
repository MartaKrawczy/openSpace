package vechicle;

public class ElectricScooter extends Motor{
    @Override
    public void sound() {
        System.out.println("weee");
    }

    @Override
    public boolean engine(boolean isEngine) {
        return super.engine(isEngine);
    }

    @Override
    public void tires(int number) {
        super.tires(number);
    }
}
