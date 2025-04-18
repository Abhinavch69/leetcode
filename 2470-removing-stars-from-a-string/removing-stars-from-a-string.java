class Solution {
    public String removeStars(String s) {
        if(s.length()==0) return "";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        if(stack.isEmpty()) return "";
        String res="";
        while(!stack.isEmpty()){
            res=stack.pop()+res;
        }
        return res;
    }
}