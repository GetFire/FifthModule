package HomeWork;


public class Controller  {
    private API[] apis = {new BookingComAPI(), new TripAdvisorAPI(), new GoogleAPI()};
    private DAOImpl dao = new DAOImpl();


    //public API[] apis = new API[3];

//    public Controller(){
//        API[] apis = {new BookingComAPI(), new TripAdvisorAPI(), new GoogleAPI()};
//    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] DB;
        Room[] DB1;
        Room[] DB2;
        Room[] DB3;

        Room[] arr1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] arr2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] arr3 = apis[2].findRooms(price, persons, city, hotel);

        Room[] db1 = new Room[arr1.length + 1];
        System.arraycopy(arr1, 0, db1, 0, arr1.length);
        DB1 = db1;


        Room[] db2 = new Room[arr2.length + 1];
        System.arraycopy(arr2, 0, db2, 0, arr2.length);
        DB2 = db2;


        Room[] db3 = new Room[arr3.length + 1];
        System.arraycopy(arr3, 0, db3, 0, arr3.length);
        DB3 = db3;


        DB = new Room[DB1.length + DB2.length];
        System.arraycopy(DB1, 0, DB, 0, DB1.length);
        System.arraycopy(DB2, 0, DB, DB1.length, DB2.length);
        DB1 = DB;

        DB = new Room[DB1.length + DB3.length];
        System.arraycopy(DB1, 0, DB, 0, DB1.length);
        System.arraycopy(DB3, 0, DB, DB1.length, DB3.length);

        return DB;
    }

    public Room[] check(API api1, API api2) {
        int count = 0;
        Room[] dataBase = new Room[5];
        Room[] same1 = api1.getAll();
        Room[] same2 = api2.getAll();
        for (int i = 0; i < same1.length; i++) {
            for (int j = 0; j < same2.length; j++) {
                if (same1[i].equals(same2[j])) {
                    dataBase[i] = same1[i];
                }
            }
        }
        for (int i = 0; i < dataBase.length; i++) {
            if (dataBase[i] == null)
                count++;

        }

        if (count >= 5) {
            System.out.println("Нет одинаковых комнат");
            Room[] zeroRooms = new Room[0];
            return zeroRooms;
        } else
            return dataBase;

    }

    public DAOImpl getDao() {
        return this.dao;
    }

    public void setDao(DAOImpl dao) {
        this.dao = dao;
    }

    public API[] getApis() {
        return this.apis;
    }
}

