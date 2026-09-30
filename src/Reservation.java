import java.time.LocalDate;

public class Reservation {
    private int reservationId;
    private Customer customer; //Rezervasyonun içinde customer nesnesi ile room nesnesini birbirine bağlıyoruz.
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    public Reservation(int reservationId, Customer customer, Room room, LocalDate checkInDate, LocalDate checkOutDate){
        this.reservationId = reservationId;
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    public int getReservationId(){
        return reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }
}
