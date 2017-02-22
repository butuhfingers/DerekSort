import java.util.Random;

/**
 * Created by derek on 2/20/17.
 */
public class Index {
    public static void main(String[] args){
        //Run this code
        int yearsUntilHeartBreak = 15;
        Random dereksMemories = new Random();

        int[] dereksLife = new int[yearsUntilHeartBreak];

        //Fill up the array with random ints
        for(int i = 0;i < dereksLife.length;i++){
            int rand = dereksMemories.nextInt(yearsUntilHeartBreak);

            dereksLife[i] = rand;
            System.out.println(dereksLife[i]);
        }

        DerekSort sort = new DerekSort(dereksLife);
        System.out.println(sort.toString());
    }
}
