

import java.io.*;
import java.util.*;
import java.math.*;

class CHEFPDIG_codechef {

   
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      sc.nextLine();
        while(t>0)
        {
            String s=sc.nextLine();
            int a[]=new int[10];
            
            if(s.contains("6"))
            {
                a[6]++;
                s=s.replaceFirst("6", "a");
                if(s.contains("5"))
                {
                     
                    System.out.print("A");
                    a[5]++;
                }
                if(s.contains("6"))
                {
                     
                    System.out.print("B");
                    a[6]++;
                }
                if(s.contains("7"))
                {
                     
                    System.out.print("C");
                    a[7]++;
                    
                    
                }
                if(s.contains("8"))
                {
                     
                    System.out.print("D");
                    a[8]++;
                   
                }
                if(s.contains("9"))
                {
                     
                    System.out.print("E");
                    a[9]++;
                   
                }
                
            }
            if(a[7]>=1 || s.contains("7"))
            {
                a[7]++;
                s=s.replaceFirst("7", "c"); 
                if(s.contains("0"))
                {
                     
                    System.out.print("F");
                    a[0]++;
                }
                if(s.contains("1"))
                {
                     
                    System.out.print("G");
                    a[1]++;
                }
                if(s.contains("2"))
                {
                     
                    System.out.print("H");
                    a[2]++;
                }
                if(s.contains("3"))
                {
                     
                    System.out.print("I");
                    a[3]++;
                }
                if(s.contains("4"))
                {
                     
                    System.out.print("J");
                    a[4]++;
                }
                if(a[5]>=1 || s.contains("5"))
                {
                     
                    System.out.print("K");
                    a[5]++;
                }
                if(a[6]>=1)
                {
                     
                    System.out.print("L");
                    a[6]++;
                }
                if(s.contains("7"))
                {
                     
                    System.out.print("M");
                    a[7]++;
                }
                if(a[8]>=1 || s.contains("8"))
                {
                     
                    System.out.print("N");
                    a[8]++;
                }
                if(a[9]>=1 || s.contains("9"))
                {
                     
                    System.out.print("O");
                    a[9]++;
                }
            }
            if(a[8]>=1 || s.contains("8"))
            {
                a[8]++;
                s=s.replaceFirst("8", "d"); 
                if(a[0]>=1||s.contains("0"))
                {
                     
                    System.out.print("P");
                    a[0]++;
                }
                if(a[1]>=1||s.contains("1"))
                {
                     
                    System.out.print("Q");
                    a[1]++;
                }
                if(a[2]>=1||s.contains("2"))
                {
                     
                    System.out.print("R");
                    a[2]++;
                }
                if(a[3]>=1||s.contains("3"))
                {
                     
                    System.out.print("S");
                    a[3]++;
                }
                if(a[4]>=1||s.contains("4"))
                {
                     
                    System.out.print("T");
                    a[4]++;
                }
                if(a[5]>=1 || s.contains("5"))
                {
                     
                    System.out.print("U");
                    a[5]++;
                }
                if(a[6]>=1)
                {
                     
                    System.out.print("V");
                    a[6]++;
                }
                if(a[7]>=1)
                {
                     
                    System.out.print("W");
                    a[7]++;
                }
                if(s.contains("8"))
                {
                     
                    System.out.print("X");
                    a[8]++;
                }
                if(a[9]>=1 || s.contains("9"))
                {
                     
                    System.out.print("Y");
                    a[9]++;
                }
            }
            if(a[9]>=1 || s.contains("9"))
              if(a[0]>=1||s.contains("0"))
                    System.out.print("Z");
            
            System.out.println();
                
                
             t--;   
            }
            
                
         

          t--;
        }
       
    }


