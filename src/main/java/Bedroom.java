public class Bedroom extends Room{
    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType){
        super(roomType.getCapacity());
        this.roomType=roomType;
        this.roomNumber = roomNumber;
    }

    public int getRoomCapacity() {   // THIS IS NOT VERY DRY
        return this.roomType.getCapacity();
    }
}
