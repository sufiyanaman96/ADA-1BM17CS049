import java.util.*;

class nqueens
{   
    public static int N;
    public static int[][] board = new int[100][100];
    public static boolean Attackable(int i,int j)
    {
        int k,l;
       
        for(k=0;k<N;k++)
        {
            if((board[i][k] == 1) || (board[k][j] == 1))
                return true;
        }
       
        for(k=0;k<N;k++)
        {
            for(l=0;l<N;l++)
            {
                if(((k+l) == (i+j)) || ((k-l) == (i-j)))
                {
                    if(board[k][l] == 1)
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean nQueen(int n)
    {
        int i,j;
       
        if(n==0)
            return true;
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if((!Attackable(i,j)) && (board[i][j]!=1))
                {
                    board[i][j] = 1;
                    
                    if(nQueen(n-1)==true)
                    {
                        return true;
                    }
                    board[i][j] = 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the value of N:");
        N = in.nextInt();

        int i,j;
        
        nQueen(N);
       
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
                System.out.print(board[i][j]);
            System.out.println();
        }
        
    }
}
