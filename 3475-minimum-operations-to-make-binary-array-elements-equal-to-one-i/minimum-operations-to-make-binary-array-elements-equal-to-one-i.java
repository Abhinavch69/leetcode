class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int start=0;
        int n=nums.length;
        while(start<=nums.length-3){
            if(nums[start]==0){
                nums[start]^=1;
                nums[start+1]^=1;
                nums[start+2]^=1;
                count++;
            }
            start++;
        }
        if(nums[n-1]==0 || nums[n-2]==0) return -1;
        return count;
    }
}