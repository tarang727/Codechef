/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

 class MAXOR_codechef {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        final int z=20;
        int maxk,n,t,i,j,x;
        long ans=0;
        maxk=1<<z;
        
        int exact[]=new int[maxk];
        t=sc.nextInt();
        if(t<1||t>20)
            System.exit(0);
        while(t>0)
        {
            ans=0;
            int dp[]=new int[maxk];
           n=sc.nextInt();
           if(n<1||n>1000000)
               System.exit(0);
           for(i=0;i<n;i++)
           {
               x=sc.nextInt();
               if(x<0||x>1000000)
                   System.exit(0);
               dp[x]++;
           }
           exact=Arrays.copyOf(dp,dp.length);
           for(j=0;j<z;j++)
           {
               for(i=0;i<maxk;i++)
                   if((i>>j&1)!=0)
                       dp[i]+=dp[i^1<<j];
           }
           for(i=0;i<maxk;i++)
           {
               dp[i]-=exact[i];
               ans+= (long)exact[i]*(2*dp[i]+exact[i]-1)/2;
           }
           System.out.println(ans);
           t--;
           
           
        }
        
                
    }
     
    

}
