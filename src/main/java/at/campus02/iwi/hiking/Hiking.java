package at.campus02.iwi.hiking;

public class Hiking {

    public char[][] environment = {
            {'0', '0', '0', 'H', '0', '0', '0', '0', 'L', '0'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', 'H', '0', '0', 'H', 'H'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', 'H'},
            {'0', '0', '0', 'H', 'H', '0', '0', 'L', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', 'H', '0'},
            {'L', '0', '0', 'H', '0', '0', '0', '0', '0', '0'},

    };

    public void print() {
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                System.out.format("%c\t", environment[i][j]);
            }
            System.out.println();
        }
    }

    public int totalNrObstacles(char enemyType) {

        int count = 0;

        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                if (enemyType == 'H' && environment[i][j] == 'H') {
                    count++;
                }
                if (enemyType == 'L' && environment[i][j] == 'L') {
                    count++;
                }
            }

        }
        System.out.println(" Durch Hindernisse und Löcher ist der neue Stand: " + count);

        return count; // TODO IMPLEMENT ME
    }


    public int[] countObstaclesPerRow(int row) {

        int countH = 0;
        int countL = 0;
// if(row < environment.length){ ----> für Reihenzahl lt. Array, damit nicht darüber ist
        for (int i = 0; i < environment[row].length; i++) {

            if (environment[row][i] == 'H') {
                countH++;
            }
            if (environment[row][i] == 'L') {
                countL++;
            }
        }
        int rueckgabearray[] = {countH, countL};
        System.out.println(" Es gib H " + rueckgabearray[0] + " und L " + rueckgabearray[1]);
        return rueckgabearray; // TODO IMPLEMENT ME
    }

    public int energyNeededInRow(int row) {

        int energy = 0;


        for (int i = 0; i < environment[row].length; i++) {
            if (environment[row][i] == 'H') {
                energy = energy + 2;
            }

            if (environment[row][i] == 'L') {
                energy = -1;
                //  System.out.println(energy + " Loch, Spiel ist vorbei");
                break;
            }
        }
       // System.out.println("Für die Reihe  " + row + " ist das Energielevel notwendig: " + energy);


        return energy; // TODO IMPLEMENT ME
    }


    // Ich verstehe die Angabe NICHT!! und ich verstehe nicht, warum die Lösung so ist wie sie ist!
    public int ableToFinishHiking(int points) {

        int count = 0;


        for (int i = 0; i < environment.length; i++) {
                int ergebnis = energyNeededInRow(i);
                if ((ergebnis != -1) && (ergebnis <= points)) {
                    count++;
                }
            }

        return count; // TODO IMPLEMENT ME
    }

}
