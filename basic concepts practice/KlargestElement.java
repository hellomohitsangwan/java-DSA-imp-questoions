
import java.util.*;


public class KlargestElement {
    public static void main(String [] args) {

         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         int k = sc.nextInt();

         while(t-- >= 0) {
             int n = sc.nextInt();
             int a[] = new int[n];
             for(int i = 0;i<a.length ; i++) {
                 a[i] = sc.nextInt();
             }

             PriorityQueue <Integer> pq = new PriorityQueue<>();

             for(int i = 0; i < a.length ; i++) {
                 if(i<k) {
                     pq.add(a[i]);
                 }
                 else{
                    if(a[i] > pq.peek()) {
                        pq.poll();
                        pq.add(a[i]);
                    }
                 }

             }

             ArrayList <Integer> al = new ArrayList<>(pq);
             Collections.sort(al , Collections.reverseOrder());

             for(int ans : al) {
                 System.out.println(ans);
             }

         }


    }
}