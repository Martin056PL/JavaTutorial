public class Main {


    public static void main(String[] args) {

        fractional(6);
    }


    public static double fractional(int n) {
        int sum = 1;
        for (int i = 1; i<=n; i++){
            sum = sum * i;
        }
        System.out.println("silnia = " + sum);
        return sum;
    }

}







