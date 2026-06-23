class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int arr[]=new int[nums2.length];
        int l=-1;
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    k=0;
                    for(int h=0;h<=l;h++)
                    {
                        if(arr[h]==nums2[j])
                        {
                            k=1;
                            break;
                        }
                    }
                    if(k==0)
                    {
                        l++;
                        arr[l]=nums2[j];
                    }
                    break;
                }
            }
        }
        int res[] = new int[l + 1];

for(int i = 0; i <= l; i++) {
    res[i] = arr[i];
}

return res;
    }
}