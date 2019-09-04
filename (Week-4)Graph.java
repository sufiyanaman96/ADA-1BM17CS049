import java.util.*;
class Graph
{   static int G[][] = new int[5][5];
    static int visited[]=new int[5];
    static int e=0,v=0;
    public static void DFS(int i)
   {
      
      visited[i]=1;
      System.out.println(i);
      for(int j=0;j<v;j++)
      {
        if(G[i][j]==1&&visited[j]==0)
            DFS(j);
      }
   }
  public static void adjacency ( int edj, int vert )
  {  Scanner in = new Scanner ( System.in);
     edj=e;  vert=v;
      for(int i=0; i<vert; i++)
    {
        for(int j=0; j<vert; j++)
            G[i][j]=0;
    }
  
    for(int i=0; i<=edj; i++)
    {
        System.out.println("Enter the edges (format: V1 V2) : ");
        int v1=in.nextInt();
        int v2=in.nextInt();
        G[v1-1][v2-1]=1;

    }

    for(int i=0; i<vert; i++)
    {
        for(int j=0; j<vert; j++)
            System.out.println(G[i][j]);
        System.out.println("");
    }
   }
    public static void connectedComponents() 
   {    
        
        for(int i = 0; i < v; ++i) { 
            if(visited[i]==0) { 
              
                DFS(i); 
                System.out.println(); 
            } 
        } 
    } 
   public static void main ( String args[])
   {
     Scanner in = new Scanner ( System.in);
     System.out.println("Enter the number of edges: ");
     e=in.nextInt();
     System.out.println("Enter the number of vertices: ");
     v=in.nextInt();
     adjacency(e,v);
     System.out.println("Following are connected components"); 
     connectedComponents();
   }
}
     
