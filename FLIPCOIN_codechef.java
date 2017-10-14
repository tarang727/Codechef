

import java.io.*;
import java.util.*;
import java.math.*;

class FLIPCOIN_codechef {

   
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
     BigInteger num=BigInteger.ZERO.shiftLeft(n);
      int t=sc.nextInt();
      sc.nextLine();
        while(t>0)
        {
            int i;
            String s=sc.nextLine();
            StringTokenizer st=new StringTokenizer(s," ");
            int ch=Integer.parseInt(st.nextToken());
            int p=Integer.parseInt(st.nextToken());
            int q=Integer.parseInt(st.nextToken());
            if(ch==0)
            {
                for(i=p;i<=q;i++)
                {
                    if(a[i]==0)
                        a[i]=1;
                    else
                        a[i]=0;
                }
            }
            else
            {
                int count=0;
                for(i=p;i<=q;i++)
                {
                    if(a[i]==1)
                        count++;
                }
                System.out.println(count);
            }
           

          t--;
        } 
       
    }

}
