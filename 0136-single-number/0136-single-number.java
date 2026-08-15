class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;


        // int j=1;
        // if (n==0)
        // return 0;
        
            for (int i=0;i<n-1;i=i+2){
            if(nums[i]!=nums[i+1]){
            return nums[i];
            }
        }

    return nums[n-1];
}
}