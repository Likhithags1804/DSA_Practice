/*nput: arr[] = [1, 2, 3, 4], x = 3
Output: 2
Explanation: There is one test case with array as [1, 2, 3 4] and element to be searched as 3. Since 3 is present at index 2, the output is 2.

Input: arr[] = [10, 8, 30, 4, 5], x = 5
Output: 4
Explanation: For array [10, 8, 30, 4, 5], the element to be searched is 5 and it is at index 4. So, the output is 4.

Input: arr[] = [10, 8, 30], x = 6
Output: -1
Explanation: The element to be searched is 6 and its not present, so we return -1.
*/public class LinearSearch {
    public static int linearsearch(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x)
                return i;
            
            
        }
        return -1;
    }
    public static void main (String[] args){
        int[] array={1,5,964,34663,2543};
        int n=array.length;
        int x=1;
        int result=linearsearch(array, n, x);
        if(result==-1){
            System.out.println("element is not found in an array");
        }
        else{
            System.out.println("element"+ x +" is found at the index"+" "+ result);
        }

    }
}

