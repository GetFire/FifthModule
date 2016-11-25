package HomeWork;

public class DAOImpl implements DAO {
    public Room[] DataBase = new Room[10];

    @Override
    public Room save(Room room) {
        for (int i = 0; i < DataBase.length; i++) {
            if (DataBase[i] == null) {
                DataBase[i] = room;
                break;
            }
            if (DataBase[i] != null) {
                Room[] DataBase1 = new Room[DataBase.length + 1];
                System.arraycopy(DataBase, 0, DataBase1, 0, DataBase.length);
                DataBase = DataBase1;
                DataBase[DataBase.length - 1] = room;
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
            if (DataBase[i].getId() == room.getId())
                DataBase[i] = room;
            System.out.println(room.getHotelName() + " обновлено");
            break;
        }

        return null;
    }

    @Override
    public Room findById(long id) {
        ;
        for (int i = 0; i < DataBase.length; i++) {
            if (DataBase[i].getId() == id)
                return DataBase[i];
            System.out.println("Результат поиска по ID" + DataBase[i].getHotelName());
            break;
        }
        System.out.println("По вашему запросу нет результатов");
        return null;
    }

    @Override
    public Room[] getAll() {

        return DataBase;
    }
}
