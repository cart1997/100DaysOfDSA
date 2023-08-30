import java.util.ArrayList;
import java.util.List;

public class FindAllNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> op = new ArrayList<>();

        for(int i =0; i<nums.length;i++){

            int indx = Math.abs(nums[i])-1;
            if(nums[indx]>0) nums[indx] = nums[indx]* -1;
        }

        for(int i =0; i<nums.length;i++){
            if(nums[i]>0) op.add(i+1);
        }
    }
}
