

import java.io.*;
import java.util.*;
import java.math.*;

class MEX_codechef {

   
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
        while(t>0)
        {
            int i;
            int n=sc.nextInt();
            int k=sc.nextInt();
            Map<Integer,Integer>set=new TreeMap<>();
            
            for(i=0;i<n;i++)
            {
                set.put(sc.nextInt(),1);
            }
            int c=-1;
            while(true)
            {
                c++;
                if(set.containsKey(c))
                    continue;
                if(k==0)
                {
                    System.out.println(c);
                    break;
                }
                k--;
            }
            
            
           

          t--;
        }
       
    }

}
