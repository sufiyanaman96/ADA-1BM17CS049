import java.lang.Math;
public class Floyd{
    static void fillMatrix(int[][] D){
        for(int k=0;k<D.length;k++){
            for(int i=0;i<D.length;i++){
                for(int j=0;j<D.length;j++){
                    D[i][j]= Math.min(D[i][j],D[i][k]+D[k][j]);
                }
            } 
        }
    }
   static void printMatrix(int[][] D){
        for(int i=0;i<D.length;i++){
            for(int j=0;j<D.length;j++){
                    System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] D = new int[][]{{0,2,999,1,8},{6,0,3,2,999},{999,999,0,4,999},{999,999,2,0,3},{3,999,999,999,0}};
        fillMatrix(D);
        printMatrix(D);
    }
}
