import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    returnLikes(1,"nice",true);

    }

    public static int returnLikes(int currentLikes, String Comment, boolean like) {
        System.out.println("Feedback: " + Comment);
        if (like) {
            currentLikes = currentLikes + 1;
        }
        System.out.println("Number of likes: " + currentLikes);
        return currentLikes;
    }
}







