//Given an array of ints, return true if every element is a 1 or a 4.

public boolean only14(int[] a) {
  for (int i=0; i<a.length; i++) {
    if(a[i]!=1 && a[i]!=4) return false;
  }
  return true;
}
