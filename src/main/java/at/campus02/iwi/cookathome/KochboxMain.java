package at.campus02.iwi.cookathome;

import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class KochboxMain {
    public static void main(String[] args) {

        CookSubscription person1 = new CookSubscription(23,true, false, 2);
        CookSubscription person2 = new CookSubscription(35, true, false, 2);
        CookSubscription person3 = new CookSubscription(63, false, true, 4);
       CookSubscription person4 = new CookSubscription(25, false, false, 0);

        System.out.println("Erste Person:");
        System.out.println("Empfohlene Box: " +person1.firstBox(23, true, false, 2));
        System.out.println("Der empfohlene Preis ist für den Erstpreis bzw. für den Zweitpreis: " );

        person1.suggestPrice("vegan", 23);
    }
}
