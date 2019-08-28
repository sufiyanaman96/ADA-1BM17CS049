
class QuickSort
{
  int partition ( int[] arr, int low, int high )
  {
        int pivot_pos = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] <= pivot_pos) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
    void quicksort(int arr[], int low, int high) 
    { 
        if (low < high) 
        {
            int pivot_pos = partition(arr, low, high); 
            quicksort(arr, low, pivot_pos-1); 
            quicksort(arr, pivot_pos+1, high); 
        } 
    } 
    
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.quicksort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
         
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
    } 
}
