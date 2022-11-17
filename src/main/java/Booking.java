public class Booking {

    private int numberOfNights;
    private Bedroom bedroom;
    public Booking(Bedroom bedroom, int numberOfNights) {
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }


    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public int getTotalPriceForBooking() {
        return  (numberOfNights * bedroom.getPriceOfRoom());
    }
}
