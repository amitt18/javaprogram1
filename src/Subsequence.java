import java.util.Scanner;

public class Subsequence {
    static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        int maxLength = 1;

        // Each element is a subsequence of length 1
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }

        // Fill the dp array
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = lengthOfLIS(nums);
        System.out.println("Length of the longest increasing subsequence is: " + result);
    }
}
