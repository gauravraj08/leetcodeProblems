public class MiniBoxes {

    public static int countMiniBoxes(int N, int X, int[] A) {
        int count = 0;

        for (int start = 0; start < N; start++) {
            int end = start;
            while (end < N && A[start] + A[end] <= X) {
                end++;
            }
            // The subarrays from start to end-1 are valid
            count += (end - start);
        }

        return count;
    }

    public static void main(String[] args) {
        int N = 3;
        int X = 6;
        int[] A = {3, 4, 16};

        int result = countMiniBoxes(N, X, A);
        System.out.println(result);  // Output: 1
    }
}
