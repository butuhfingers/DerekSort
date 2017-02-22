import java.util.Random;

/**
 * Created by derek on 2/20/17.
 */
public class DerekSort {
    private int[] dereksArray;


    //Constructor
    public DerekSort(int[] derekArray){
        this.dereksArray = derekArray;

        this.dereksConception();
    }

    public void dereksConception(){
        Random rand = new Random();
        long timesDereksSlept = 0;

        while(!isNotHeartBroken()){
            int position = rand.nextInt(dereksArray.length);
            int position2 = rand.nextInt(dereksArray.length);
            int temp = this.dereksArray[position];

            this.dereksArray[position] = this.dereksArray[position2];
            this.dereksArray[position2] = temp;

            timesDereksSlept++;

            if((timesDereksSlept % 1000000) == 0){
                System.out.println("Iterations: " + Math.floor(timesDereksSlept / 1000000) + " million");
            }
        }

        System.out.println("Iterations: " + Math.floor(timesDereksSlept / 1000000) + " million");
    }

    public boolean isNotHeartBroken(){
        //Go through the array
        for(int i = 0;i < this.dereksArray.length - 1;i++){
            if(this.dereksArray[i] > dereksArray[i+1]){
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString(){
        String arrayString = "";

        for(int i = 0;i < this.dereksArray.length;i++){
            arrayString += "" + this.dereksArray[i] + ", ";
        }

        return arrayString;
    }
}
