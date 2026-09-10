class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer , Integer> map=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            int req=target-nums[i];
            if(map.containsKey(req)){
                ans[0]=i;
                ans[1]=map.get(req);
                return ans;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}