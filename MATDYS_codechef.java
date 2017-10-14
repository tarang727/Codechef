/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.math.*;

class MATDYS_codechef {
    
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,i,n;
        BigInteger k,sol;
        t=sc.nextInt();
        
        while(t>0)
        {
           n=sc.nextInt();
           k= new BigInteger(sc.next());
           sol=BigInteger.ZERO;
           
           while(n>=1)
           {
               if((k.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO))!=0)
               {
                   sol=sol.add((BigInteger.ONE).shiftLeft(n-1));
                   
               }
               k=k.divide(BigInteger.valueOf(2));
               
               n--;
           }
           
           System.out.println(sol.toString());
           
           
       
       
           
        t--;
           
           
        }
        
                
    }
     
     
     

}
