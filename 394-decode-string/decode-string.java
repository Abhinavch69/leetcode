import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                st.push(s.charAt(i) + "");
            } else {
                // Step 1: Build the string inside the brackets
                String inside = "";
                while (!st.peek().equals("[")) {
                    inside = st.pop() + inside;
                }
                st.pop(); // remove "["

                // Step 2: Build the number (could be multiple digits)
                String numStr = "";
                while (!st.isEmpty() && isNum(st.peek())) {
                    numStr = st.pop() + numStr;
                }
                int num = Integer.parseInt(numStr);

                // Step 3: Repeat the inside string
                String result = "";
                for (int j = 0; j < num; j++) {
                    result += inside;
                }

                // Step 4: Push back the result
                st.push(result);
            }
        }

        // Step 5: Build the final result
        String res = "";
        while (!st.isEmpty()) {
            res = st.pop() + res;
        }

        return res;
    }

    public boolean isNum(String str) {
        return Character.isDigit(str.charAt(0));
    }
}
