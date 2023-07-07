public class FindMinimum {

    public int findMin(int[] nums) {

        int low = 0;
        int high = nums.length-1;

        while (low<=high){

            if(nums[low]<=nums[high]) return nums[low];
            int mid = low + (high-low)/2;

            if((mid == 0 || nums[mid]<nums[mid-1]) && (mid == nums.length-1 || nums[mid]<nums[mid+1])){
                return nums[mid];
            }
            else if (nums[low]<=nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        FindMinimum fm = new FindMinimum();
        int op = fm.findMin(new int[]{3, 4, 5, 1, 2});

        System.out.println(op);

    }

}
