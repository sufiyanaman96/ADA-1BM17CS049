import java.util.*;

class CoinChanger
{
  public static void main(String[] args)
  {
    int[] coins = {1, 2, 5};
    int sum = 6;
    CoinChanger m = new CoinChanger();
    System.out.println("At least " + m.coinChangeProblem(coins, sum) + " coins are required to make a value of " + sum);
    System.out.println("different coins used are");
    for(int i = 0; i <3; i++)
    {
     System.out.println(i+"-"+s[i]);
    }
  }
   int coinChangeProblem(int[] coins, int sum)
  {
    int totalCoins = coins.length;
    double[][] arr = new double[totalCoins + 1][sum + 1];
    int s[] = new int [totalcoins];
    for(int j = 0; j <= sum; j++)
    {
      arr[0][j] = Double.POSITIVE_INFINITY;
    }	      
    for(int i = 1; i <= totalCoins; i++)
    {
     arr[i][0] = 0;
    }
    for(int i = 1; i <= totalCoins; i++)
    {
     for(int j = 1; j <= sum; j++)
     {
      if(coins[i - 1] <= j)
      {	 arr[i][j] = min(1 + arr[i][j - coins[i - 1]], arr[i - 1][j]);
         s[i]=arr[i][j];
      }
      else
	 arr[i][j] = arr[i - 1][j];
     }
    }
    return (int)arr[totalCoins][sum];
  }
  double min(double a, double b)
  {
   if(a <= b)
   {
    return a;
   }
   else
   {
    return b;
   }
  }
}
