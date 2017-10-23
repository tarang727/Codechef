

import java.io.*;
import java.util.*;
import java.math.*;

class CK87QUER_codechef {

   
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
        while(t>0)
        {
            long y,a,i,sum=0,p;
            y=sc.nextLong();
            for(i=1;i<=700;i++)
            {
                if(y-i<0)
                    break;
                p=(int)Math.sqrt(y-i);
                sum+=p;
            }
            
            System.out.println(sum);
           

          t--;
        }
       
    }

}
