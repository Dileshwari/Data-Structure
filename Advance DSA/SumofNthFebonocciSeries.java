package Dileshwari;

public class SumofNthFebonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n =4;//0,1,1,2,3,4
		//System.out.print(febonocciSeries(n));
		
		
		int num=12; int k=3;
		System.out.print(factor(num,k));
	}

	private static int factor(int n, int k) {
		
		if(n>0 && k>0) {
			 for(int i=1;i<=n;i=i+k) {
				 
				 if(i==k) {
					 
					 return i;
				 }
			 }
			
		}
		return -1;
	}

	private static int febonocciSeries(int n) {
		int[] dp = {0, 1, 1};
	    for (int i = 3; i <= n; i++) {
	      dp[i % 3] = dp[0] + dp[1] + dp[2];
	    }
	    return dp[n % 3];
		
	}

}
