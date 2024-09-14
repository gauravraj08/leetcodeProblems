import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {
    public static int[] rearrange(int[] arr) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        // Separate the positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        int[] result = new int[arr.length];
        int posIndex = 0, negIndex = 0, index = 0;

        // Alternate positives and negatives
        while (posIndex < positives.size() && negIndex < negatives.size()) {
            result[index++] = positives.get(posIndex++);
            result[index++] = negatives.get(negIndex++);
        }

        // If there are remaining positives
        while (posIndex < positives.size()) {
            result[index++] = positives.get(posIndex++);
        }

        // If there are remaining negatives
        while (negIndex < negatives.size()) {
            result[index++] = negatives.get(negIndex++);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2,9,24,27,-9,23,12,90,100,-345};
        int[] result = rearrange(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 1 -1 2 -8 12
    }
}
