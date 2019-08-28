import java.util.*;
 
class Comparisons
{    int c3=0,c2=0,c1=0;
     void BubbleSort(int a[])
    {
        int n = a.length;
        
        for (int i = 0; i < n-1; i++)
           { for (int j = 0; j < n-i-1; j++)
              {  if (a[j] > a[j+1])
                {   c1++;
                    int t1 = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t1;
                }
              }
           }
    }
    void SelectionSort(int b[])
    {
        int n = b.length;
        
        for (int i = 0; i < n-1; i++)
        {  
            int min = i;
            for (int j = i+1; j < n; j++)
               {  
                  if (b[j] < b[min])
                   { min = j;
                     c2++;
                     int t2 = b[min];
                     b[min] = b[i];
                     b[i] = t2;
                   }
               }
        }
    }
    void combine ( int[] arr, int low, int mid, int high )
   { 
     int i=low;
     int j=mid+1;
     int k=low;
     
     int [] c= new int [high+1];
     while ( i<=mid && j<=high )
     {  c3++;
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
    public static void main ( String args[] )
    {
      int a[] = {78,45,12,65,52,13,23}; 
      int n =a.length;
      Comparisons ob= new Comparisons();
      ob.BubbleSort (a);
      ob.SelectionSort(a);
      ob.split(a,0,n-1);
      System.out.println("The number of comparisons in MergeSort is: " + ob.c3 );
      System.out.println("The number of comparisons in SelectionSort is: " + ob.c2 );
      System.out.println("The number of comparisons in BubbleSort is: " + ob.c1 );
   }
}
