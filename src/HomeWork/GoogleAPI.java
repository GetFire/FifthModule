package HomeWork;

import java.util.Date;

public class GoogleAPI implements API {
    public Room[]rooms;
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[5];
    }
    public GoogleAPI() {
        Date date = new Date();
        rooms= new Room[5];
        rooms[0] = new Room(2263647,900,12000,date,"Atlantis The Palm","Дубай");
        rooms[1] = new Room(365552, 1500, 1300, date, "Burj Al Arab", "Дубай");
        rooms[2] = new Room(963852741, 1200, 2000, date, "The Cosmopolitan", "Лас-Вегас");
        rooms[3] = new Room(3654, 500, 1500, date, "The Venetian", "Макао, Китай");
        rooms[4] = new Room(11110121, 600, 5000, date, "Resorts World", "Сентоза, Сингапур");

    }
}
