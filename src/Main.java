import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Scanner;
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

        Scanner scanner = new Scanner(System.in); //Scanner nesnesi

        boolean running = true;

        while(running){
            System.out.println("=== OTEL REZERVASYON SİSTEMİ ===\n" +
                    "1- Odaları Listele\n" +
                    "0- Çıkış\n" +
                    "Seçiminiz:");

            int choice = scanner.nextInt(); // bu while dışındayken geçersiz seçim yaptığında sonsuz döngüye giriyo
            switch(choice){
                case 1:
                    for(Room room : rooms){
                        /*rooms listesindeki her odayı sırayla al ve o anki odaya room adını ver.*/
                        System.out.println("Oda: " + room.getRoomNumber()+ "-" + room.getRoomType()+ "-"
                                           + room.getPricePerNight() + "TL" );
                        // running = false; bu burda olduğunda odaları listelediğinde programın kapanıyor ama biz menüye dönsün istiyoruyz
                    }
                    break;
                case 0:
                    running = false;
                    System.out.println("Program kapatılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");

            }
        }
        scanner.close();





    }
}