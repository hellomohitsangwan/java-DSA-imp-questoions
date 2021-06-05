import java.util.*;
public class debug {
    public static void main(String[] args) {
		Stack <Character> stack = new Stack<Character>();
		
		Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
				for(int i = 0 ; i < s.length() ; i++) {
				if(stack.isEmpty() || stack.peek() != s.charAt(i)) {
					stack.push(s.charAt(i));
				}
				
				else if(stack.peek() == s.charAt(i)) {

						stack.pop();
						while(i != s.length() - 1 && s.charAt(i) == s.charAt(i+1)) {
						   i++;
						   if(i >= s.length()) {
							   break;
						   }
					   }  
				}	
			}
			if(stack.isEmpty()) {
				System.out.println("balanced" + stack);
			}else{
				System.out.println("not balanced" + stack);
			}


		// while(true) {
		// 	if(i == s.length() && stack.isEmpty() == false) {
		// 		System.out.println("not balanced" + stack);
		// 		return;
		// 	}
		// 	if(stack.isEmpty() || stack.peek() != s.charAt(i)) {
		// 		stack.push(s.charAt(i));
		// 		i++;
		// 	}
		// 	if(i<s.length() && stack.peek() == s.charAt(i)) {
		// 		stack.pop();
		// 		j = i;
		// 		while(s.charAt(i) == s.charAt(j)) {
		// 			j++;
		// 			if(j == s.length()){
		// 				if(stack.isEmpty()){
		// 					System.out.println("balanced" + stack);
		// 					return;
		// 				} else{
		// 					System.out.println("not balanced" + stack);
		// 					return;
		// 				}
		// 			}
		// 		}
		// 		i = j;
		// 	}
		// 	if(i == s.length() && stack.isEmpty()) {
		// 		System.out.println("balanced" + stack);
		// 		return;
		// 	}
		// }
		
	}
}    