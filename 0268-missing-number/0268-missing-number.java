// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         int j=1;
//         for (int i=0;i<n;i++){
//             if (nums[i]!=nums[j]-1){
//                 return nums[j]-1;
//                 j++;
//                 // continue;
//             }
//         }
//         return n;
        
//     }
// }
import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            // If the element doesn't match its index, i is missing!
            if (nums[i] != i) {
                return i;
            }
        }
        
        // If 0 through n-1 are present, the missing number must be n
        return nums.length;
    }
}