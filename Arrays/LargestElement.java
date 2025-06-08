package Arrays;

/*Input: arr[] = [10, 20, 4]
Output: 20
Explanation: Among 10, 20 and 4, 20 is the largest. 

Input: arr[] = [20, 10, 20, 4, 100]
Output: 100 
The approach to solve this problem is to traverse the whole array and find the maximum among them.*/

public class LargestElement {
   static int largest(int[] arr) {
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 324, 45, 90, 9808 };
        System.out.println(largest(arr));
    }
}
