import java.net.StandardSocketOptions;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        /*Room room = new Room(101, "Tek Kisilik", 1200.0);
        System.out.println(room.getRoomNumber());
        System.out.println(room.getRoomType());
        System.out.println(room.getPricePerNight() + "TL"); */

        ArrayList<Room> rooms =new ArrayList<>();
        rooms.add(new Room(101, "Tek Kişilik", 1200.0));
        rooms.add(new Room(102, "Çift Kişilik", 1800.0));
        rooms.add(new Room(201, "Suit", 3000.0));

        for(Room room : rooms){
        /*rooms listesindeki her odayı sırayla al ve o anki odaya room adını ver.*/
            System.out.println("Oda: " + room.getRoomNumber()+ "-" + room.getRoomType()+ "-" + room.getPricePerNight() + "TL" );


        }


    }
}