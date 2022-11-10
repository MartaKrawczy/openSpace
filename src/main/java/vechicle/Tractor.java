package vechicle;

public class Tractor extends Car{
    @Override
    public void sound() {
        System.out.println("trrrr");;
    }

    @Override
    public boolean engine(boolean isEngine) {
        return super.engine(isEngine);
    }

    @Override
    public void tires(int number) {
        tires(number);
    }
}
