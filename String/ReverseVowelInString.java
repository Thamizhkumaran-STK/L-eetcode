package String;
class Solution {
    public String reverseVowels(String st) {
        int i = 0;
        char s[] = st.toCharArray();
        int j = s.length - 1;

        while (i < j) {
            if ((s[i]=='a'||s[i]=='A'||s[i]=='E'||s[i]=='e'||s[i]=='i'||s[i]=='I'||s[i]=='O'||s[i]=='o'||s[i]=='U'||s[i]=='u')
                &&
                (s[j]=='a'||s[j]=='A'||s[j]=='E'||s[j]=='e'||s[j]=='i'||s[j]=='I'||s[j]=='O'||s[j]=='o'||s[j]=='U'||s[j]=='u'))
            {
                char ch = s[j];
                s[j] = s[i];
                s[i] = ch;
                i++;
                j--;  
            }
            else if (s[i]!='a'&&s[i]!='A'&&s[i]!='E'&&s[i]!='e'&&s[i]!='I'&&s[i]!='i'&&s[i]!='O'&&s[i]!='o'&&s[i]!='U'&&s[i]!='u')
            {
                i++;
            }
            else if (s[j]!='a'&&s[j]!='A'&&s[j]!='E'&&s[j]!='e'&&s[j]!='I'&&s[j]!='i'&&s[j]!='O'&&s[j]!='o'&&s[j]!='U'&&s[j]!='u')
            {
                j--;
            }
        }

        String str = new String(s);
        return str;
    }
}
