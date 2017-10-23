

import java.io.*;
import java.util.*;
import java.math.*;

class CK87MEDI_codechef {

   
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int i;
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            
            System.out.println(a[(n+k)/2]);
            
            
                
           

          t--;
        }
       
    }

}
