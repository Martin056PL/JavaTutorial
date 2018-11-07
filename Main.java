public class Main {



    public static void main(String[] args) {
    countBlocks(10);

    }

    public static int countBlocks(int levels){

        int totalBlocks = 0;

        for (int i=1; i<=levels ; i++){
            int blocks = i*i;
            totalBlocks = totalBlocks+blocks;
            System.out.println("Total blocks: " + totalBlocks);
        }

        return 0;
    }

}







