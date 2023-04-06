package at.campus02.iwi.recursion;

public class MultiplicationDemoApp {
    public static void main(String[] args) {

        System.out.println(multiplicate(4,3));
        System.out.println(multiplicate(5,2));
        System.out.println(multiplicate(3,3));
        System.out.println(multiplicate(5,10));
    }

    public static int multiplicate(int number1, int number2){

        if (number2 == 0) {
            System.out.println("finished!");

        }
        else {
            return number1 +multiplicate(number1,number2-1);
        }


        return 0; // TODO: IMPLEMENT ME
    }


}
