package carRental;

public class Reserved {

    private static Reserved reserved;
    protected Reserved(){
    }

    public static Reserved  getReserved() {
        if(reserved == null) {
            reserved = new Reserved();
        }
        return reserved;
    }

}
