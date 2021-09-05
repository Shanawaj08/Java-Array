/*Return the sum of the numbers in the array, returning 0 for an empty array. 
Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.*/

public int sum13(int[] a) {
  int sum=0;
  if (a.length==0) return 0;
  for (int i=0; i<a.length; i++) {
    if (a[i]!=13) sum+=a[i];
    else if(a[i]==13 && i<a.length-1) {
      a[i]=0;
      a[i+1]=0;
      
    }
  }
  return sum;
}
