package openSpace;

public class Availability {

    //initially the desk is not reserved
    void booked(boolean reservation){
        if (reservation ==false) {
            reservation = true;
        } else
            reservation = false;
            System.out.println("Reservation status: " + reservation); //information whether it was possible to book a desk
    }
}
