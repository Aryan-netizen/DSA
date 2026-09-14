class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int close = nums[0] + nums[1] + nums[2];
        for(int k=0;k<n-2;k++){
            int i=k+1,j=n-1;
            while(i<j){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-close)>Math.abs(target-sum)){
                    close=sum;
                }
                if(sum>target){
                    j--;
                }else if(sum<target){
                    i++;
                }else{
                    return sum;
                }
            }
        } 
            return close;
    }
}