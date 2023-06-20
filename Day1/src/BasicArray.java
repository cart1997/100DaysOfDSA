import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {

        // This array can able to store 5 integers
        int[] ids =new int[5];
        int startId = 101;
        System.out.println(ids.length); // gives length of an Array

        // To add an elements to an array
        for (int i = 0; i<ids.length;i++){
            ids[i] = startId;
            startId++;
        }
        System.out.println(Arrays.toString(ids)); // to view the result of an array must use the Arrays Library and convert it to String
    }
}
