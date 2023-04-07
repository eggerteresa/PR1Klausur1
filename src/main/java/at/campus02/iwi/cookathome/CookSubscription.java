package at.campus02.iwi.cookathome;

import java.util.Locale;

public class CookSubscription {


    private int age;
    private boolean vegan;
    private boolean veggie;
    private int activePerWeek;

    public CookSubscription(int age, boolean vegan, boolean veggie, int activePerWeek) {
        this.age = age;
        this.vegan = vegan;
        this.veggie = veggie;
        this.activePerWeek = activePerWeek;
    }

    public CookSubscription(int age, boolean vegan, int activePerWeek) {
        this.age = age;
        this.vegan = vegan;
        this.activePerWeek = activePerWeek;
    }


    public CookSubscription(int age, int activePerWeek) {
        this.age = age;
        this.activePerWeek = activePerWeek;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isVeggie() {
        return veggie;
    }

    public void setVeggie(boolean veggie) {
        this.veggie = veggie;
    }

    public int getActivePerWeek() {
        return activePerWeek;
    }

    public void setActivePerWeek(int activePerWeek) {
        this.activePerWeek = activePerWeek;
    }


    public String firstBox(int age, boolean vegan, boolean veggie, int activePerWeek) {

        String boxname;
        if (vegan == true) {
            boxname = "Vegan";
        }
        if (veggie == true) {
            boxname = "Veggie";
        }
        if (activePerWeek >= 4 && age <= 60) {
            boxname = "Fish";
        }
        if (age <= 20 && age >= 60) {
            boxname = "Veggie";
        } else {
            boxname = "Vegan";
        }

        return boxname;
    }

    public double[] suggestPrice(String box, int age) {

        double[] preisliste = new double[2];
        box = box.toLowerCase();

        if (box.equals("fish")) {
            if (age <= 25) {
                preisliste[0] = 39.90;
            } else {
                preisliste[0] = 49.90;
            }
            preisliste[1] = 80;
        }

        if (box.equals("veggie")) {
            if (age <= 25 || age > 60) {
                preisliste[0] = 19.90;
            } else {
                preisliste[0] = 29.90;
            }
            preisliste[1] = 42;
        }


        if (box.equals("vegan")) {
            if (age < 30) {
                preisliste[1] = 45;
            } else {
                preisliste[1] = 49.90;
            }
            preisliste[0] = 15;
        }
        System.out.println(" Der Erstpreis ist: "+ preisliste[0] + " für die Folgebestelltung ist der Preis: " +preisliste[1]);
        return preisliste;
    }
}

