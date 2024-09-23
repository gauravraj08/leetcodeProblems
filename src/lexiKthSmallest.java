public class lexiKthSmallest {
    public static int countNumbers(long curr, long next, int n) {
        int countNum = 0;

        while (curr <= n) {
            countNum += Math.min(next, (long) n + 1) - curr;
            curr *= 10;
            next *= 10;
        }

        return countNum;
    }

    public static int findKthNumber(int n, int k) {
        int curr = 1;
        k -= 1; // Since we start from the first number (1), we need k-1 more numbers

        while (k > 0) {
            int count = countNumbers(curr, curr + 1, n);
            if (count <= k) {
                curr++;
                k -= count; // Skipping the elements under the current prefix tree
            } else {
                curr *= 10;
                k -= 1;
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        System.out.println(findKthNumber(13,2));
    }
}
