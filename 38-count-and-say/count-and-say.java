class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String str="1";
        for(int i=1;i<n;i++){
            String ans=RLE(str);
            str=ans;
        }
        return str;
    }

    public String RLE (String input){
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)){
                count++;
            }else{
                sb.append(count).append(input.charAt(i-1));
                count=1;
            }
        }
        sb.append(count).append(input.charAt(input.length()-1));
        return sb.toString();
    }
}