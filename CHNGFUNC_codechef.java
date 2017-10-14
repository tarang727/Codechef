/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
class CHNGFUNC_codechef {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int ans=0;
        
        for(int i=1;i<=A;i++)
        {
            ans+=Math.sqrt(i*i+B)-Math.sqrt(i*i);
        }
        System.out.println(ans);
        
    }

}
