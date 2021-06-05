
// ques = find the next larger element in the array,ass 01 if no larger element found, eg:-
// input  = [3,2,2,4,5,6,4,5]
// output  = [4,4,4,5,6,-1,5,-1]

import java.util.*;
public class nextLargerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int na[] = new int[a.length];

        stack.push(a[a.length - 1]);
        na[a.length -1] = -1;
        for(int i = a.length - 2 ; i >= 0 ; i--){
            while(stack.size() > 0 && a[i] >= stack.peek()) {
                stack.pop();
            }
            if(stack.size() == 0){
                na[i] = -1;
            }
            else{
                na[i] = stack.peek();
            }
            stack.push(a[i]);
        }
        for(int i = 0 ; i < na.length ; i++){
            System.out.println(na[i] + " ");
        }

    }
    // static int[] transformArray(int a[]){
        

    //     return na;
    // }
}
