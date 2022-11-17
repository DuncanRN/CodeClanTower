import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private String name;
    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void checkGuestIn(Guest guest, Room room){
        room.checkGuestIntoRoom(guest);
    }

    public Booking makeNewBooking(Bedroom bedroom, int nights) {
        return new Booking(bedroom, nights);
    }
}
