public class MaxSubarray {

    public static int maxSubarray(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {2,-3,5,12,-15,5,2,-12,2,-1};
        System.out.println("Maximum sum: " + maxSubarray(arr));  // Output: 86
    }
}
