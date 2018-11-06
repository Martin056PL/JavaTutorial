public class Main {

    public static void main(String[] args) {

    playMusic();

    }

    boolean playButton = true; // true or false

    public void playMusic(){
        if(playButton){
            System.out.println("Music is playing");
        }else{
            System.out.println("Music is paused");
        }
    }
// Define a function playMusic() below.
// This should print out: "Music is playing" when playButton is true
// and "Music is paused" when playButton is false.



}
}
