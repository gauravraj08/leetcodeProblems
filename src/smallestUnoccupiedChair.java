import java.util.*;

public class smallestUnoccupiedChair {
    public static int smallestChair(int[][] times, int targetFriend) {
        Map<Integer, Integer> arrivalMap = new HashMap<>();
        Map<Integer, List<Integer>> leavingMap = new HashMap<>();
        Map<Integer, Integer> friendToChair = new HashMap<>();
        int[] chairs = new int[times.length];
        Arrays.fill(chairs, -1);
        int pointer = 0;
        int endTime = 0;

        for (int i = 0; i < times.length; i++) {
            arrivalMap.put(times[i][0], i);
            leavingMap.computeIfAbsent(times[i][1], k -> new ArrayList<>()).add(i);
            endTime = Math.max(endTime, times[i][1]);
        }

        for (int i = 0; i <= endTime; i++) {
            if (leavingMap.containsKey(i)) {
                for (int friend : leavingMap.get(i)) {
                    int chair = friendToChair.get(friend);
                    pointer = Math.min(pointer, chair);
                    chairs[chair] = -1;
                }
            }

            if (arrivalMap.containsKey(i)) {
                int friend = arrivalMap.get(i);
                if (friend == targetFriend) return pointer;
                chairs[pointer] = friend;
                friendToChair.put(friend, pointer);
                while (chairs[pointer] != -1) pointer++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] arr={
                {1,4},{2,3},{4,6}
        };
        System.out.println(smallestChair(arr,1));
    }
}
