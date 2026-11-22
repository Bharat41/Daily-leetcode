class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if (ch != '#') {
                st.push(ch);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }
         for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
           if (ch != '#') {
                st2.push(ch);
            } else if (!st2.isEmpty()) {
                st2.pop();
            }
        }
       return st.equals(st2);
    }
}