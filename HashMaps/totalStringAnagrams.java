import java.util.*;
public class totalStringAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sourse = sc.nextLine();
        String given = sc.nextLine();

        System.out.println(anagramsList(sourse, given));
    }

    static boolean compare(HashMap<Character , Integer> sMap , HashMap<Character , Integer> gMap){
        for(char sKey : sMap.keySet()){
            if(gMap.getOrDefault(sKey, 0) != sMap.get(sKey)){
                return true;
            }
        }
        return false;
    }

    static List<Integer> anagramsList(String s , String g) {

        HashMap<Character , Integer> sm = new HashMap<>();
        HashMap<Character , Integer> gm = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        
        for(int i = 0; i<g.length() ; i++) {
            gm.put(g.charAt(i), gm.getOrDefault(g.charAt(i), 0) + 1);
        }
        for(int i = 0; i < g.length() ; i++){
            char c = s.charAt(i);
            sm.put(c , sm.getOrDefault(c , 0) + 1);
        }

        int i = g.length();
        while(i < s.length()){
            if(compare(sm, gm) == true){
                ls.add(i - g.length());
            }
            char toAdd = s.charAt(i);
            sm.put(toAdd, sm.getOrDefault(toAdd, 0) + 1);

            char toRemove = s.charAt(i - g.length());
            if(sm.get(toRemove) == 1){
                sm.remove(toRemove);     
            }else{
                sm.put(toRemove, sm.get(toRemove) - 1);
            }
            i++;
        }
        if(compare(sm, gm)){
            ls.add(i - g.length());
        }
        return ls;
    }

}