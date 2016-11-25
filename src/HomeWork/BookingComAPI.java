package HomeWork;

import java.util.Date;

public class BookingComAPI implements API {
    public Room[] rooms;


    public BookingComAPI() {
        Date date = new Date();
        rooms = new Room[5];
        rooms[0] = new Room(963852741, 150, 1, date, "The Cosmopolitan", "Лас-Вегас");
        rooms[1] = new Room(365552, 250, 2, date, "Burj Al Arab", "Дубай");
        rooms[2] = new Room(36012, 150, 2, date, "KharkivPalace", "Kharkiv");
        rooms[3] = new Room(126, 150, 2, date, "Hilton", "New York");
        rooms[4] = new Room(22543, 150, 2, date, "Universal's Cabana Bay Beach Resort", "Орландо");

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] Booking = new Room[0];
        for (int i = 0; i < rooms.length; i++) {
            if ((rooms[i].getPrice() == price) && (rooms[i].getPersons() == persons) && (rooms[i].getCityName().equals(city)) && (rooms[i].getHotelName().equals(hotel))) {
                Room[] Same1 = new Room[Booking.length + 1];
                System.arraycopy(Booking, 0, Same1, 0, Booking.length);
                Booking = Same1;
                Booking[Booking.length - 1] = rooms[i];
            }
        }
        return Booking;
    }

    @Override
    public Room[] getAll() {
        return this.rooms;
    }
}
