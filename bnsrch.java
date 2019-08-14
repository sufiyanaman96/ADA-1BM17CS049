import java.util.Scanner;
class bnsrch{  
	
public static void squareRoot(int n)
{   Scanner in = new Scanner( System.in);  
	
        
   int first=0;
   int last=n;
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( mid*mid < n ){  
        first = mid + 1;     
      }
      else if ( mid*mid == n ){  
        System.out.println("Square root is " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Square root is " + mid); 
   }  
 }  
 public static void main(String args[]){  
	 Scanner in = new Scanner( System.in); 
      System.out.println("Enter a number ");
     int n = in.nextInt();   
     squareRoot(n);    
 }  
}  
