public class Main
{
    public static int binarySearch(int arr[], int l, int r, int x)
    {
        int k=0;
        if (r >= l) {
            int mid = l + (r - l) / 2;
            k=mid;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return arr[mid-1];
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        if(arr[k]<x){
            return arr[r];
        }
            return arr[l];
        
      
    }
    
    
    public static void main(String[] args) {
        int arr[]={12, 17, 21, 29, 38};
        System.out.print(binarySearch(arr,0,arr.length-1,15));
    }
}
