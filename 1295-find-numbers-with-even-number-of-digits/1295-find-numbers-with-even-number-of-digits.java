class Solution {
    public int findNumbers(int[] nums) {
          int c=0;
        for(int i=0;i<nums.length;i++){
            int r=0;
            int n=nums[i];
            while(n>0){
              n=n/10;
              r++;
            }
        
        if(r%2==0){
            c++;
        }
    }
        return c;
    }
}