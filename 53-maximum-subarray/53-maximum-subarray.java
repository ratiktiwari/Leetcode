class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxTillHere = 0;
        int maxTotal = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){

            maxTillHere+=nums[i];
            if(maxTotal<maxTillHere){
                maxTotal = maxTillHere;
            }
            if(maxTillHere<0){
                maxTillHere=0;
            }

        }
        
        return maxTotal;
        
    }
}