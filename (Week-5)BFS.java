import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
class BFS
{
 public static int adj[][]=new int [10][10];
 public static int n=0;
 public static int v[]= new int[10];
 
public static void input()
{       Scanner in = new Scanner (System.in);
   System.out.println("enter the number of nodes");
   n=in.nextInt();
   for(int i=0;i<n;i++){
       v[i]=0;
   }
   System.out.println("enter adjacent matrix");
   for(int i=0;i<n;i++){
       for(int j=0;j<n;j++){
           adj[i][j]=in.nextInt();
       }
   }
}
public static void BFS(int k)
{
   Queue <Integer> q = new LinkedList<>();
   v[k]=1;
   System.out.println(k);
   q.add(k);
   while(!q.isEmpty()){
       int f= q.remove();
       
       for(int i=0;i<n;i++){
           if(adj[f][i]==1){
               if(v[i]==0){
                   q.add(i);
                   v[i]=1;
                   System.out.println(i);
               }
           }
       }
   }
}
public static void main(String args[])
{       Scanner in = new Scanner (System.in);
   input();
   System.out.println("enter the source vertex");
   int start= in.nextInt();
   BFS(start);
}
}

