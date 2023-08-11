public class HouseRobbing {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        int len = nums.length;
        int[] dp =new int[len];

        // null and single case
        if (len==1) System.out.println( nums[0]);

        // 0 and 1
        dp[0] = nums[0]; dp[1] = Math.max(dp[0],nums[1]);

        for (int i =2; i<len; i++){
            dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        System.out.println(dp[len-1]);
    }
}
