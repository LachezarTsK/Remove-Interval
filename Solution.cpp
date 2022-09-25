
#include <vector>
using namespace std;

class Solution {
    
public:
    vector<vector<int>> removeInterval(vector<vector<int>>& intervals, vector<int>& toBeRemoved) {
        vector<vector<int>> nonOverlappingIntervals;

        for (const auto& interval : intervals) {
            if (interval[0] >= toBeRemoved[1] || interval[1] <= toBeRemoved[0]) {
                nonOverlappingIntervals.push_back(interval);
                continue;
            }
            if (interval[0] < toBeRemoved[0]) {
                nonOverlappingIntervals.push_back({interval[0], toBeRemoved[0]});
            }
            if (interval[1] > toBeRemoved[1]) {
                nonOverlappingIntervals.push_back({toBeRemoved[1], interval[1]});
            }
        }

        return nonOverlappingIntervals;
    }
};
