public class ProductOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = new int [nums.length];

        int temp = 1;
        res[0] = temp;

        for(int i =1; i<nums.length;i++){
            temp = temp*nums[i-1];
            res[i] = temp;
        }

        //right

        temp = 1;
        // res[nums.length-1] =1;
        for(int i=nums.length-2;i>=0;i--){
            temp = temp*nums[i+1];
            res[i] = res[i]*temp;
            System.out.println(i);
        }
    }
}
