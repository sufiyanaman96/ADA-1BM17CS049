import java.util.*;

class topo_sorting
{   
    public static int N;
    public static int[][] matrix = new int[100][100];
    public static boolean topo( int matrix[][])
    {
       int i;
       for(i=0;i<N;i++)
        {
         int x=sum(matrix[i]);
         if (x>0) continue;
         else
         {
          for ( int z=0;z<N;z++)
                  {   matrix[i][z]=0; 
                      System.out.println(i);
                  }  
         }  
       }
    }

    public static void main(String[] args)
    {
        int N=4;
        int [][] tasks= {{1,0},{2,0},{3,1},{3,2}};
        
        for(int i=0;i<N;i++)
        {
          for(int j=0;j<N;j++)
                matrix[i][j]=0;
        }
        for (int x : tasks) 
        {  matrix[x[0]][x[1]]=1;
        }
       
        topo(matrix);
    }
}
