

import java.io.*;
import java.util.*;
import java.math.*;

class TWTCLOSE_codechef {

   
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int a[]=new int[n];
      int j;
      sc.nextLine();
        while(k>0)
        {
            int count=0;
            String s=sc.nextLine();
            StringTokenizer st=new StringTokenizer(s," ");
            if(st.nextToken().equals("CLICK"))
            {
                int i=Integer.parseInt(st.nextToken());
                if(a[i-1]==0)
                    a[i-1]=1;
                else
                    a[i-1]=0;
                
               
            }
            else
            {
                for(j=0;j<n;j++)
                    a[j]=0;
                    
            }
            
            
            
            
            
            for(j=0;j<n;j++)
                    if(a[j]==1)
                        count++;
            
           System.out.println(count);

          k--;
        }
       
    }

}
