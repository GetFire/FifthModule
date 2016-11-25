package HomeWork;

import java.util.Date;

public class GoogleAPI implements API {
    public Room[] rooms;


    public GoogleAPI() {
        Date date = new Date();
        rooms = new Room[5];
        rooms[0] = new Room(2263647, 200, 1, date, "Atlantis The Palm", "Дубай");
        rooms[1] = new Room(365552, 250, 2, date, "Burj Al Arab", "Дубай");
        rooms[2] = new Room(963852741, 150, 1, date, "The Cosmopolitan", "Лас-Вегас");
        rooms[3] = new Room(22543, 150, 2, date, "Universal's Cabana Bay Beach Resort", "Орландо");
        rooms[4] = new Room(11110121, 150, 3, date, "Resorts World", "Сентоза, Сингапур");

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] Google = new Room[0];
        for (int i = 0; i < rooms.length; i++) {
            if ((rooms[i].getPrice() == price) && (rooms[i].getPersons() == persons) && (rooms[i].getCityName().equals(city)) && (rooms[i].getHotelName().equals(hotel))) {
                Room[] Same1 = new Room[Google.length + 1];
                System.arraycopy(Google, 0, Same1, 0, Google.length);
                Google = Same1;
                Google[Google.length - 1] = rooms[i];
            }
        }
        return Google;
    }
    @Override
    public Room[] getAll() {
        return this.rooms;
    }

}
