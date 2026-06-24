class Solution {
    public int[] shortestToChar(String s, char c) {
        int arr[]=new int[s.length()];
        int arr1[]=new int[s.length()];
        int k=s.length();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                k=0;
            }
            else
            {
                k++;
            }
            arr[i]=k;
        }
        k=s.length();
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                k=0;
            }
            else
            {
                k++;
            }
            arr1[i]=k;
        }
        for(int i=0;i<s.length();i++)
        {
            arr[i]=Math.min(arr[i],arr1[i]);
        }
        return arr;
    }
}