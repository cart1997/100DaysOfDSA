public class CoinChangeII {

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 5;

        int[][] dp = new int[coins.length+1][amount+1];
        for (int i =0; i< dp.length;i++){
            dp[i][0] = 1;
        }


        for (int i =1; i<dp.length;i++){
            for (int j= 1; j<dp[0].length;j++){

                if (j<coins[i-1]){

                    dp[i][j] = dp[i-1][j];

                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j- coins[i-1]];
                }

            }
        }
        System.out.println(dp[coins.length][amount]);
    }
}
