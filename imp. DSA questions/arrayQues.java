
// given an array , find the index of repetitive element(if more than one element repeats them then print the min. index among them)
// approach = making an index array , that stores the index of all the element present in given array 

import java.util.*;
public class arrayQues{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0 ; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int idx[] = new int[1000];
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i < idx.length ; i++){
            idx[i] = -1;
        }
        for (int i = 0 ; i < a.length ; i++) {
            if(idx[a[i]] != -1) {
                minIndex = Math.min(minIndex, idx[a[i]]);
            }
            else{
                idx[a[i]] = i;
            }
        }
        if(minIndex != Integer.MAX_VALUE) {
            System.out.println(minIndex);
        }
        else{
            System.out.println("not repetitive");
        }
        
    }
}