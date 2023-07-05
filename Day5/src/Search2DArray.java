public class Search2DArray {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4},{10,11,16,20},{23,30,34,60}};
        int target = 3 ; // check if target is there are not

        int low = 0;
        int m = arr.length;
        int n = arr[0].length;
        int high = (m*n) - 1;

        //binary search

        while (low<=high){

            int mid = low+(high-low)/2;

            int r = mid/n;
            int c = mid%n;

            if (arr[r][c] == target){
                System.out.println(true);
            } else if (arr[r][c]<target) {

                low = mid +1;
            }
            else {

                high = mid-1;
            }

        }

    }
}
