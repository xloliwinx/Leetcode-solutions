class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] squared = new int[n];
        for (int j =0; j<nums.length; j++){
            squared[j]= nums[j] * nums[j];
        } 
        for (int i =0; i <nums.length; i++ ){

              for (int j =i+1; j<nums.length; j++){
            if(squared[j]<squared[i]){
                int temp = squared[i];
              squared[i] = squared[j];
              squared[j] = temp;
            }
          

        }
            }
      
        return squared;
    }
}