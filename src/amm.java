
import java.util.*;

public class amm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // Length of the string
            int[][] cost = new int[N][4]; // cost[i][0] = cost for 2, cost[i][1] = cost for 4, etc.

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 4; j++) {
                    cost[i][j] = sc.nextInt();
                }
            }

            // dp[i][j] -> min cost to reach position i with digit j (0-3)
            int[][] dp = new int[N][4];

            // Initialize first position
            for (int j = 0; j < 4; j++) {
                dp[0][j] = cost[0][j];
            }

            // Fill dp table
            for (int i = 1; i < N; i++) {
                for (int j = 0; j < 4; j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = 0; k < 4; k++) {
                        if (j != k) {
                            dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + cost[i][j]);
                        }
                    }
                }
            }

            // Find the minimum in the last row
            int minCost = Integer.MAX_VALUE;
            for (int j = 0; j < 4; j++) {
                minCost = Math.min(minCost, dp[N - 1][j]);
            }

            System.out.println(minCost);
        }
    }
}

