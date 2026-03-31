public class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;
       Set<Integer> seen= new HashSet<>();
       for(int n:nums){
        seen.add(n);
       }

        for(int i:nums){
            int streak=0,cur=i;
            while(seen.contains(i)){
                i++;
                streak++;
            }
            res=Math.max(res,streak);
        }
        return res;

    }
}