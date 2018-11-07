public class Main {


    public static void main(String[] args) {
        double [] speed = {6.0,5.0,14.0};
        array(speed);
    }


    public static double array(double [] speed) {
        int size = speed.length;
        double min = speed[0];
        for(int i =1;i<size; i++){
            if(speed[i] < min){
                min = speed[i];
            }
        }
        System.out.println(min);
    return min;
    }

}







