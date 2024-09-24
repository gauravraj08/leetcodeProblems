import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class extraCharInString {
    public static int minExtraChar(String s, List<String> dictionary) {
        int n = s.length();
        Set<String> dictSet = new HashSet<>(dictionary);
        int[] dp = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1] + 1; // Worst case: add one character
            for (int j = i; j < n; j++) {
                String substring = s.substring(i, j + 1);
                if (dictSet.contains(substring)) {
                    dp[i] = Math.min(dp[i], dp[j + 1]);
                }
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("leetcode");
        ls.add("leet");
        ls.add("code");
        System.out.println(minExtraChar("leetscode",ls));
    }
}
