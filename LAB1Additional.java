import java.util.*;

class LAB1Additional
{   
   public static int find_lower(int []a, int n, int x)
{   Scanner in = new Scanner( System.in);  
	
        
   int first=0;
   int last=n-1;
   int mid = -1;
   int ans=-1;  
   while( first <= last )
  {   mid = (first+last)/2;
      if ( a[mid] < x ){  
        first = mid + 1;     
      }
      else if ( a[mid] == x ){  
        ans=mid;
        last=mid-1;  
        break;  
      }else{  
         last = mid - 1;  
      }  
  } 
    return ans;
}
   public static int find_higher(int []a, int n, int x)
{   Scanner in = new Scanner( System.in);  
	
        
   int first=0;
   int last=n-1;
   int mid = -1;
   int ans= -1;  
   while( first <= last )
  {   mid = (first+last)/2;
      if ( a[mid] < x ){  
        first = mid + 1;     
      }
      else if ( a[mid] == x ){  
        ans=mid;
        first=mid+1;  
        break;  
      }else{  
         last = mid - 1;  
      }  
  } 
    return ans;
}

public static void main(String[] args) throws Exception 
{
		int[] arr;
		Scanner read = new Scanner(new File("C:\\Users\\sufiy\\Desktop\\input.txt"));
		int t = read.nextInt();
		while(read.hasNextLine()) {
			read.nextLine();
			for(int j=0;j<t;j++) {
				int n = read.nextInt();
				int x = read.nextInt();
				arr = new int[n];
				
		     for(int m=0;m<n;m++) {
		    	 arr[m] = read.nextInt();
		    	 }
		     int lowindx= find_lower(arr,n,x);
                     int highindx= find_higher(arr,n,x);
                     int c= highindx-lowindx+1;
                     System.out.println(lowindx + highindx + c); 
                  }
               }
}     }              