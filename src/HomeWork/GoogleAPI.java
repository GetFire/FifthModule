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
        Room[] google = new Room[0];
        Date data1=new Date();
        Room sravnenueKomnat= new Room(236544,price,persons,data1,hotel,city);
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(sravnenueKomnat)){
                Room[] Same2 = new Room[google.length + 1];
                System.arraycopy(google, 0, Same2, 0, google.length);
                google = Same2;
                google[google.length - 1] = rooms[i];
            }
        }
        return google;
    }
    @Override
    public Room[] getAll() {
        return this.rooms;
    }

}
