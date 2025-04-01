class Solution {
    public boolean isVowel(char ch)
    {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public String reverseVowels(String s) {
        StringBuilder ans= new StringBuilder();
        List<Character> characterList= new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(isVowel(s.charAt(i))) characterList.add(s.charAt(i));
        }
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                ans.append(characterList.get(c));
                c++;
            }
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}