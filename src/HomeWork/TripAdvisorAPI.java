package HomeWork;

import java.util.Date;

public class TripAdvisorAPI implements API {
    Room[]rooms;
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[5];
    }
    public TripAdvisorAPI() {
        Date date = new Date();
        rooms= new Room[5];
        rooms[0] = new Room(226,1200,100,date,"Малиновка","Фигуровка");
        rooms[1] = new Room(365, 1500, 400, date, "Hotel Valencia Riverwalk", "Сан-Антонио");
        rooms[2] = new Room(100241, 3000, 120, date, "Drury Plaza ", "Сан-Антонио");
        rooms[3] = new Room(22543, 2000, 1000, date, "Universal's Cabana Bay Beach Resort", "Орландо");
        rooms[4] = new Room(231478, 1500, 145, date, "Disney's Pop Century Resort", "Орландо");

    }
}
