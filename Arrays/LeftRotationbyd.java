package Arrays;
/*this is also called counterclockwise rotation
input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
Output: {3, 4, 5, 6, 1, 2}
Explanation: After first left rotation, arr[] becomes {2, 3, 4, 5, 6, 1} and after the second rotation, arr[] becomes {3, 4, 5, 6, 1, 2}

Input: arr[] = {1, 2, 3}, d = 4
Output: {2, 3, 1}
Using Reversal Algorithm - O(n) Time and O(1) Space
The idea is based on the observation that if we left rotate the array by d positions, the last (n - d) elements will be at the front and the first d elements will be at the end. 

Reverse the subarray containing the first d elements of the array.
Reverse the subarray containing the last (n - d) elements of the array.
Finally, reverse all the elements of the array. */
public class LeftRotationbyd {
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;

        // Handle the case where d > size of array
        d %= n;

        // Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining n-d elements
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }
    public static void reverse(int[] arr,int left,int right){
        
      while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
      }  
    }
public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 3;
        rotateArr(arr, d);
    //print array after rotation
     for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}

