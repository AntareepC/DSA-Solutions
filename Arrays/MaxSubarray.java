class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum=0,sum1=nums[0];
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            if(sum<nums[i]) {
                sum=nums[i];
            } if(sum1<sum) {
                sum1=sum;
            }
        } return sum1;
    }
}