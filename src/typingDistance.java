import java.util.HashMap;

public class typingDistance {

    public static int typingDis(String word) {
        // Keyboard layout as a map of character to its (x, y) coordinates
        HashMap<Character, int[]> keyboard = new HashMap<>();

        // First row
        keyboard.put('Q', new int[]{0, 0});
        keyboard.put('W', new int[]{1, 0});
        keyboard.put('E', new int[]{2, 0});
        keyboard.put('R', new int[]{3, 0});
        keyboard.put('T', new int[]{4, 0});
        keyboard.put('Y', new int[]{5, 0});
        keyboard.put('U', new int[]{6, 0});
        keyboard.put('I', new int[]{7, 0});
        keyboard.put('O', new int[]{8, 0});
        keyboard.put('P', new int[]{9, 0});

        // Second row
        keyboard.put('A', new int[]{0, 1});
        keyboard.put('S', new int[]{1, 1});
        keyboard.put('D', new int[]{2, 1});
        keyboard.put('F', new int[]{3, 1});
        keyboard.put('G', new int[]{4, 1});
        keyboard.put('H', new int[]{5, 1});
        keyboard.put('J', new int[]{6, 1});
        keyboard.put('K', new int[]{7, 1});
        keyboard.put('L', new int[]{8, 1});

        // Third row
        keyboard.put('Z', new int[]{1, 2});
        keyboard.put('X', new int[]{2, 2});
        keyboard.put('C', new int[]{3, 2});
        keyboard.put('V', new int[]{4, 2});
        keyboard.put('B', new int[]{5, 2});
        keyboard.put('N', new int[]{6, 2});
        keyboard.put('M', new int[]{7, 2});

        // Initial position is at 'Q'
        int[] currentPosition = keyboard.get('Q');
        int totalDistance = 0;

        // Loop through the word and calculate the distance between consecutive characters
        for (char c : word.toCharArray()) {
            int[] nextPosition = keyboard.get(c);
            // Calculate Manhattan distance
            totalDistance += Math.abs(currentPosition[0] - nextPosition[0]) +
                    Math.abs(currentPosition[1] - nextPosition[1]);
            currentPosition = nextPosition; // Move to the next character
        }

        return totalDistance;
    }

    public static void main(String[] args) {
        // Test example
        String word = "HACKERRANK";
        int result = typingDis(word);
        System.out.println(result);  // Output: 1
    }
}
