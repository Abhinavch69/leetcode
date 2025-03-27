class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int x=0;
        int val=-1;
        for(var n:map.entrySet()){
            if(n.getValue()>x){
                x=n.getValue();
                val=n.getKey();
            }
        }
        int f1=0;
        int f2=x;
        int n=nums.size();
        for(int i=0;i<n-1;i++){
            if(nums.get(i)==val){
                f1++;
                f2--;
            }

            if(f1*2>i+1 && f2*2 > n-(i+1))
            return i;
        }
        return -1;

    }
}