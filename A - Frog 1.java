// "static void main" must be defined in a public class.
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] h=new int[n];
            for(int i=0;i<n;i++){
                h[i]=sc.nextInt();
            }
            int[] dp=new int[n+1];
            dp[0]=0;
            for(int i=1; i<n; i++)
    {
        if(i==1)
            dp[i] = dp[i-1]+Math.abs(h[i]-h[i-1]);
        else
            dp[i] = Math.min(dp[i-1]+Math.abs(h[i]-h[i-1]), dp[i-2]+Math.abs(h[i]-h[i-2]));
    }
            System.out.println(dp[n-1]);
        }
    }
    
}
