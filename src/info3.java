import java.util.*;

public class info3 {

    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        // Example usage
        List<Integer> A = Arrays.asList(1, 2, 3, 4,5,6);
        int n = A.size();
        System.out.println(getans(n, A)); // Output: 2
    }

    public static int getans(int n, List<Integer> A) {
        int[] arr = A.stream().mapToInt(i -> i).toArray();
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: one way to partition an empty array

        // Precompute MEX values for all subarrays
        int[][] beauty = new int[n][n];
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                beauty[start][end] = computeLIS(arr, start, end);
            }
        }

        // Compute number of valid partitions
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (beauty[j][i - 1] > (j == 0 ? 0 : beauty[0][j - 1])) {
                    dp[i] = (dp[i] + dp[j]) % MOD;
                }
            }
        }

        return dp[n];
    }

    private static int computeLIS(int[] A, int start, int end) {
        int length = end - start + 1;
        int[] dp = new int[length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[start + i] > A[start + j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLIS = 0;
        for (int i = 0; i < length; i++) {
            maxLIS = Math.max(maxLIS, dp[i]);
        }
        return maxLIS;
    }
}
