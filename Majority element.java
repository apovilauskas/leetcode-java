class Solution {
    public int majorityElement(int[] nums) {
        int value=nums[0], count=0;
        for(int i: nums){
            if(i == value){
                count++;
            } else{
                count --;
                if(count == 0){
                    value = i;
                    count = 1;
                }
            }
        }
        return value;
    }
}
