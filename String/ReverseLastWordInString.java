package String;
class Solution {
    public String reverseWords(String s) {
        String[] st = s.trim().split("\\s+");
        String s1 = "";

        for (int i = st.length - 1; i >= 0; i--) {
            s1 += st[i];

            if (i != 0)
                s1 += " ";
        }

        return s1;
    }
}
