
// ques = print "YES" if the goven strong contains 3 continuos vowels and atleast 5 consonants
// (no need to to continuous) , eg:
// String s = "abcaeifghdffgh"
// output = "YES"


import java.util.*;

public class vowecontVowels {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     boolean flag = false;
     int count = 0;

     Set<Character> set = new HashSet<>();
     for(int i = 0; i < s.length() ; i++) {
         if(s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O' && s.charAt(i) != 'U') {
             set.add(s.charAt(i));
             if(count >= 3) {
                 flag = true;
             }
             count = 0;
         }
         else{
             count++;
         }
     }
     if(set.size() >= 5 && flag == true) {
         System.out.println("yes");
     }
     else{
         System.out.println("no");
         System.out.println(set + " " +  count);
     }
    }
}
