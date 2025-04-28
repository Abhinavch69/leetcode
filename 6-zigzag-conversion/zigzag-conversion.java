class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        if(n==1 || numRows==1) return s;
        StringBuilder sb=new StringBuilder();
        int step = numRows*2-2;
        for(int i=0;i<numRows;i++){
            for(int j=i;j<n;j+=step){
                sb.append(s.charAt(j));
                if(i!=0 && i!=numRows-1 && (j+(numRows-i-1)*2)<n){
                    sb.append(s.charAt(j+(numRows-i-1)*2));
                }
            }
        }
        return sb.toString();
    }
}