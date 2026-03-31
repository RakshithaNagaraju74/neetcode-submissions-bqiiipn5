class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int prod=1;
        int zeroCount =0;
        for(int m :nums){
            if(m!=0){
                prod*=m;
            }
            else{
                zeroCount++;
            }
        }
        if(zeroCount>1){
            return new int[nums.length];
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(zeroCount>0) {
                res[i]=(nums[i]==0)? prod:0;
            }
            else{
                res[i]=prod/nums[i];
            }
        }
        return res;
    
    }
}  
