import java.util.*;
public class frequencyTable {
    public static void main(String[] args) {
        String s = "rfrgrbjkkkmdjw";
        int frequencyArray[] = new int[26];

        // method - 1 : using ascii values;
        for(int i = 0 ; i < s.length(); i++) {
            frequencyArray[s.charAt(i) - 'a']++;
        }
        //// for(int i = 0 ; i < 26 ; i++){
        ////     System.out.println(frequencyArray[i] + " ");
        //// }

        //method - 2 : using hashmaps;
        HashMap <Character ,Integer> hm = new HashMap<>();
        for(int i = 0 ; i  < s.length() ; i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            
        }
        System.out.println(hm);
    }
}
