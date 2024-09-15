import java.util.Arrays;

public class StringsValid {
    private static int helper(String[] words, String target, int start) {
        if (start == target.length()) {
            return 0; // Base case: if we reached the end of the target
        }

        int minCount = Integer.MAX_VALUE;

        // Try every word in the words array
        for (String word : words) {
            int len = word.length();

            // Check if the word can be a valid prefix starting at position 'start'
            if (start + len <= target.length() && target.substring(start, start + len).equals(word)) {
                // Recur for the remaining part of the target
                int result = helper(words, target, start + len);

                // If it's possible to form the rest of the target, update the minimum count
                if (result != -1) {
                    minCount = Math.min(minCount, 1 + result);
                }
            }
        }

        // If minCount is still Integer.MAX_VALUE, it means we couldn't form the target from this point
        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }

    // Main function
    public static int minConcatenations(String[] words, String target) {
        return helper(words, target, 0);
    }

    public static void main(String[] args) {
        String[] words={"abc","aaaaa","bcdef"};
        String word="aabcdabc";
        int ans=minConcatenations(words,word);
        System.out.println(ans);
    }
}
