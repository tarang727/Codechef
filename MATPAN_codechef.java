/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.*;
import java.io.*;
import java.math.*;

 class MATPAN_codechef {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n,k,i,l,c;
        long cost;
        t=sc.nextInt();
        String s;
        int a[]=new int[26];
        
        if(t<1||t>10)
            System.exit(0);
        while(t>0)
        {
            cost=0;
            for(i=0;i<26;i++)
                a[i]=sc.nextInt();
            
            int b[]=new int[26];
            s=sc.next();
            l=s.length();
            
            for(i=0;i<l;i++)
            {
                c=(int)s.charAt(i);
                b[c-97]++;
            }
            
            for(i=0;i<26;i++)
            {
                if(b[i]==0)
                    cost+=a[i];
            }
            
            System.out.println(cost);
            
            
            
            
            
         
            
            t--;
        }
        
        
        
    }

}
