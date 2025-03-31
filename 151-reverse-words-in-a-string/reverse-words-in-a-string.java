class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] str=s.split(" ");
        int start=0;
        int end=str.length-1;
        while(start<=end){
            String temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
        String res="";
        for(int i=0;i<str.length-1;i++){
            if(!str[i].isEmpty()){
                res=res+str[i].trim()+" ";
            }
        }
        res+=str[str.length-1];
        return res;
    }
}