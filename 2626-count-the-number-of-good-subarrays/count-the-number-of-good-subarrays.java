class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        long count=0,pair=0;
        int left=0;

        for(int right=0;right<nums.length;right++){
            int val=nums[right];
            pair+=map.getOrDefault(val,0);
            map.put(val,map.getOrDefault(val,0)+1);

            while(pair>=k){
                count+=nums.length-right;

                int out=nums[left++];
                map.put(out,map.get(out)-1);
                pair-=map.get(out);
            }
        }
        return count;
    }
}