class Median
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
  void merge(int a[], int b[], int n, int n1, int c[]) 
{ 
    int i = 0, j = 0, k = 0, count=0, flag = 0; 
    while (i<n && j <n1) 
    { 
       if (a[i] < b[j]) 
            { count++;
            c[k++] = a[i++]; 
            }
        else
            c[k++] = b[j++]; 
    } 
  
    while (i < n) 
        c[k++] = a[i++]; 
  
    while (j < n1) 
        c[k++] = b[j++]; 
    while ( count==n && flag==0)
    {
      float median= (c[n]+c[n-1])/2;
      System.out.println("Median is: "+ median); 
      flag=1;
    } 
} 

  public static void main(String args[]) 
    { 
        int arr[] = {1,12,15,26,38}; 
        int arr2[]= {2,13,17,30,45};
        int n = arr.length; 
        int n1 = arr2.length;
        int [] arr3= new int [n+n1];
        Median ob = new Median(); 
        ob.split(arr, 0, n-1); 
        ob.split(arr2, 0, n1-1);
        ob.merge(arr,arr2,n,n1,arr3);
  
    } 
}
