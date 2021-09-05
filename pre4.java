/*Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. 
The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]*/

public int[] pre4(int[] nums) {
  int count=0;
  int[] b = {};
  if(nums[0]==4) return b;
  for (int i=0; i<nums.length; i++) {
    if(nums[i]==4) {
      count++;
      if(count>1) break;
      else {
      b = new int[i];
      int new1 = i;
      for (int j=0; j<i; j++) {
        b[j] = nums[j];
      }
    }
    }
  }
  return b;
}
