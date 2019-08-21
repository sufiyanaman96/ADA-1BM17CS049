import java.util.*;
class BubbleSortLab2b 
{  
  public static void  findlarge(int []a ,int n)
  {
    Scanner in= new Scanner ( System.in );   
    System.out.println("Enter the value (k)");
    int k=in.nextInt();
    for (int i=0;i<k;i++)
    {

        for (int j=0;j<n-1-i;j++)
        {

            if(a[j+1]<a[j])
            {
               int t=a[j+1];
                a[j+1]=a[j];
                a[j]=t;

            }
        }
    }
    for(int j=n-1;j>=(n-k);j--)
    {
        System.out.println("The larger number is " + a[j]);
    }
  }

  public static void main(String args[]) 
  {
     Scanner in = new Scanner ( System.in);
     System.out.println("Enter size of array" );
     int n = in.nextInt();
     int a[]=new int[n];
     for ( int i=0; i < n; i++)
        {   System.out.println("Enter element " + i);
            a[i]=in.nextInt(); 
        }
      findlarge(a,n);
     
  }
}
