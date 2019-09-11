import java.util.*;

class BFS
{ static int queue[]= new int [20];
  static int queue_front=0, queue_end=0;
  static int visited[]=new int[5];  
  static int G[][] = new int[5][5];
  static int e=0,v=0;

  public static void enqueue(int v) 
  {
   queue[queue_end] = v;
   queue_end++;
  }
  public static int dequeue() 
  {
    int index = queue_front;
    queue_front++;
    return queue[index];
  }  

  public static void bfs ( int n , int source , int adj[][] )
  { int i=0;
    for ( i=0; i <= v; i++ )
    { visited [i]=0;
    }
    visited [source]=1;
    enqueue(source);
    System.out.println(source);
    while ( queue_front <= queue_end )
    {
     int f=dequeue();
     
     for(int j = 0; j < n; j++)
     {
      if( adj[f][j] == 1) 
      { if ( visited[j]==0 )
       {
        visited[j] = 1;
        enqueue(j);
        System.out.println(j); }
      }
     }
    }
  }
  public static void main ( String args [] )
 {
   Scanner in =new Scanner ( System.in);
   
   System.out.println("Enter the number of vertices:");
   int n = in.nextInt();
   int adj[][]= new int [n][n];
   System.out.println("Enter the adjacency matrix ");
   for ( int i=0; i<n; i++)
   {
     for ( int j=0; j<n; j++)
     {
       adj[i][j]=in.nextInt();
     }
   }   
   System.out.println("Enter the starting index ( source ):" );
   int source = in.nextInt();
   bfs ( n,source,adj);
 }
}   
