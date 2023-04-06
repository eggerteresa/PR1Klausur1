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

    public double[] [] suggestPrice(String box, int age) {

        double[][] preisliste = new double[3][2];
        box = box.toLowerCase();

        for (int i = 0; i < preisliste.length; i++) {
            for (int j = 0; j < preisliste[i].length; j++) {
                if (box.equals("fish")) {
                    preisliste[0][0] = 49.90;
                    preisliste[0][1] = 80;
                }
                if (box.equals("fish") && age <= 25) {
                    preisliste[0][0] = 39.90;
                    preisliste[0][1] = 80;
                }
                if (box.equals("veggie")) {
                    preisliste[1][0] = 29.90;
                    preisliste[1][1] = 42;
                }
                if (box.equals("veggie") && age <= 25 || box.equals("veggie") && age > 60) {
                    preisliste[1][0] = 19.90;
                    preisliste[1][1] = 42;
                }

                if (box.equals("vegan")) {
                    preisliste[2][0] = 15;
                    preisliste[2][1] = 49.90;
                }
                if (box.equals("vegan") && age < 30) {
                    preisliste[2][0] = 15;
                    preisliste[2][1] = 45;
                }

               if (preisliste[i] [j] != 0) {System.out.println(preisliste[i] [j]);
               }
            }
            System.out.println();
        }
     return preisliste;
    }
}

