/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.io.*;

 class LOSTMAX_codechef {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s[]=new String[n];
       
        int l=0,i,c,j;
        
        while(n>0)
        {
            s[l++]=sc.nextLine();

            n--;
        }
        for(i=0;i<l;i++)
        {
            c=0;
            StringTokenizer st=new StringTokenizer(s[i]," ");
            int a[]=new int[st.countTokens()];
            while(st.hasMoreTokens())
            {
                a[c++]=Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(a);
            if(a[c-1]==c-1 && c>=1)
                System.out.println(a[c-2]);
            else
                System.out.println(a[c-1]);
            
            
            
        }
        
        
    }
    
    

}
