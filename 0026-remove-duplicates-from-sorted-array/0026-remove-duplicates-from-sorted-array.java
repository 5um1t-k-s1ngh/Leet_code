class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        if (0>=nums.length) return 0;
        for (int j=1;j<nums.length;j++){
            if (nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }

        }
        return i+1;
        
    }
}