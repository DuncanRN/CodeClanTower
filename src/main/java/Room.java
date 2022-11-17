import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guestList;
    private int capacity;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
    }

    public void checkGuestIntoRoom(Guest guest) {
        this.guestList.add(guest);
    }

    public void checkGuestOutOfRoom(Guest guest) {
        this.guestList.remove(guest);
    }

    public int checkGuestListNumber(){
        return this.guestList.size();
    }
}
