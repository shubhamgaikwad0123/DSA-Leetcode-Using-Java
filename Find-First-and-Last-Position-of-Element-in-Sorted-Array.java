class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] result=new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);

        return result;
    
    }

    int findFirst(int[] nums, int target){
        int low=0;
        int high = nums.length - 1;
        int result = -1;

        while(low <= high)
        {
            int midIndex=low + (high - low)/2;

            if(nums[midIndex]==target){
                result = midIndex;
                high = midIndex - 1; //move left 
            }else if(nums[midIndex] < target){
                low = midIndex + 1;
            }else{
                high = midIndex - 1;
            }
        }
        return result;
    }

     int findLast(int[] nums, int target){
        int low=0;
        int high = nums.length - 1;
        int result = -1;

        while(low <= high)
        {
            int midIndex=low + (high - low)/2;

            if(nums[midIndex]==target){
                result = midIndex;
                low = midIndex + 1; //move right 
            }else if(nums[midIndex] < target){
                low = midIndex + 1;
            }else{
                high = midIndex - 1;
            }
        }
        return result;
    }
}