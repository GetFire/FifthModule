package HomeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        Controller controller = new Controller();

        System.out.println();
        System.out.println();
        System.out.println("----------------Запрашиваем комнаты по параметрам-----------------");
        Room[]param=controller.requstRooms(150,1,"Лас-Вегас","The Cosmopolitan");
        System.out.println(Arrays.toString(param));
        for (int i = 0; i < param.length; i++) {
            if(param[i]!=null)
                System.out.println(i+1+"."+param[i].toString());
        }
//
//
        System.out.println("------------BookingAPI--------------------");
        Room[] s = new BookingComAPI().getAll();
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println();


        System.out.println("------------GoogleAPI--------------------");
        Room[] s1 = new GoogleAPI().getAll();
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
            System.out.println();




        System.out.println("------------СравнениеAPI--------------------");
        Room[] sad = controller.check(new BookingComAPI(), new GoogleAPI());
        for (int i = 0; i < sad.length; i++) {
            System.out.println(i+1+"."+sad[i]);
        }
        System.out.println(Arrays.asList(Arrays.toString(sad)));












    }
}

