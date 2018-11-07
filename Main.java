public class Main {


    public static void main(String[] args) {
        martingale();
    }


    public static int martingale() {
        int money = 1000;
        int target = 1200;
        int bet = 10;
        while (money > bet) {
            boolean win = play();
            if (win) {
                money += bet;
                bet = 10;
                System.out.println("Wygrałeś");
                if (money >= target) {
                    System.out.println("Jackpot!");
                    break;
                }
            } else {
                money -= bet;
                bet *= 2;
                System.out.println("Przegrałeś!");
                if (money < bet) {
                    System.out.println("Bankrut");
                    break;
                }
            }

        }
        return money;
    }

    public static boolean play(){
        boolean win;
        double doubleNumber = Math.random();
        doubleNumber = doubleNumber*2;
        doubleNumber = doubleNumber+1;
        int intNumber = (int) doubleNumber;
        if (intNumber==1){
            win = true;
        }else{
            win = false;
        }
        return win;
    }

}







