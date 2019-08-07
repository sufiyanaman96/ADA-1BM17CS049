package adalab;
import java.util.*;

public class max {
 int n;
 int arr[];
 static void max(int[] arr,int n)
 {
	 int max= arr[0];
	 for(int i=0;i<n;i++)
	 { if(arr[i]>max)
		 max =arr[i];
	 }
	 System.out.println("The max number is:"+max);
 }
 public static void main( String args[])
 	{ 	Scanner in = new Scanner( System.in);
 		System.out.println("Enter the maximum number of elements: ");
 		int n=in.nextInt();
 		int[] arr= new int[n];
 		System.out.println("enter the integers");
 		for (int i=0; i<n; i++)
		{
			arr[i]=in.nextInt();
		}
 		max ( arr, n);
 	}
}