import java.util.*;
import java.io.*;
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[][] h=new int[n][3];
            for(int i=0;i<n;i++){
                h[i][0]=sc.nextInt();
                h[i][1]=sc.nextInt();
                h[i][2]=sc.nextInt();
            }
        
        int[][] dp=new int[n][3];
        dp[0][0]=h[0][0];
        dp[0][1]=h[0][1];
        dp[0][2]=h[0][2];
        for(int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2])+h[i][0];
    dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2])+h[i][1];
    dp[i][2] = Math.max(dp[i-1][0],dp[i-1][1])+h[i][2];
    
            }
int ans = Math.max(dp[n-1][0],Math.max(dp[n-1][1],dp[n-1][2]));
System.out.println(ans);
        }
        
        
    }
}
