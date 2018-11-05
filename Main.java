public class Main {

    public static void main(String[] args) {

        boolean isStudent = true;
        int ticketPrice = 10;
        int age = 30;

        if((age<=15||age>60)||isStudent){
            System.out.println("Discount! 5$ for ticket");
        }else{
            System.out.println("Normal ticket");
        }
    }
}
