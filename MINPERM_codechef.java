

import java.io.*;
import java.util.*;
import java.math.*;

class MINPERM_codechef {

   
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
        while(t>0)
        {
          int n=sc.nextInt();
          int i;
          int a[]=new int[n];
          if(n%2==0)
          {
              for(i=0;i<n-1;i+=2)
              {
                  a[i]=i+2;
                  a[i+1]=i+1;
              }
              for(i=0;i<n;i++)
              System.out.print(a[i]+" ");
              
          }
          else
          {
              int l=n-3;
              
              for(i=0;i<l-1;i+=2)
              {
                  a[i]=i+2;
                  a[i+1]=i+1;
              }
              a[n-3]=n-1;
              a[n-2]=n;
              a[n-1]=n-2;
              for(i=0;i<n;i++)
              System.out.print(a[i]+" ");
                  
              
          }
          System.out.println();
          t--;
        }
       
    }

}
