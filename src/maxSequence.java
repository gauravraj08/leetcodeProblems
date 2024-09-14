import java.util.ArrayList;
import java.util.List;

public class maxSequence {
    private static int computeOR(List<Integer> list) {
        int orResult = 0;
        for (int num : list) {
            orResult |= num;
        }
        return orResult;
    }

    // Function to find the maximum value of the subsequence as defined
    public static int maxSubsequenceValue(int[] nums, int k) {
        int n = nums.length;
        int maxResult = Integer.MIN_VALUE;

        // Generate all subsequences of size 2 * k
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subsequence = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subsequence.add(nums[j]);
                }
            }

            // Only consider subsequences of size 2 * k
            if (subsequence.size() == 2 * k) {
                // Split into two parts and compute OR
                List<Integer> firstHalf = subsequence.subList(0, k);
                List<Integer> secondHalf = subsequence.subList(k, 2 * k);

                int firstOr = computeOR(firstHalf);
                int secondOr = computeOR(secondHalf);

                // XOR the two OR results
                int result = firstOr ^ secondOr;
                maxResult = Math.max(maxResult, result);
            }
        }

        return maxResult;
    }
    public static void main(String[] args) {
        int[] nums = {4,2,5,6,7};
        int k = 2;
        System.out.println("Maximum value: " + maxSubsequenceValue(nums, k));
    }
}
