class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int r=numbers.length-1;
        int l=0;
        int i=0;
        int j=0;
        while(l<r)
        {
            int t=numbers[l]+numbers[r];
            if(t==target)
            {
                i=l;
                j=r;
                break;
            }
            else if(t>target)
            {
                r--;
            }
            else if(t<target)
            {
                l++;
            }
        }
        return new int[]{i+1,j+1};
    }
}