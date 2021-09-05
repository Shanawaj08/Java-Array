/*Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. 
The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]*/

public int[] post4(int[] nums) {
   int count=0;
   int[] b = {};
   if(nums[nums.length-1]==4) return b;
   if(nums[nums.length-2]==4) return b=new int[] {nums[nums.length-1]};
   for (int i=nums.length-1; i>0; i--) {
     if(nums[i] == 4) {
       count ++;
       b=new int[nums.length-1-i];
       if (count>1) break;
       else {
         for (int j=nums.length-1; j>i; j--) {
           b[j-i-1] = nums[j];
         }
       }
     }
   }
   return b;
}
