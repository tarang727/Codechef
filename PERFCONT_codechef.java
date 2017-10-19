

import java.io.*;
import java.util.*;
import java.math.*;

class PERFCONT_codechef {

   
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
        while(t>0)
        {
            int i,hard=0,cake=0;
            int n=sc.nextInt();
            int p=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(i=0;i<n;i++)
            {
                if(a[i]>=(p/2))
                    cake++;
                else if(a[i]<=(p/10))
                    hard++;
                if(cake>1||hard>2)
                    break;
            }
            if(cake==1&&hard==2)
                System.out.println("yes");
            else
                System.out.println("no");
            
           

          t--;
        }
       
    }

}
