package _2_上台阶;

import java.util.Scanner;

public class Main {
    public static long solve(long n){
        if(n==1||n==2)
            return n;
        long [][] dp=new long[(int)n][2];
        dp[0][0]=1;
        dp[0][1]=0;
        dp[1][0]=1;
        dp[1][1]=1;
        for(int i=2;i<n;i++){
            dp[i][0]=dp[i-1][0]+dp[i-1][1];
            dp[i][1]=dp[i-2][0];
        }
        return dp[(int)n-1][0]+dp[(int)n-1][1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(solve(n));

    }

}
