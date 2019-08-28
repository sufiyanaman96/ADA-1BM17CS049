class MergeSort 
{
  void combine ( int[] arr, int low, int mid, int high )
  { 
     int i=low;
     int j=mid+1;
     int k=low;
     int [] c= new int [high+1];
     while ( i<=mid && j<=high )
     {
       if (arr[i]<arr[j])
       {
         c[k]=arr[i];
         k++;
         i++;
       }
       else 
       {
         c[k]=arr[j];
         k++;
         j++;
       }
     }
     if (i>mid)
     {
       while ( j<=high)
       {
         c[k]=arr[j];
         k++;
         j++;
       }
     }
     if (j>high)
      {
       while ( i<=mid)
       {
         c[k]=arr[i];
         k++;
         i++;
       }
     }
     for ( i=low; i<=high; i++ )
     {
       arr[i]=c[i];
     }
 }
 void split ( int [] arr, int low, int high )
 {
   if ( low<high)
  {
     int mid=(low+high)/2;
     split(arr,low,mid);
     split(arr,mid+1,high);
     combine(arr,low,mid,high);
   }
 }
  public static void main(String args[]) 
    { 
        int arr[] = {15,9,2,21,11,0}; 
        int n = arr.length; 
  
        MergeSort ob = new MergeSort(); 
        ob.split(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
         
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
    } 
}
