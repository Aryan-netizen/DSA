class Solution {
    public int mostFrequentEven(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int max=-1;
        int ans=-1;
        for(int k:map.keySet()){
            int x=map.get(k);
            if(x>max || (x==max && k<ans)){
                max=x;
                ans=k;
            }
        }
        return ans;
    }
}