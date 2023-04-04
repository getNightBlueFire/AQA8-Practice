import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Calendar c = new GregorianCalendar();
        c.set(2000,2,1,2,1,60);

        Cat s = new Cat(1, "tom", c, "blue");


        Calendar c1 = new GregorianCalendar();
        c1.set(1994,5,10,16,10,1);





        Cat s1 = new Cat(2,"tom2", c1, "test");

        s1.setAnimalId(-1);


        System.out.println(s.toString());

        System.out.println(s1);
    }
}