public class array {

    public static void main(String[] args) {

        int [] array={5,2,3,4};
        minArray(array);

    }

    public static int minArray(int array []){
     int size = array.length;
     int min = array[0];
     for(int i=1; i<size; i++){
         if(array[i] < min){
             min=array[i];
         }
     }
       System.out.println(min);
       return min;
    }

}
