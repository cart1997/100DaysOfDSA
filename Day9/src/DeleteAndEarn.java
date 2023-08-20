public class DeleteAndEarn {
    public static void main(String[] args) {

        int [] nums = {2,2,3,3,3,4};

        int max = 0;

        for (int num:nums) {
            max = Math.max(max,num);
        }

        int[] arr = new int[max+1];

        for (int num: nums) {
            arr[num] += num;
        }

        int choose = arr[0];
        int notchoose = arr[1];

        for (int i =2; i<arr.length;i++){

            int temp = choose;
            choose = Math.max(choose,notchoose);
            notchoose = temp +arr[i];

        }
        System.out.println(Math.max(choose,notchoose));

    }
}
