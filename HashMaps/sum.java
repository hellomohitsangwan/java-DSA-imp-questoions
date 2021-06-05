
//count numbers of sustring whose sum equals to k

import java.util.*;

public class sum {
public static void main(String[] args) {
    int a[] = {1 , 2, 2 , 2, 5 , 4  ,5 ,2  , 9, 3};
    int k = 6;

    HashMap<Integer , Integer> hm = new HashMap<>();
            //sum , frequency of sum
    hm.put(0, 1);
    int count = 0;
    int sum = 0;

    for(int i = 0; i < a.length ; i++){
        sum += a[i];
        if(hm.containsKey(sum - k)){
            count += hm.get(sum - k);
        }
        hm.put(sum, hm.getOrDefault(sum, 0) + 1);

    }
    System.out.println(count);
}    
}
