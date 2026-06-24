package String;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] a=s.split(" ");
        String k=a[a.length-1];
        int c=0;
        char ar[]=k.toCharArray();
        for(int x:ar)
        {
            c++;
        }
        return c;
    }
}
