package Arrays;

/*Since the array is sorted, we do not need to maintain a hash set. All occurrences of an element would be consecutive. 
So we mainly need to check if the current element is same as the previous element or n 
#Start with idx = 1 (idx is going to hold the index of the next distinct item. Since there is nothing before the first item, we consider it as the first distinct item and begin idx with 1.
Loop through the array for i = 0 to n-1.
At each index i, if arr[i] is different from arr[i-1], assign arr[idx] = arr[i] and increment idx.
After the loop, arr[] contains the unique elements in the first idx positions.

O(n) Time and O(1) Space*/
public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[]arr){
        //first pointer to know the poistion of the previous unique element
        int i=0;
        //second pointer for the traversal of the array
        for (int j=1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                i++;// Move the pointer for unique element
                arr[i]=arr[j];//copy the new unique element to i pointer
            }
        }
        return i+1;
    }
     public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

