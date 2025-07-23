import hotel.Hotel;
import hotel.Room;

import java.util.Scanner;

public class App {

    public static Hotel hotel = new Hotel("Tuan Anh Hotel");


    public static void printMenu(){
        System.out.println("-----------------------------------------------------");
        System.out.println("--------------------Hotel Management-----------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("1. Configure room.");
        System.out.println("2. Configure employee.");
        System.out.println("3. Assign room to employee.");
        System.out.println("4. Get list of rooms by employee..");
        System.out.println("5. Caculate salary of employee.");
        System.out.println("6. Exit !");
    }

    public static void configRoom() throws RuntimeException{
        /*Luồng thực hiện:
        * Đọc id nhập vào từ người dùng
        * Tìm id đó trong list phòng
        * Cho phép chỉnh sửa các thông tin của phòng */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room id: ");
        String roomId = sc.nextLine();

        if(hotel.getRoomMap().get(roomId) != null){
            throw new RuntimeException("The room with id " + roomId + " already exists.");
        }else{

            System.out.print("Enter room name: ");
            String roomName = sc.nextLine();

            Room room = new Room(roomId, roomName);
            hotel.getRoomMap().put(roomId, room);
            System.out.println("Room with id " + roomId + " has been created.");
        }
    }

    public static void main(String[] arg){
        int option;
        Scanner sc = new Scanner(System.in);

        while(true){
            printMenu();
            try{
                option = sc.nextInt();
            } catch(Exception e){
                System.out.println("Exception at scanning option " + e);
                continue;
            }

            if (option == 0){
                break;
            }

            try {
                switch(option){
                    case 1 -> configRoom();
                    case 2 -> configEmployee();
                    case 3 -> assignRoomToEmployee();
                    case 4 -> getListOfRoomsByEmployee();
                    case 5 -> getSalary();
                    default -> System.out.println("Invalid option. Try again.");
                }
            } catch(Exception e){
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

    private static void getSalary() {
    }

    private static void getListOfRoomsByEmployee() {
    }

    private static void assignRoomToEmployee() {
    }

    private static void configEmployee() {
    }
}
