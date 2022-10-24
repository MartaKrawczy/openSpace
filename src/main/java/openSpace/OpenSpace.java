package openSpace;
import java.sql.Timestamp;
import java.time.Instant;

public class OpenSpace{

    public static void main(String[] args) {

        System.out.println("My bookin " + Timestamp.from(Instant.now()).toString().substring(0,16)+"\n");

        Seat.numberOfdesk(MonitorPropertis.DELL);
        Seat.numberOfdesk(MonitorPropertis.SAMSUNG);

        //possibility to manually select the properties of the desk and monitor
        Availability.booked(true);
        Desk.size(160,95);
        Monitor.monitor(21,MonitorPropertis.DELL);

    }

}
