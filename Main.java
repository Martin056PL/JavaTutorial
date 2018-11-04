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

    }
}
