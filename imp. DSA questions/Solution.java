import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args) {
      int a[] = {1 , 12 , 5 , 111 , 200 , 1000 , 10};
      int k = 50;
      System.out.println(maximumToys(a, k));
   }

   static int maximumToys(int[] p, int k) {
        Arrays.sort(p);
    int count = 0;
    
    for(int i = 0 ; i < p.length ; i++){
        k -= p[i];
        if(k < 0) return count;
        count++;
    }
    return count;
}

}
