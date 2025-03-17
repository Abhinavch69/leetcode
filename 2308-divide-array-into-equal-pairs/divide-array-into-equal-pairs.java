class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        for(int freq:map.values()){
            if(freq%2!=0) return false;
        }
        return true;
    }
}