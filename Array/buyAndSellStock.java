class Solution {
    public int maxProfit(int[] prices) {
        int k=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<k)
            {
                k=prices[i];
            }
            else
            {
                int c=prices[i]-k;
            if(c>p)
            {
                p=c;
            }
        }
        }
        return p;
    }
}