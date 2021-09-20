/* K Rotate Array
A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. 
Given an integer, d , rotate the array that many steps left and return the result. */

class Result {

    public static int[] rotateArray(int[] arr) {
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return arr;
    }

}

public class Solution {
    public static void main(String[] args) {
        Result mn = new Result();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            int val = sc.nextInt();
            arr[i] = val;
        }
        for(int i=0;i<d;i++) {
            arr = mn.rotateArray(arr);
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
