package Arrays;

public class check_isArraysorted {
    public static boolean arraySortedOrNot(int[] arr) {
        // code here
        if(arr.length==0||arr.length==1){
            return true;
        }
        else{
            for(int i=1;i<arr.length;i++){
                if(arr[i-1]>arr[i]){
                    return false;
                }
            }
        }
    return true;
    }
    public static void main (String[] args){
        int arr[] = { 10, 324, 45, 90, 9808 };
        System.out.println(arraySortedOrNot(arr));
    }
    
}
