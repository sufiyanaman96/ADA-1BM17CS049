class Island { 
    
    int ROW = 5, COL = 5; 

    void DFS(int M[][], int r, int c, boolean visited[][]) 
    { 
        int row[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 }; 
        int col[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 }; 
  
  
        visited[r][c] = true;   
        for (int k = 0; k < 8; ++k) 
            if (isSafe(M, r + row[k], c + col[k], visited)) 
                DFS(M, r + row[k], c + col[k], visited); 
    }
    boolean isSafe(int M[][], int row, int col, 
                   boolean visited[][]) 
    { 
        return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == 1 && !visited[row][col]); 
    } 
   
  
    int countIslands(int M[][]) 
    { 
        boolean visited[][] = new boolean[ROW][COL]; 
  
        int count = 0; 
        for (int i = 0; i < ROW; ++i) 
            for (int j = 0; j < COL; ++j) 
                if (M[i][j] == 1 && !visited[i][j]) 
                {   DFS(M, i, j, visited); 
                    ++count; 
                } 
  
        return count; 
    } 
}  
  public class Driver{
    public static void main(String[] args) throws java.lang.Exception 
    { 
        int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
                                  { 0, 1, 0, 0, 1 }, 
                                  { 1, 0, 0, 1, 1 }, 
                                  { 0, 0, 0, 0, 0 }, 
                                  { 1, 0, 1, 0, 1 } }; 
        Island I = new Island(); 
        System.out.println("Number of islands is: " + I.countIslands(M)); 
    } 
} 
