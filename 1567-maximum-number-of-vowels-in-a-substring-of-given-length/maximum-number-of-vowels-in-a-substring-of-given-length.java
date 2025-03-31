class Solution {

    boolean isVowel(char c){
        return "aeiou".indexOf(c)!=-1;
    }
    public int maxVowels(String s, int k) {
        int curr=0;
        int maxCount=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) curr++;
        }
        maxCount=curr;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))) curr++; //incoming vowel
            if(isVowel(s.charAt(i-k))) curr--; //outgoing vowel

            maxCount=Math.max(maxCount,curr);
        }
        return maxCount;
    }
}