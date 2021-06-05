
// given string s compressit in two waya,eg:-
//  s = aaabcggdhh
//  c1 = abcgdh
//  c2 = a3bcg2dh2
import java.util.*;
public class stringQues{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(c1(s));
        System.out.println(c2(s));
    }
    
    public static String c1(String s){

        String ans = Character.toString(s.charAt(0));

         for(int i = 1; i < s.length() ; i++){
             char curr = s.charAt(i);
             char prev = s.charAt(i - 1);
             if(prev != curr){
                 ans += curr;
             }
         }
         return ans;
    }
    static String c2(String s) {
        int count = 1;
        String ans = s.substring(0 , 1);
        for(int i = 1 ; i < s.length() ; i++) {
            char prev = s.charAt(i-1);
            char curr = s.charAt(i);
            if(prev == curr) {
                count += 1;
            } 
            else{
                if(count > 1) {
                    ans += count;
                    count = 1;
                }
                ans += curr;
            }
        }
        if(count > 1) {
            ans += count;
        }
        return ans;
    }
}