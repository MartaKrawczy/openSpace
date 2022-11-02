package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    List<Desk> desks = generateDesks();

    }

    private static List<Desk> generateDesks() {
        List<Desk> desks = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            Desk desk = new Desk();
            desk.setBooked(new Random().nextBoolean());
            desks.add(desk);
        }
        return desks;
    }

}
