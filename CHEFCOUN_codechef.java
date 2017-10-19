

import java.io.*;
import java.util.*;
import java.math.*;

class CHEFCOUN_codechef {

   
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            BigInteger N=BigInteger.valueOf(n);
            BigInteger mx= new BigInteger("4294967295");
            BigInteger x=mx.divide(N.add(BigInteger.ONE));
            for(int i=1;i<n;i++)
                System.out.print(x+" ");
            System.out.println(((mx.subtract((N.subtract(BigInteger.ONE)).multiply(x))).divide(BigInteger.valueOf(2))).add(BigInteger.ONE));
           

          t--;
        }
       
    }

}
