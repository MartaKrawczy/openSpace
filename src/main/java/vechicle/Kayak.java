package vechicle;

public class Kayak extends Ship{

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean engine(boolean isEngine) {
        return super.engine(isEngine);
    }
}
