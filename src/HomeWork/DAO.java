package HomeWork;

public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(long id);
    Room findById(long id);
    Room[] getAll();
}
