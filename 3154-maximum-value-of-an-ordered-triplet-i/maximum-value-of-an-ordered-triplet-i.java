class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxValue = Long.MIN_VALUE; // Use Long.MIN_VALUE instead of Integer.MIN_VALUE
        
        for (int i = 0; i < nums.length - 2; i++) {  // Should go till length-2
            for (int j = i + 1; j < nums.length - 1; j++) {  // Should go till length-1
                for (int k = j + 1; k < nums.length; k++) {
                    long val = (long) (nums[i] - nums[j]) * nums[k]; // Explicit long casting to avoid overflow
                    maxValue = Math.max(maxValue, val);
                }
            }
        }
        
        return maxValue > 0 ? maxValue : 0; 
    }
}
