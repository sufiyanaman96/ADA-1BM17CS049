import java.util.*; 
class LCS
{ 
    public static void lcs(String s1, String s2, int x, int y) 
    { 
        int[][] L = new int[x+1][y+1];   
        for (int i=0; i<=x; i++) 
        { 
            for (int j=0; j<=y; j++) 
            { 
                if (i==0 || j==0) 
                    L[i][j]=0; 
                else if (s1.charAt(i-1)==s2.charAt(j-1)) 
                    L[i][j] = L[i-1][j-1] + 1; 
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
            } 
        } 
        int index = L[x][y]; 
        int t = index; 
        char[] lcs = new char[index+1]; 
        lcs[index] = '';   
        int i = x, j = y; 
        while (i > 0 && j > 0) 
        {
            if (s1.charAt(i-1) == s2.charAt(j-1)) 
            {  
                lcs[index-1] = s1.charAt(i-1);   
                i--;  
                j--;  
                index--;      
            } 
            else if (L[i-1][j] > L[i][j-1]) 
                i--; 
            else
                j--; 
        } 
        System.out.print("LCS of "+s1+" and "+s2+" is "); 
        for(int k=0;k<=t;k++) 
            System.out.print(lcs[k]); 
    }  
    public static void main (String[] args)  
    { 
        String s1 = "AGGTAB"; 
        String s2= "GXTXAYB"; 
        int x = s1.length(); 
        int y = s2.length(); 
        lcs(s1, s2, x, y); 
    } 
} 