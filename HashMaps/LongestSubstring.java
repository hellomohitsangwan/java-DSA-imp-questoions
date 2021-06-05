
// find the longest contiguos substring with atmost k unique characters

import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

        System.out.println(LS(s, k));
    }
    public static int LS(String s , int k) {
        int i = -1;
        int j = -1;
        int answer =  0;
        HashMap <Character ,Integer> hm = new HashMap<>();

        while(true) {
            boolean f1 = false;
            boolean f2 = false;

            while(i < s.length() - 1) {
                f1 = true;
                i++;
                char c = s.charAt(i);
                hm.put(c , hm.getOrDefault(c , 0) + 1);

                if(hm.size() <= k) {
                    int length = i - j;
                    if(length > answer) {
                        answer = length;
                    }
                    continue;
                } else{
                    break;
                }
            }

            while(j < i) {
                f2 = true;
                j++;
                char c = s.charAt(j);
                if(hm.get(c) ==  1){
                    hm.remove(c);
                }
                else{
                    hm.put(c, hm.get(c) - 1 );
                }
                if(hm.size() > k) {
                    continue;
                } else{
                    break;
                }
            }
            if(!f1 && !f2) {
                break;
            }
        }
        return answer;

    }
}
