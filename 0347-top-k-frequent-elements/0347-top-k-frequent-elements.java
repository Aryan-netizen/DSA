class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->{
            int x=map.get(a);
            int y=map.get(b);
            return y-x;
        });
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}