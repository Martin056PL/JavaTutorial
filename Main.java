public class Main {



    public static void main(String[] args) {

        String driver= "Hamish";
        int letters = driver.length();

        driver = driver.toUpperCase();

        System.out.println(letters);
        System.out.println(driver);

        String driverFirstName = "Kamil";
        String driverLastName = "Kowalski";
        String driverFullName = driverFirstName + " " + driverLastName;
        System.out.println(driverFullName);

        int stops = 3;
        int fare = 15;

        System.out.println("The bus made $" + fare+ " after " + stops + " stops");

        double div = 24/5.0;
        System.out.println(div);

        double current = 17;
        double rate = 1.5;
        double future = current*rate;
        System.out.println(future);
        int approx = (int) future;
        System.out.println(approx);

        int x = 5;
        int y = 2;
        double div2 = x/y;
        System.out.println(x/y);
        double accurate = (double) x/y;
        System.out.println(accurate);

    }
}
