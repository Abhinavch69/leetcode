class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int start=-1,min=-1,max=-1;
        long count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                start=-1;
                min=-1;
                max=-1;
                continue;
            }
            if(start==-1){
                start=i;
            }
            if(nums[i]==minK) min=i;
            if(nums[i]==maxK) max=i;
            if(min!=-1 && max!=-1){
                count+=Math.max(0,Math.min(min,max)-start+1);
            }
        }
        return count;
    }
}