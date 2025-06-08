package Arrays;

/*nput: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
WITH SORTING :(The idea is to sort the array in non-decreasing order.
 Now, we know that the largest element will be at index n - 1. So, starting from index (n - 2), traverse the remaining array in reverse order. As soon as we encounter an element which is not equal to the largest element, 
return it as the second largest element in the array. ) 
ISSUE IS:Time Complexity: O(n*log(n)), as sorting the array takes O(n*log(n)) time and traversing the array can take O(n) time in the worst case, so total time complexity = (n*log(n) + n) = O(n*log(n)).
Auxiliary space: O(1), as no extra space is required.*/
// One Pass Search:
/*The idea is to keep track of the largest and second largest element while traversing the array. Initialize largest and secondLargest with -1. Now, for any index i,

If arr[i] > largest, update secondLargest with largest and largest with arr[i].
Else If arr[i] < largest and arr[i] > secondLargest, update secondLargest with arr[i].  */

public class SecondLargestusingonePass {
    public static int secondLargest(int[] arr){
        int max=-1;
        int secondmax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>secondmax){
                secondmax=arr[i];
            }
}
return secondmax;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 324, 45, 90, 9808 };
        System.out.println(secondLargest(arr));
}}
/*Time Complexity: O(n), as we are traversing the array only once.
Auxiliary space: O(1) */
