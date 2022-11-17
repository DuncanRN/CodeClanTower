public class Bedroom extends Room{
    private int roomNumber;
    private RoomType roomType;

    private int price;

    public Bedroom(int roomNumber, RoomType roomType, int price){
        super(roomType.getCapacity());
        this.roomType=roomType;
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public int getRoomCapacity() {   // THIS IS NOT VERY DRY
        return this.roomType.getCapacity();
    }


    public int getPriceOfRoom() {
        return this.price;
    }
}
