import java.io.*;
import java.util.Scanner;

class arrSearch{
	
public arrSearch(int[] arr1,int n,int k){
	int j=0;
	for(int i=0;i<n;i++) {
		if(arr1[i]==k) {
			j = 1;
			break;
		}
		else {
			j = -1;
		}
		
	}
	System.out.println(j);
}	

}

 class Driver {
	public static void main(String[] args) throws Exception {
		int[] arr;
		Scanner read = new Scanner(new File("C:\\Users\\H\\Desktop\\input.txt"));
		int t = read.nextInt();
		while(read.hasNextLine()) {
			read.nextLine();
			for(int j=0;j<t;j++) {
				int n = read.nextInt();
				int k = read.nextInt();
				arr = new int[n];
				
		     for(int m=0;m<n;m++) {
		    	 arr[m] = read.nextInt();
		    	 }
		     new arrSearch(arr,n,k);
		        
		        
		        }
			
		    }
		}
	}
	
	
	

