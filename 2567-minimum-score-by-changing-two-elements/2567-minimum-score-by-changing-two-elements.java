class Solution {
    public int minimizeSum(int[] nums) {
        
        //because you can make any two elements equal to the third element and hence the array will have all elements equal and so the diffrence will be 0 for all pairs
        
        if(nums.length==3){
            return 0;
        }
        
        Arrays.sort(nums);
        
        //remove first two i.e replacing first two elements with any element in between the array
        int a=nums[nums.length-1]-nums[2];
        
        //remove last two i.e replacing last two elements with any element in between the array
        int b=nums[nums.length-3]-nums[0];
        
        //remove last and first i.e replacing first and last elements with any element in between the array
        int c=nums[nums.length-2]-nums[1];
        
        return Math.min(a,Math.min(b,c));
        
        
    }
}