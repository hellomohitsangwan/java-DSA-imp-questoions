
// /find numbers of substring which have atmost k unique characters:-

import java.util.*;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();

        int k = sc.nextInt();
        
         System.out.println(substrings(s, k));

    }
    public static int substrings(String s , int k) {
        int count = 0;
        int start = -1;
        int end = -1;

        HashMap <Character , Integer> hm = new HashMap<>();

        while(true) {
             while(start < s.length()-1) {
                 start++;
                 char c = s.charAt(start);
                 hm.put(c, hm.getOrDefault(c, 0) + 1);

                 if(hm.size() <= k){
                     count += start - end;
                 }
                 else{
                     break;
                 }

             }
             if(start == s.length() - 1 && hm.size() <= k) {
                 break;
             }
             while(end < start) {
                 end++;
                 char c = s.charAt(end);
                 if(hm.get(c) == 1){
                     hm.remove(c);
                 }else{
                    hm.put(c, hm.get(c) - 1);
                 }
                 

                 if(hm.size() > k) {
                     continue;
                 }else{
                    count += start - end; 
                    break;
                 }
             }

        }
        return count;
 
    }
}
