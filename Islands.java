import java.util.*;
class Islands
{
    static int M[][]=new int[row][col];
    static int n1=0,n2=0,row=10,col=10;
    static boolean visited[][] = new boolean[row][col];
    public void input()
    {   Scanner in = new Scanner ( System.in);
        System.out.println("Enter the no. of rows: ");
        n1=in.nextInt();
        System.out.println("Enter the no. of cols: ");
        n2=in.nextInt();
        for (int i=0; i<n1; i++)
        {  for(int j=0; j<n2; j++)
             { visited[i][j]=false;
             }
        }
        System.out.println("enter the input matrix of graph");
        for(int i=0; i<n1; i++)
          {  for(int j=0; j<n2; j++)
            {    M[i][j]=in.nextInt();
            }
          }
    }
    int isSafe(int row,int col)
    {       return ((row>=0)&&(row<n1)&&(col>=0)&&(col<n2)&&(M[row][col]&& !visited[row][col]));
    }
    public void DFS(int row,int col)
    {       int rowNbr[]={-1,-1,-1,0,0,1,1,1};
           int colNbr[]={-1,0,1,-1,1,-1,0,1};
           visited[row][col]=true;
           for(int k=0; k<8; k++)
           { if(isSafe(M,row+rowNbr[k],col+colNbr[k],visited))
              {  DFS(M,row+rowNbr[k],col+colNbr[k],visited);
              }
           }
    }
    int countIslands()
    {     int count=0;
          for(int i=0; i<n1; ++i)
           { for(int j=0; j<n2; ++j)
               { if(M[i][j] && !visited[i][j])
                 { DFS(M,i,j,visited);
                   ++count;
                 }
               }
           }
           return count;

    }
}
class Driver 
 {
   public static void main(String args[])  
   {  Islands i = new Islands(); 
       i.input();
      int n=i.countIslands(M);
      System.out.println("These numbers of islands are present"+n);
      
   }
}
