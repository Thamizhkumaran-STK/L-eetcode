package String;
class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0;
        int r=s.length()-1;
        char ch[]=s.toCharArray();
        while(l<r)
        {
            if(Character.isLetter(ch[l])&&Character.isLetter(ch[r]))
            {
                char cha=ch[r];
                ch[r]=ch[l];
                ch[l]=cha;
                l++;
                r--;
            }
            else if(!Character.isLetter(ch[l])) l++;
            else if(!Character.isLetter(ch[r])) r--;
        }
        return new String(ch);
    }
}