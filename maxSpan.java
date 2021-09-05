/*Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive.
A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6*/

public int maxSpan(int[] nums) {
int count = 0;
if(nums.length == 0) {
return 0;
}
if(nums[0] != nums[nums.length - 1]) {
for(int i = 1; i < nums.length; i++) {
count++;
}
}
if(nums[0] == nums[nums.length - 1]) {
for(int i = 0; i < nums.length; i++) {
count++;
}
}
return count;
}
