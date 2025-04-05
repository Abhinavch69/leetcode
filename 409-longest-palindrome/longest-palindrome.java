class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> mapUpper=new HashMap<>();
        Map<Character,Integer> mapLower=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                mapLower.put(c,mapLower.getOrDefault(c,0)+1);
            }else{
                mapUpper.put(c,mapUpper.getOrDefault(c,0)+1);
            }
        }
        int count=0;
        for(var val:mapUpper.values()){
            if(count%2==0){
                count+=val;
            }
            else{
                if(val%2==0){
                    count+=val;
                }else{
                    count=count+val-1;
                }
            }
        }
        for(var val:mapLower.values()){
            if(count%2==0){
                count+=val;
            }
            else{
                if(val%2==0){
                    count+=val;
                }else{
                    count=count+val-1;
                }
            }
        }
        return count;
        
    }
}