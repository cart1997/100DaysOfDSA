public class FirstAndLastIndex {

    public int[] searchRange(int[] nums, int target) {

        int first = bsFirst(nums, target);
        int last = bsLast(nums,target);
        return new int[]{first,last};
    }
    private int bsFirst(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){

            int mid = low + (high-low)/2;

            if(nums[mid]==target){

                if(mid == 0 || nums[mid]>nums[mid-1]){
                    return mid;

                }
                else{
                    high = mid-1;

                }

            }

            else if(nums[mid]<target){

                low = mid + 1;
            }
            else{

                high = mid - 1;
            }

        }

        return -1;

    }

    private int bsLast(int[] nums, int target){

        int low = 0;
        int high = nums.length-1;

        while(low<=high){

            int mid = low + (high-low)/2;

            if(nums[mid]==target){

                if(mid == nums.length-1 || nums[mid]<nums[mid+1]){
                    return mid;
                }
                else{
                    low = mid+1;
                }

            }

            else if(nums[mid]<target){

                low = mid + 1;
            }
            else{

                high = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        FirstAndLastIndex range = new FirstAndLastIndex();

        range.searchRange(new int[]{5, 7, 7, 8, 8, 1, 5},8);

    }
}