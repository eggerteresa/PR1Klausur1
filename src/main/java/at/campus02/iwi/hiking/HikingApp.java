package at.campus02.iwi.hiking;

public class HikingApp {
    public static void main(String[] args) {
        Hiking a = new Hiking();
        a.print();
        a.countObstaclesPerRow(0);
        a.countObstaclesPerRow(1);
        a.countObstaclesPerRow(2);
        a.countObstaclesPerRow(5);
        a.energyNeededInRow(0);
        a.energyNeededInRow(7);
        System.out.println(" Der Zähler ist am Ende " +  a.ableToFinishHiking(6));
    }
}
