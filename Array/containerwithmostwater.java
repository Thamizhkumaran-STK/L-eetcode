class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int m=0;
        int v=0;
        int j=height.length-1;
        while(i<j)
        {
            if(height[i]>height[j])
            {
                v=height[j]*(j-i);
                if(m<v)
                {
                    m=v;
                }
                j--;
            }
            else if(height[i]<height[j])
            {
                v=height[i]*(j-i);
                if(m<v)
                {
                    m=v;
                }
                i++;
            }
            else if(height[i]==height[j])
            {
                v=height[i]*(j-i);
                if(m<v)
                {
                    m=v;
                }
                i++;
                j--;
            }
        }
        return m;
    }
}