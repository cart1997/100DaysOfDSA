public class Search2DArray {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{10,11,16,20}};
        int target = 3 ; // check if target is there are not

        int low = 0;
        int high = arr[arr.length-1][arr[0].length-1];

        System.out.println(high);

        //binary search

        while (low<=high){
            int mid = low + (high-low)/2;

            if (arr[low][high] == target){
                System.out.println(true);
            } else if (arr[low][high]<target) {

            }

        }

    }
}
