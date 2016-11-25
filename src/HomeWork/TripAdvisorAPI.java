package HomeWork;

import java.util.Date;

public class TripAdvisorAPI implements API {
    public Room[]rooms;

    public TripAdvisorAPI() {
        Date date = new Date();
        rooms= new Room[5];
        rooms[0] = new Room(126, 150, 2, date, "Hilton", "New York");
        rooms[1] = new Room(963852741, 150, 1, date, "The Cosmopolitan", "Лас-Вегас");
        rooms[2] = new Room(100241, 200, 1, date, "Drury Plaza ", "Сан-Антонио");
        rooms[3] = new Room(22543, 150, 2, date, "Universal's Cabana Bay Beach Resort", "Орландо");
        rooms[4] = new Room(365552, 250, 2, date, "Burj Al Arab", "Дубай");

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] Trip = new Room[0];
        for (int i = 0; i < rooms.length; i++) {
            if ((rooms[i].getPrice() == price) && (rooms[i].getPersons() == persons) && (rooms[i].getCityName().equals(city)) && (rooms[i].getHotelName().equals(hotel))) {
                Room[] Same1 = new Room[Trip.length + 1];
                System.arraycopy(Trip, 0, Same1, 0, Trip.length);
                Trip = Same1;
                Trip[Trip.length - 1] = rooms[i];
            }
        }
        return Trip;
    }

    @Override
    public Room[] getAll() {
        return this.rooms;
    }
}
