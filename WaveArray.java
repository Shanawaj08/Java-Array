/*Wave Array
Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it
In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....*/

public static void convertToWave(int arr[], int n){
        for(int i=0; i<arr.length; i=i+2) {
            if(i+1<arr.length && arr[i+1]>arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            else continue;
        }  
    }
