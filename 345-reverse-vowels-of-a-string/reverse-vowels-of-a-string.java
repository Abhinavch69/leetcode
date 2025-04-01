class Solution {

    public boolean isVowel(char ch){
        return "aeiou".indexOf(ch)!=-1 || "AEIOU".indexOf(ch)!=-1;
    }
    public String reverseVowels(String s) {
       char ch[]=s.toCharArray();
       int start=0;
       int end=ch.length-1;
       while(start<=end){
        if(isVowel(ch[start]) && isVowel(ch[end])){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        else if(isVowel(ch[start]) && !isVowel(ch[end])){
            end--;
        }
        else if(!isVowel(ch[start]) && isVowel(ch[end])){
            start++;
        }
        else{
            start++;
            end--;
        }
       }
       String str="";
       for(char chr:ch){
        str+=chr;
       }
       return str;
    }
}