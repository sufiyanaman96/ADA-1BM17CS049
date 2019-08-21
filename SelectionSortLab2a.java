import java.util.*;
class SelectionSortLab2a 
{
  public static void  findsmall(int[] a,int n)
  {
    Scanner in = new Scanner ( System.in);
    System.out.println("Enter the value (k)");
    int k=in.nextInt();
    for (int i=0;i<k;i++)
    {

       int min=i;

        for (int j=i+1;j<n;j++)
        {

            if(a[min]>a[j])
            {
               int t=a[min];
                a[min]=a[j];
                a[j]=t;

            }
        }
    }
      System.out.println("The kth smallest element is "+ a[k-1]);
  }

  public static void main(String args[])
  {   
     Scanner in = new Scanner ( System.in);
     System.out.println("Enter size of array" );
     int n = in.nextInt();
     int a[]=new int[n];
     for ( int i=0; i < n; i++)
        {   System.out.println("Enter element" + i);
            a[i]=in.nextInt(); 
        }
      findsmall(a,n);
     
  }
}
