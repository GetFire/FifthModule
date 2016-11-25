package HomeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println("----------------Запрашиваем комнаты по параметрам-----------------");
        Room[] param = controller.requstRooms(150, 1, "Лас-Вегас", "The Cosmopolitan");
        System.out.println(Arrays.toString(param));
        System.out.println();

        Room[] param1 = controller.requstRooms(150, 2, "New York", "Hilton");
        System.out.println(Arrays.toString(param1));
        System.out.println();

        Room[] param3 = controller.requstRooms(200, 1, "Дубай", "Atlantis The Palm");
        System.out.println(Arrays.toString(param3));
        System.out.println();


        System.out.println("------------СравнениеAPI--------------------");
        Room[] sad = controller.check(new BookingComAPI(), new GoogleAPI());
        Room[] sad1 = controller.check(new BookingComAPI(), new TripAdvisorAPI());
        Room[] sad2 = controller.check(new TripAdvisorAPI(), new GoogleAPI());

        System.out.println(Arrays.toString(sad));
        System.out.println();

        System.out.println(Arrays.toString(sad1));
        System.out.println();

        System.out.println(Arrays.toString(sad2));
        System.out.println();
        System.out.println("---------------Работаем с ДАО-----------------------------------");

        Room[] DB=controller.DataBase;
        //System.out.println(Arrays.toString(param3));
       // DB[0]=controller.save(param3[2]);
        System.out.println(Arrays.toString(DB));

    }
}

