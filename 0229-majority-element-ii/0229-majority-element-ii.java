class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> a = new ArrayList<>();
        int n = nums.length/3;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>n)
            a.add(key);
        }
        return a;
    }
}