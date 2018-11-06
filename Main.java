import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    makeChange(3.5,5);

    }


    public static double makeChange (double itemCost, double dollarsProvided){

      double change = dollarsProvided - itemCost;
      System.out.println(change);
      return change;

      }

}







