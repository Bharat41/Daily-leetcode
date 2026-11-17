class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > 1) {
                ans.add(nums[i]);
                map.put(nums[i], 0); 
            }
        }
        return ans;
    }
}
