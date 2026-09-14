class Solution {
    public int[] left(int[] arr,int n){
        int[] l=new int[n];
        int max=arr[0];
        l[0]=max;
        for(int i=1;i<n;i++){
            max=Math.max(arr[i],max);
            l[i]=max;
        }
        return l;
    }
    public int[] right(int[] arr,int n){
        int[] r=new int[n];
        int max=arr[n-1];
        r[n-1]=max;
        for(int i=n-1;i>=0;i--){
            max=Math.max(arr[i],max);
            r[i]=max;
        }
        return r;
    }
    public int trap(int[] arr) {
        int n=arr.length;
        int[] leftmax = left(arr,n);
        int[] rightmax = right(arr,n);
        int area=0;
        for(int i=1;i<n-1;i++){
            int ans=Math.min(leftmax[i],rightmax[i])-arr[i];
            area+=ans;
        }
        return area;
    }
}