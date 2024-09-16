import java.util.*;

public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        // Step 1: Convert each time to minutes from midnight
        List<Integer> minutesList = new ArrayList<>();

        for (String time : timePoints) {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int totalMinutes = hours * 60 + minutes;
            minutesList.add(totalMinutes);
        }

        // Step 2: Sort the times in ascending order
        Collections.sort(minutesList);

        // Step 3: Compute the minimum difference between consecutive time points
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < minutesList.size(); i++) {
            int diff = minutesList.get(i) - minutesList.get(i - 1);
            minDiff = Math.min(minDiff, diff);
        }

        // Step 4: Handle wrap-around difference (from last to first time)
        int wrapAroundDiff = (1440 - minutesList.get(minutesList.size() - 1)) + minutesList.get(0);
        minDiff = Math.min(minDiff, wrapAroundDiff);

        return minDiff;
    }

    public static void main(String[] args) {
        MinimumTimeDifference solution = new MinimumTimeDifference();

        List<String> timePoints1 = Arrays.asList("23:59", "00:00");
        System.out.println(solution.findMinDifference(timePoints1));  // Output: 1

        List<String> timePoints2 = Arrays.asList("00:00", "23:59", "00:00");
        System.out.println(solution.findMinDifference(timePoints2));  // Output: 0
    }
}
