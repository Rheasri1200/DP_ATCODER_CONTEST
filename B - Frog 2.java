// "static void main" must be defined in a public class.
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
          int k=sc.nextInt();
            int[] h=new int[n];
            for(int i=0;i<n;i++){
                h[i]=sc.nextInt();
            }
            int[] dp=new int[n+1];
            dp[0]=0;
            for(int i=1; i<n; i++)
    {
        int x=Math.min(i,k);
               int temp = Integer.MAX_VALUE;
        for(int j=1; j<=x; j++)
            temp = Math.min(temp, dp[i-j]+Math.abs(h[i]-h[i-j]));
        dp[i] = temp;
    }
            System.out.println(dp[n-1]);
        }
    }
    
}
