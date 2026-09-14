class Solution {
    
    public int trap(int[] arr) {
        int lMax =0;
        int rMax =0;
        int i=0,j=arr.length-1;
        int area=0;
        while(i<=j){
            if(arr[i]<=arr[j]){
                if(arr[i]<lMax){
                    area+=lMax-arr[i];
                }else{
                    lMax=arr[i];
                }
                i++;
            }else{
                if(arr[j]<rMax){
                    area+=rMax-arr[j];
                }else{
                    rMax=arr[j];
                }
                j--;
            }
        }
        return area;
    }
}