package library;

public class Desk {

    private final Long deskId;
    private BookedStatus bookedStatus;

    public Desk(Long deskId) {
        this.bookedStatus = BookedStatus.FREE;
        this.deskId = deskId;
    }

    public void updateStatus(BookedStatus bookedStatus) {
        this.bookedStatus = bookedStatus;
    }

    public Long getDeskId() {
        return deskId;
    }

    public BookedStatus getBookedStatus() {
        return bookedStatus;
    }
}
