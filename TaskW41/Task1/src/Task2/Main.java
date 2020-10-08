package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Room room1 = new Room(10, 10, 300, 1);
        Room room2 = new Room(400, 40, 1, 0);
        Room room3 = new Room(10, 40, 29, 1234);

        ArrayList<Room> rooms = new ArrayList<Room>();

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);


        Building building1 = new Building(rooms, 100, 5000, false);

        printBuilding(building1);
        checkOffice(building1);

    }

       public static void printBuilding (Building b){

        int count = 0;
        for(Room r : b.getRooms()) {
           count += r.getNumberOfLamps();
        }
           System.out.println("number of lamps: " +count);
    }

    public static void checkOffice (Building b){
        if(b.getNumberOfFloors()>b.getRooms().size()){
            System.out.println("What is goin on MF");
        } else {
            System.out.println("This is an okey building");
        }
    }
}

