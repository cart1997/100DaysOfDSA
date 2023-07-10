public class MissingNumber {

    public static void main(String[] args) {

       int[] arr = {1, 2, 3,4,6};

       int low = 0;
       int high = arr.length -1;

       while (high-low>=2){

           int mid = low + (high -low)/2;
           if ((arr[low] - low == 1) != (arr[mid] - mid  == 1)){
               high =mid;
           }
           else {
               low =mid;
           }
       }
        System.out.println(high+low/2);
    }
}
