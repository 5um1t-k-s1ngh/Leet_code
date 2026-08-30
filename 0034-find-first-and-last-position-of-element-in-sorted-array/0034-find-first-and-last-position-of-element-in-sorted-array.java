class Solution {
    public int[] searchRange(int[] nums, int target) {

     
        int f1=first(nums ,target);
        int f2=sec(nums ,target);

        return new int[]{f1,f2};
         }
        public int sec(int[]nums ,int target){
            int low=0;
            int high=nums.length-1;
            int ans=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if (target==nums[mid]){
                    ans=mid;
                    low=mid+1;

                }
                else if(target>nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return ans;
        }
            
        
        public int first(int[] nums,int target){

            int low=0;
            int high=nums.length-1;
            int ans=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if (target==nums[mid]){
                    ans=mid;
                    high=mid-1;

                }
                else if(target>nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            
        }
        
        return ans;
        }
}