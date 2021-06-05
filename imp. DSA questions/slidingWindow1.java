// you are given an array find the sum of of its all the subarray whose sike is k , eg:=
// [2 , 2 , 4, 2 , 4 ,2 ,4 , 2, 4] , k = 4
// 10 , 12 , 12 , 12 , 12, 14


import java.util.*;

public class slidingWindow1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int[n];
        for(int i = 0; i < n ; i++) {
            a[i]  = sc.nextInt();
        }

        int start = 0;
        int end = 0;
        int sum = 0;

        while(end < a.length) {
            sum += a[end];
            
            if((end - start + 1) < k){
                end++;
            }
            else if(end - start + 1 == k){
                System.out.println(sum);
                end++;
                sum -= a[start];
                start++;
            }
        }

    }

}
