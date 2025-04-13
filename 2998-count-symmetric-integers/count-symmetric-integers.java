class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            if(isSymmetric(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isSymmetric(int num){
        String str=num+"";
        if(str.length()%2!=0) return false;

        String sub1=str.substring(0,str.length()/2);
        String sub2=str.substring(str.length()/2);
        int sum1=0,sum2=0;
        for(int i=0;i<sub1.length();i++){
            sum1+=Character.getNumericValue(sub1.charAt(i));
             sum2+=Character.getNumericValue(sub2.charAt(i));
        }
        if(sum1==sum2) return true;
        return false;
    }
}