class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int num:nums) max=Math.max(max,num);
        int left=0;
        int occur=0;
        long res=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==max) occur++;
            while(occur>=k){
                if(nums[left]==max) occur--;
                left++;
            }
            res+=left;
        }
        return res;
    }
}