package openSpace;
import java.sql.Timestamp;
import java.time.Instant;

public class OpenSpace{

    public static void main(String[] args) {

        System.out.println("My bookin " + Timestamp.from(Instant.now()).toString().substring(0,16)+"\n ");

        Availability availability = new Availability();
        Desk desk = new Desk();
        Monitor monitor = new Monitor();

        Seat.numberOfdesk(MonitorPropertis.DELL);
        Seat.numberOfdesk(MonitorPropertis.SAMSUNG);

        //possibility to manually select the properties of the desk and monitor
        availability.booked(true);
        desk.size(160,95);
        monitor.monitor(21,MonitorPropertis.DELL);

    }

}
