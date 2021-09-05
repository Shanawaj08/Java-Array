/*Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true */


public boolean modThree(int[] nums) {
  int count=0, count2=0;
  for(int i=0; i<nums.length-1; i++) {
    if (nums[i]%2==0 && nums[i+1]%2==0) count+=2;
    else if (nums[i]%2!=0 && nums[i+1]%2!=0) count2+=2;
  }
  if(count>=3 || count2>=3) return true;
  else
    return false;
}
