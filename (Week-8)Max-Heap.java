import java.util.*;

class Heap
{
  public static boolean check(int arr[], int n)
  { 
    for( int i=0; i< (n/2)-1; i++)
    {
      if( arr[i]<arr[2*i+1] )
      {
        return false;
      }
      else if (arr[i]<arr[(2*i)+2]) 
      {
        return false;
      }
    }return true;
  }
  public static void main (String [] args)
  {
    Scanner in = new Scanner (System.in);
    int arr[]=new int []{90,15,10,7,12,2};
    int n = arr.length ;
    System.out.println(check(arr,n));
  }
}
