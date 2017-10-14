/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.*;
class CHNGOR_codechef {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int ans=0;
            for(int i=0;i<n;i++)
            {
               ans=ans|sc.nextInt();
            }
            
            System.out.println(ans);
            
            t--;
        }
        
    }

}
