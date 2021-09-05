/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, 
ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.*/

public int centeredAverage(int[] a) {
  int max=0, min=a[0], sum=0, n=a.length-2;
        for(int i=0; i<a.length; i++) {
            sum+=a[i];
            if(a[i]>max) max=a[i];
            if(a[i]<min) min=a[i];
        
        }
        sum=sum-max-min;
        return sum/n;
  
}
