class Solution 
{
    public int stoneGameVII(int[] s) 
    {
        int n=s.length;
        int dp[]=new int[n];
        for(int i=n-2;i>=0;i--)
        {
             int t=s[i];
             for(int j=i+1;j<n;j++)
             {
                t=t+s[j];
                dp[j]=Math.max(t-s[i]-dp[j],t-s[j]-dp[j-1]);
             }
        }
        return dp[n-1];
    }
}