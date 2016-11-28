package HomeWork;

public class DAOImpl implements DAO {
    private Room[] DataBase = new Room[10];

    public void setDataBase(Room dataBase) {
        this.save(dataBase);
    }

    public Room[] getDataBase() {
        return this.DataBase;
    }

    @Override
    public Room save(Room room) {

        for (int i = 0; i < DataBase.length; i++) {

            if (DataBase[i] == null) {
                DataBase[i] = room;
                break;

            }

        }
        System.out.println(room.getHotelName() + " был сохранен в Базе Данных");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        for (int i = 0; i < DataBase.length; i++) {
            if (DataBase[i].equals(room)) {
                DataBase[i] = null;
                System.out.println(room.getHotelName() + " был удален из Базы Данных");
                break;
            }

        }

        return false;
    }

    @Override
    public Room update(Room room) {

        for (int i = 0; i < DataBase.length; i++) {
            if (DataBase[i] == null) {
                continue;
            } else if (DataBase[i].getId() == room.getId()) {
                DataBase[i] = room;
                System.out.println(room.getHotelName() + " обновлено");
                break;
            }

        }
        return null;
    }

    @Override
    public Room findById(long id) {

        for (int i = 0; i < DataBase.length; i++) {
            if (DataBase[i] == null) {
                continue;
            } else if (DataBase[i].getId() == id) {
                System.out.println("Результат поиска: " + DataBase[i].getHotelName());

                return DataBase[i];
            }
        }

        System.out.println("Поиск не дал результатов");

        return null;
    }


    @Override
    public Room[] getAll() {

        return DataBase;
    }
}
