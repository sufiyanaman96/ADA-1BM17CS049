class Suduko 
{ 
 public static boolean isSafe(int[][] suduko, int row, int col, int num)  
 {     
    for (int d = 0; d < suduko.length; d++)  
    { 
        if (suduko[row][d] == num)  
        { 
            return false; 
        } 
    } 
      
    for (int r = 0; r < suduko.length; r++) 
    { 
        if (suduko[r][col] == num) 
        { 
            return false; 
        } 
    } 
  
    int sqrt = (int) Math.sqrt(suduko.length); 
    int boxRStart = row - row % sqrt; 
    int boxCStart = col - col % sqrt; 
  
    for (int r = boxRStart; 
             r < boxRStart + sqrt; r++)  
    { 
        for (int d = boxCStart;  
                 d < boxCStart + sqrt; d++)  
        { 
            if (suduko[r][d] == num)  
            { 
                return false; 
            } 
        } 
    } 
  
    return true; 
 } 
  
 public static boolean solveSudoku(int[][] suduko, int n)  
 { 
    int row = -1; 
    int col = -1; 
    boolean isEmpty = true; 
    for (int i = 0; i < n; i++) 
    { 
        for (int j = 0; j < n; j++)  
        { 
            if (suduko[i][j] == 0)  
            { 
                row = i; 
                col = j; 
                  
                isEmpty = false;  
                break; 
            } 
        } 
        if (!isEmpty) 
        { 
            break; 
        } 
    } 
  
    if (isEmpty)  
    { 
        return true; 
    } 
  
    for (int num = 1; num <= n; num++) 
    { 
        if (isSafe(suduko, row, col, num)) 
        { 
            suduko[row][col] = num; 
            if (solveSudoku(suduko, n))  
            { 
              return true; 
            }  
            else
            { 
                suduko[row][col] = 0;
            } 
        } 
    } 
    return false; 
 } 
  
 public static void print(int[][] suduko, int N) 
 { 
    for (int r = 0; r < N; r++) 
    { 
        for (int d = 0; d < N; d++) 
        { 
            System.out.print(suduko[r][d]); 
            System.out.print(" "); 
        } 
        System.out.print("\n");         
    } 
 } 
  
 public static void main(String args[]) 
 { 
  
    int[][] suduko = new int[][] 
    { 
            {2, 0, 0, 0 }, 
            {0, 1, 3, 0 },  
            {3, 0, 0, 1 }, 
            {0, 2, 4, 0 } 
            
    }; 
    int N = suduko.length; 
  
    if (solveSudoku(suduko, N)) 
    { 
        print(suduko, N); 
    }  
    else
    { 
        System.out.println("No solution"); 
    } 
 } 
} 
