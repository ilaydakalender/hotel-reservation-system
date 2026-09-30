import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms =new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Reservation> reservations = new ArrayList<>();

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
                    "4- Rezervasyonları Listele\n" +
                    "5- Rezervasyon oluştur\n" +
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

                case 4:
                    for(Reservation reservation : reservations){
                        System.out.println("Rezervasyon bilgileri:\n" +
                                "Rezervasyon ID: " + reservation.getReservationId() + "\n" +
                                "Müşteri: " + reservation.getCustomer().getFullName() + "\n" +
                                "Oda: " + reservation.getRoom().getRoomNumber() + "\n" +
                                "Giriş Tarihi: " + reservation.getCheckInDate() + "\n" +
                                "Çıkış Tarihi: " + reservation.getCheckOutDate());
                    }
                    break;

                case 5:
                    System.out.println("Rezervasyon ID giriniz:");
                    int reservationId = scanner.nextInt();


                    System.out.println("Müşteri ID giriniz: ");
                    int customerId = scanner.nextInt();

                    System.out.println("Oda numarası giriniz: ");
                    int roomNum = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Giriş tarihini giriniz (YYYY-MM-DD): ");
                    String checkInInput = scanner.nextLine();
                    System.out.println("Çıkış tarihini giriniz (YYYY-MM-DD): ");
                    String checkOutInput = scanner.nextLine();

                    Customer selectedCustomer = null;
                    for(Customer currentCustomer : customers){
                        if(currentCustomer.getCustomerId() == customerId){
                            selectedCustomer = currentCustomer;
                            break;
                        }
                    }
                    if(selectedCustomer != null){
                        System.out.println("Müşteri: "+ selectedCustomer.getFullName());
                    }else{
                        System.out.println("Müşteri bulunamadı! ");
                        continue;
                    }

                    Room selectedRoom = null;
                    for(Room currentRoom: rooms){
                        if(currentRoom.getRoomNumber() == roomNum){
                            selectedRoom = currentRoom;
                            break;
                        }
                    }
                    if(selectedRoom != null){
                        System.out.println("Oda: " + selectedRoom.getRoomNumber());
                    }else{
                        System.out.println("Oda bulunamadı! ");
                        continue;
                    }

                    LocalDate checkInDate = LocalDate.parse(checkInInput); //checkInDate - LocalDate'e çevrilmiş giriş tarihi
                    LocalDate checkOutDate = LocalDate.parse(checkOutInput);
                    System.out.println("Giriş Tarihi: " + checkInDate);
                    System.out.println("Çıkış Tarihi: " + checkOutDate);
                    if(checkInDate.isAfter(checkOutDate) || checkInDate.isEqual(checkOutDate)){
                        System.out.println("Çıkış tarihi giriş tarihinden önce  veya aynı olamaz! ");
                        continue;
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