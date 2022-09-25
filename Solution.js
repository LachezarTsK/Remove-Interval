
/**
 * @param {number[][]} intervals
 * @param {number[]} toBeRemoved
 * @return {number[][]}
 */
var removeInterval = function (intervals, toBeRemoved) {

    const nonOverlappingIntervals = [];
    for (let interval of intervals) {
        if (interval[0] >= toBeRemoved[1] || interval[1] <= toBeRemoved[0]) {
            nonOverlappingIntervals.push(interval);
            continue;
        }
        if (interval[0] < toBeRemoved[0]) {
            nonOverlappingIntervals.push([interval[0], toBeRemoved[0]]);
        }
        if (interval[1] > toBeRemoved[1]) {
            nonOverlappingIntervals.push([toBeRemoved[1], interval[1]]);
        }
    }

    return nonOverlappingIntervals;
};
