
// ques := given an array find the index of missing element from a countinuoe array(Positive only)

import java.lang.reflect.Array;
import java.util.*;
public class arratyQues2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        boolean b[] = new boolean[100];
        for(int i = 0 ; i < b.length ; i++) {
            b[i] = false;
        }

        for(int i = 0; i < a.length ; i++) {
            if(a[i] >= 0){
                b[a[i]] = true;
            }
        }
        for(int i = 1; i < b.length ; i++) {
            if(b[i] == false){
                System.out.println(i);
                break;
            }
        }

        System.out.println(method2(a));

    }
    static int method2(int a[]) {
        int count = 1;
        for(int i = 0; i <= a.length ; i++) {
            if(a[i] > 0 && a[i] == count) {
                count++;
            }
            else if(a[i] <= 0) {
                continue;
            }
            else{
                return count;
            }
        }
        return count;
    }
}
