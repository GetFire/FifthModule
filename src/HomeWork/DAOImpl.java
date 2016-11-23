package HomeWork;

public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
         System.out.println(room.getHotelName()+" был сохранен в Базе Данных");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.getHotelName()+" был удален из Базы Данных");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.getHotelName()+" обновлено");
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Результат поиска по ID"+id);
        return null;
    }

    @Override
    public Room[] getAll() {

        return new Room[0];
    }
}
