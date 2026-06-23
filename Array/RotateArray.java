class Solution {
    public void swap(int[] nums,int l,int r)
    {
        while(l<r)
        {
            int t=nums[r];
            nums[r]=nums[l];
            nums[l]=t;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
    int n=nums.length;
    k=k%n;
         swap(nums,0,n-1);
         swap(nums,0,k-1);
         swap(nums,k,n-1);
         
    }
}