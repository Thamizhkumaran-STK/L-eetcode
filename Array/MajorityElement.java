class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int ca=0;
        for(int a:nums)
        {
            if(c==0)
            {
                ca=a;
            }
            if(a==ca)
            {
                c++;
            }
            else c--;
        }
        return ca;
    }
}