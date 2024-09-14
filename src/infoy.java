import java.util.*;

public class infoy {

    public static void main(String[] args) {
        int n = 5;

        System.out.println(minMovesToReduceToOne(n));
    }

    public static int minMovesToReduceToOne(int N) {
        if (N == 1) {
            return 0;
        }

        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(new int[]{N, 0});
        visited.add(N);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int soldiers = current[0];
            int moves = current[1];

            // Possible next states
            int[] nextStates = new int[]{
                    soldiers - 1,
                    soldiers / 2,
                    soldiers - (2 * soldiers / 3)  // Correct transition for reducing by two-thirds
            };

            for (int nextState : nextStates) {
                if (nextState == 1) {
                    return moves + 2;
                }
                if (nextState > 0 && !visited.contains(nextState)) {
                    visited.add(nextState);
                    queue.add(new int[]{nextState, moves + 1});
                }
            }
        }
        return -1;  // This should never be reached given the constraints.
    }
}
