class Solution {
    public int missingNumber(int[] nums) {
        int actualsum=0;
        int n= nums.length;
        int expectedsum =n * (n + 1) / 2;
        for(int i=0;i<nums.length;i++){
             actualsum+=nums[i];
        }
        return expectedsum-actualsum;
    }
}