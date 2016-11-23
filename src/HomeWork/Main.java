package HomeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller cont = new Controller();
        Room[]sad= cont.requstRooms(250, 2,"Дубай","Burj Al Arab");
        for (int i = 0; i < sad.length; i++) {
            if(sad[i]!=null)
            System.out.println(sad[i]);
        }





    }
}
