
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {

        List<List<Integer>> nonOverlappingIntervals = new ArrayList<>();

        for (int[] interval : intervals) {
            if (interval[0] >= toBeRemoved[1] || interval[1] <= toBeRemoved[0]) {
                nonOverlappingIntervals.add(List.of(interval[0], interval[1]));
                continue;
            }
            if (interval[0] < toBeRemoved[0]) {
                nonOverlappingIntervals.add(List.of(interval[0], toBeRemoved[0]));
            }
            if (interval[1] > toBeRemoved[1]) {
                nonOverlappingIntervals.add(List.of(toBeRemoved[1], interval[1]));
            }
        }

        return nonOverlappingIntervals;
    }
}
