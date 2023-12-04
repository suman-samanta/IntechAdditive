

import java.util.Arrays;
import java.util.List;


//EXPLANATION OF THE CODE

//n is the number of coin denominations.
//If the target amount is 0, then the answer is 0, and the function returns early.
//dp is an array to store the minimum number of coins needed for each amount from 0 to the target amount.
//Arrays.fill(dp, amount + 1); initializes the dp array with a value greater than the maximum possible number of coins needed. 
//dp[0] = 0; initializes the base case: the minimum number of coins needed to make amount 0 is 0.

// 	DYNAMIC PROGRAMMING
//Nested loops iterate through each coin denomination and each possible amount.
//coins.get(i) is the value of the current coin.
//The inner loop starts from coins.get(i) because it's not possible to make amounts less than the value of the current coin.
//The if statement ensures that we don't go out of bounds while updating the dp array.
//dp[j] = Math.min(dp[j], 1 + dp[j - coins.get(i)]); updates the dp array with the minimum number of coins needed for the current amount.

//RESULT
//If dp[amount] is still greater than amount, it means it's not possible to make up the target amount with the given coins, so the function returns -1.
//Otherwise, it returns the minimum number of coins needed for the target amount.

public class E_CoinChange {

    public static int coinChange(List<Integer> coins, int amount) {
        int n = coins.size();
        if (amount == 0)
            return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coins.get(i); j <= amount; j++) {
                if (j - coins.get(i) >= 0)
                    dp[j] = Math.min(dp[j], 1 + dp[j - coins.get(i)]);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1, 3, 5);
        int amount = 6;
        System.out.println(coinChange(coins, amount));
    }
}

