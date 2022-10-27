package openSpace;

public class Seat {

    protected static void numberOfdesk(MonitorPropertis monitorPropertis){
        Availability availability = new Availability();
        Desk desk = new Desk();
        Monitor monitor = new Monitor();

       availability.booked(false); //initially the desk is not reserved
       desk.size(100 + (int)(Math.random() * 80),90);
       monitor.monitor(24,monitorPropertis);
    }
}
