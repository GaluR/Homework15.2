import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Station {
    public static void main(String[] args) {
        Queue<Vehicle> vehicles = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Masz następujące opcje do wyboru: ");
        System.out.println("0 - program zakończy swoje działanie");
        System.out.println("1 - program wczyta informacje o nowym pojeździe i pojazd ten zostanie dodany do kolejki");
        System.out.println("2 - z kolejki powinien zostać pobrany kolejny pojazd, który zostanie poddany przeglądowi.");
        int choice;
        do{
            System.out.println("Podaj wartość: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Program pomyślnie zamknięty.");
                    break;
                case 1:
                    loadVehicle(vehicles, scan);
                    break;
                case 2:
                    System.out.println("Następny pojazd, który zostanie poddany przeglądowi to: ");
                    System.out.println(vehicles.peek());
                    vehicles.poll();

                    break;
                default:
                    System.out.println("Nie ma takiej opcji do wyboru");
            }
        }while(choice!=0);
    }

    private static void loadVehicle(Queue<Vehicle> vehicles, Scanner scan) {
        Vehicle vehicle1 = new Vehicle();
        System.out.println("Podaj typ pojazdu: ");
        vehicle1.setType(scan.nextLine());
        System.out.println("Podaj markę pojazdu: ");
        vehicle1.setMark(scan.nextLine());
        System.out.println("Podaj model pojazdu: ");
        vehicle1.setModel(scan.nextLine());
        System.out.println("Podaj rocznik pojazdu: ");
        vehicle1.setDate(scan.nextInt());
        scan.nextLine();
        System.out.println("Podaj przebieg pojazdu: ");
        vehicle1.setCourse(scan.nextInt());
        scan.nextLine();
        System.out.println("Podaj numer VIN pojazdu: ");
        vehicle1.setVINNumber(scan.nextLine());
        vehicles.offer(vehicle1);
    }
}
