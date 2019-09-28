import java.util.*;

class Main 
{ 
 public static int a[][]=new int[10][10];
 public static int n=0;
 public static void input()
 {  Scanner in= new Scanner(System.in);
    int c=0,b=0;
    System.out.println("Enter no. of tasks ");
    n=in.nextInt();
    for(int i=0; i<n; i++)
      {  for(int j=0; j<n; j++)
        {    a[i][j]=0;
        }
      }
    while(c!= -1 || b!=-1)
     {   
        System.out.println("Enter dependencies [b:c]........[-1,-1] to stop");
        b=in.nextInt();
        c=in.nextInt();
        if(c!= -1 || b!=-1)
        {    a[c][b]=1;  }
     }
 }
 public static void findorder()
 {  int indegree[]=new int[10],k,top=-1;
    int s[]= new int[10]; 
    for(int i=0 ;i<n; i++)
     {   indegree[i]=0;
        for(int j=0; j<n; j++)
        {   indegree[i] +=a[j][i];
        }
     }
    for(int i=0;i<n;i++)
     {       if(indegree[i]==0)
              {  s[++top]=i;
              }
     }
    while(top!=-1 )
     {       
       k=s[top--];
       System.out.println(k);
       indegree[k]=-1;
       for(int r=0; r<n; r++)
        {  
          if(a[k][r]==1)
           {   indegree[r] -=1;
                    if(indegree[r]== 0)
                    {    s[++top]=r;
                    }
           }
           
        }
    }
 }
 public static void main(String args[])
 {
    input();
    findorder();
 }
}
