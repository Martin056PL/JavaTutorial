import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    rollDice();
    rollDice();

    }


    public static int rollDice (){

        double randomNumber = Math.random();
        randomNumber = randomNumber*6;
        randomNumber = randomNumber+1;
        int randomInt = (int) randomNumber;
        System.out.println("Roll: "+ randomInt);
        return randomInt;


      }

}







