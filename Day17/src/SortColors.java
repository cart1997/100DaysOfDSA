public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        int len = nums.length;


        int left = 0;
        int mid = 0;
        int right = len-1;

        while(mid<=right){
            if(nums[mid]==2){
                swap(nums, mid,right);
                right--;
            }
            else if(nums[mid]==0){
                swap(nums,mid,left);
                left++; mid++;
            }
            else
            {
                mid++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
