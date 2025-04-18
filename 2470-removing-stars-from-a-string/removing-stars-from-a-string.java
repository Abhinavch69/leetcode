class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack();

        int n = s.length();

        for (int i = 0; i < n; i ++){
            char currentChar = s.charAt(i);
            if (currentChar == '*'){
                stack.pop();
            }
            else{
                stack.push(currentChar);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}