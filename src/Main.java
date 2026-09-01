import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms =new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();

        rooms.add(new Room(101, "Tek Kişilik", 1200.0));
        rooms.add(new Room(102, "Çift Kişilik", 1800.0));
        rooms.add(new Room(201, "Suit", 3000.0));

        customers.add(new Customer(1, "İlayda Kalender", "05551234567"));
        customers.add(new Customer(2, "Ayşe Yılmaz", "05321234567"));

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while(running){
            System.out.println("=== OTEL REZERVASYON SİSTEMİ ===\n" +
                    "1- Odaları Listele\n" +
                    "2- Müşterileri Listele\n" +
                    "3- Müşteri Ekle\n" +
                    "0- Çıkış\n" +
                    "Seçiminiz:");

            int choice = scanner.nextInt(); // Her döngüde kullanıcıdan yeni seçim alıyoruz.
            switch(choice){
                case 1:
                    for(Room room : rooms){
                        /*rooms listesindeki her odayı sırayla al ve o anki odaya room adını ver.*/
                        System.out.println("Oda: " + room.getRoomNumber()+ "-" + room.getRoomType()+ "-"
                                           + room.getPricePerNight() + "TL" );
                    }
                    break;

                case 2:
                    for(Customer customer: customers){
                        System.out.println("Müşteri ID: "+ customer.getCustomerId() + "-" + customer.getFullName()
                                + "-" + customer.getPhoneNumber());
                    }
                    break;

                case 3:
                    System.out.println("Müşteri ID giriniz: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Müşteri adı soyadını giriniz: ");
                    String fullName = scanner.nextLine();

                    System.out.println("Müşteri telefon numaarasını giriniz: ");
                    String phone = scanner.nextLine();

                    Customer customer = new Customer(id, fullName,phone );
                    customers.add(customer);

                    System.out.println("Müşteriler başarıyla oluşturuldu.");

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