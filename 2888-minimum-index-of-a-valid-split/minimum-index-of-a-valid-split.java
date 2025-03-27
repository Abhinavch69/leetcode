import java.util.*;

class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int maxFreq = 0, val = -1;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);

            if (freq > maxFreq) {
                maxFreq = freq;
                val = num;
            }
        }

        int f1 = 0, f2 = maxFreq;
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == val) {
                f1++;
                f2--;
            }

            int leftSize = i + 1;
            int rightSize = n - leftSize;
            if (f1 * 2 > leftSize && f2 * 2 > rightSize) {
                return i;
            }
        }

        return -1;
    }
}
