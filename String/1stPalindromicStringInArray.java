package String;
class Solution {
    public String firstPalindrome(String[] words) {
            String s2="";
            int c=0;
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            s2="";
            for(int j=0;j<s.length();j++)
            {
                s2=s.charAt(j)+s2;
            }
            if(s.equals(s2))
            {
                c=1;
                break;
            }
        }
        if(c==1)
        {
          return s2;
        }
        else{
            return new String();
        }
    }
}
