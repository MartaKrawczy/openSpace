package library;

public class Desk {

    private static int id = 1;
    private final int deskId;
    private boolean isBooked;
    public Desk() {
        id++;
        this.deskId = id;
  }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getDeskId() {
        return deskId;
    }
}
