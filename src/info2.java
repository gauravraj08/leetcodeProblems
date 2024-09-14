import java.util.*;

public class info2 {

    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        // Example usage
        List<Integer> A = Arrays.asList(1, 0);
        int n = A.size();
        System.out.println(getans(n, A)); // Output: 4
    }

    public static int getans(int n, List<Integer> A) {
        int[] arr = A.stream().mapToInt(i -> i).toArray();

        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: one way to partition an empty array

        // Precompute MEX values for all subarrays
        int[][] mex = new int[n][n];
        for (int start = 0; start < n; start++) {
            Set<Integer> seen = new HashSet<>();
            for (int end = start; end < n; end++) {
                seen.add(arr[end]);
                int mexValue = 0;
                while (seen.contains(mexValue)) {
                    mexValue++;
                }
                mex[start][end] = mexValue;
            }
        }

        // Compute number of valid partitions
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (mex[j][i - 1] >= (j == 0 ? 0 : mex[0][j - 1])) {
                    dp[i] = (dp[i] + dp[j]) % MOD;
                }
            }
        }

        return dp[n];
    }
}
