 
 
import java.io.*;
import java.util.*;
import java.math.*;
 
class CHEFSUM_codechef {
 
   
    public static void main(String[] args) {
 
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
        while(t>0)
        {
            int i,min_i=0;
            int n=sc.nextInt();
            int a[]=new int[n];
            long sum=0,min=Long.MAX_VALUE,r_sum;
            
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            
            for(i=0;i<n;i++)
            {
                r_sum=sum+a[i];
                        if(r_sum<min)
                        {
                            min=r_sum;
                            min_i=i;
                            
                        }
            }
            System.out.println(min_i+1);
 
          t--;
        }
       
    }
 
}