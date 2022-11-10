package vechicle;

public class Motor extends Car{
    @Override
    public void sound() {
        System.out.println("wrrr");
    }

    @Override
    public boolean engine(boolean isEngine) {
        return engine(isEngine);
    }

    @Override
    public void tires(int number) {
        number = 2;
        tires(number);
    }
}
