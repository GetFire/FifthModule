package HomeWork;

import java.util.Date;

public class BookingComAPI implements API {
    public Room[] rooms;

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[5];
    }

    public BookingComAPI() {
        Date date = new Date();
        rooms= new Room[5];
        rooms[0] = new Room(123, 150, 350, date, "Inturist", "Kyiv");
        rooms[1] = new Room(225, 150, 360, date, "Metalist", "Lviv");
        rooms[2] = new Room(36012, 250, 350, date, "KharkivPalace", "Kharkiv");
        rooms[3] = new Room(126, 4500, 1000, date, "Hilton", "New York");
        rooms[4] = new Room(777, 12000, 90, date, "Rangers", "Las Vegas");

    }
}
