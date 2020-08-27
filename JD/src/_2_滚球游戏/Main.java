package _2_滚球游戏;
import java.util.Scanner;
/*
某滚球游龙规则如下：

球从入口处（第一层）开始向下滚动，每次可向下滚动一层，直滚至最下面一层为止。
球每次可滚至左下、下方或右下三个方格中的任意一个，每个方格都有一个得分，如下图所示:
第1层有1个方格，第2层有3个方格…….
以此类推，第n层有2*n-1个方格。设计一个算法，使得球从入口滚至最下面一层的总得分和最大。

 */

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] map=new int[n][n*2];
        for(int i=0;i<n;i++){
            for(int j=0;j<(2*(i+1))-1;j++){
                map[i][j]=sc.nextInt();
            }
        }
        int [][]dp=new int[n][n*2];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<(2*(i+1))-1;j++){
                if(i==n-1){
                    dp[i][j]=map[i][j];
                    continue;
                }
                dp[i][j]=map[i][j]+Math.max(dp[i+1][j],Math.max(dp[i+1][j+1],dp[i+1][j+2]));
            }
        }
        System.out.println(dp[0][0]);
    }
}
