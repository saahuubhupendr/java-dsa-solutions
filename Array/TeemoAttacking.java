package Array;

// Teemo Attacking - LeetCode 495
public class TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0 || duration <= 0) return 0;

        int total = duration; // account for first attack
        int prevEnd = timeSeries[0] + duration; // end time (exclusive) of current poison interval

        for (int i = 1; i < timeSeries.length; i++) {
            int attackTime = timeSeries[i];
            int newEnd = attackTime + duration;

            if (attackTime >= prevEnd) {
                // no overlap with previous poison interval
                total += duration;
            } else {
                // overlap: only add the extra time beyond prevEnd
                total += newEnd - prevEnd;
            }

            prevEnd = newEnd;
        }

        return total;
    }

    // Simple test
    public static void main(String[] args) {
        TeemoAttacking solver = new TeemoAttacking();

        int[] attacks1 = {1, 4};
        System.out.println(solver.findPoisonedDuration(attacks1, 2)); // expected 4

        int[] attacks2 = {1, 2};
        System.out.println(solver.findPoisonedDuration(attacks2, 2)); // expected 3

        int[] attacks3 = {1, 3, 5, 7};
        System.out.println(solver.findPoisonedDuration(attacks3, 3)); // expected 12
    }
}
