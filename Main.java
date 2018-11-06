public class Main {



    public static void main(String[] args) {

        abc();
    }

    public static int rollDice(){

        double dNumber = Math.random();
        dNumber = dNumber*6;
        dNumber = dNumber+1;
        int intNumber = (int) dNumber;
        return intNumber;
    }

    public static int abc(){
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        int dice4 = rollDice();
        int dice5 = rollDice();
        int dice6 = rollDice();
        int dice7 = rollDice();
        int i = 1;
        while(!(dice1==dice2&&dice2==dice3&&dice3==dice4&&dice4==dice5&&dice5==dice6&&dice6==dice7)){
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();
            dice6 = rollDice();
            dice7 = rollDice();
            i=i+1;
        }
        System.out.println(i);
        return i;
    }
}







