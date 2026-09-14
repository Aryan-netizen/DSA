class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums); 
        List<List<Integer>> ans = new ArrayList<>();
        for(int k=0;k<n-2;k++){
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }
            int target = -nums[k];
            int i=k+1,j=n-1;
            while(i<j){
                
                if(nums[i]+nums[j]==target){
                    ans.add(new ArrayList<>(List.of(nums[k],nums[i],nums[j])));
                    while (i < j && nums[i] == nums[i + 1]) i++;
                    while (i < j && nums[j] == nums[j - 1]) j--;
                    i++;
                    j--;
                }else if(nums[i]+nums[j]>target){
                    j--;
                }else{
                    i++;
                }
            }
        }
        return ans;
    }
}