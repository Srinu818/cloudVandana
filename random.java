import java.util.Arrays;
import java.util.Random;

public class random{
	public static void main(String[] args){
	    int[] myArray = {1, 2, 3, 4, 5};
	    shuffleArray(myArray);
	    System.out.println(Arrays.toString(myArray));
	}
	public static void shuffleArray(int[] array) {
        int n = array.length;
        Random rand = new Random();
        for (int i=n-1; i>0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}