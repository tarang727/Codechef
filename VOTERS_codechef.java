

import java.io.*;
import java.util.*;
import java.math.*;

class VOTERS_codechef {

   
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      int i;
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      Map<Integer,Integer> idfreq=new TreeMap<>();
      List <Integer> finalList=new ArrayList<>();
      for(i=1;i<=n1+n2+n3;i++)
      {
          Integer a=sc.nextInt();
          inputMap(a,idfreq);
      }
      for(Map.Entry<Integer,Integer> entry:idfreq.entrySet())
      {
          Integer value=entry.getValue();
          if(value>=2)
              finalList.add(entry.getKey());
      }
      System.out.println(finalList.size());
      for(Integer k:finalList)
          System.out.println(k);
      
      
      
      
      
       
    }
    public static void inputMap(Integer key, Map idfreq)
    {
        if(idfreq.containsKey(key))
        {
            Integer freq = (Integer) idfreq.get(key);
            idfreq.put(key, freq+1);
        }
        else
            idfreq.put(key, 1);
    }

}
