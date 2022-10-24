package openSpace;

public class Seat {

    protected static void numberOfdesk(MonitorPropertis monitorPropertis){
        Availability.booked(false); //initially the desk is not reserved
        Desk.size(100 + (int)(Math.random() * 80),90);
        Monitor.monitor(24,monitorPropertis);
    }
}
