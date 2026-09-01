public class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    public Room(int roomNumber, String roomType, double pricePerNight){
        //constructor
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber(){
        return roomNumber;
    }
    public String getRoomType(){
        return roomType;
    }
    public double getPricePerNight(){
        return pricePerNight;
    }
}
