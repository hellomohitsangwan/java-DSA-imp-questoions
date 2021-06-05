import java.util.*;
public class SlidingwindowMaximum {
public static void main(String[] args) {
    solution sol = new solution();
    int a[] = {4,3,1,2,5,3,4,7,1,9};
    int answers[] = sol.slm(a, 4);
    for(int answer : answers) {
        System.out.println(answer);
    }
}
static class solution {
    public int[] slm(int a[] , int k) {
        Deque <Integer> dq = new LinkedList<>();
        int n = a.length;
        int ans[] = new int[n-k+1];
    int i =0;
        for(i =0 ; i < k ; i++) {
    
            while(!dq.isEmpty() && a[i] >= a[dq.peekLast()]) {
                dq.removeLast();
            } 
            dq.addLast(i);


        }
    


        for(i = k ; i < n; i++) {
            ans[i-k] = a[dq.peekFirst()];
    
            while(!dq.isEmpty() && dq.peekFirst() <= i-k  ) {
                            dq.removeFirst();
            }
            while(!dq.isEmpty() && a[i] >= a[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
    
    
        }
    
        ans[i-k] = a[dq.peekFirst()];

        return ans;
    }
}

}

