
import java.util.*;


public class slidingWimdow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int[n];


        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
slidingWindow(a, k);
    }

    static void slidingWindow(int a[] , int k) {
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[a.length];

        st.push(nge.length - 1);
        nge[nge.length - 1] = nge.length;
        for(int i = nge.length - 2; i >= 0 ; i--) {

            while(st.size() > 0 && a[st.peek()] <= a[i]) {
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = nge.length;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(i);
        }

        for(int i = 0 ; i < a.length - k ; i++){
            int j = i;
            while(nge[j] <= i+k) {
                j = nge[j];
            }
            System.out.println(a[j]);
        }

    }

}
