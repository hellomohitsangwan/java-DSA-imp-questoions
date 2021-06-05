import java.util.*;

public class recPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(sum(s , 2));

    }

    static int sum(String s , int k){
        if(s.length() > 1) {
            int summ = 0;
            for(int i = 0 ; i < s.length() ; i++) {
                summ += Character.getNumericValue(s.charAt(i));
            }
            return sum(Long.toString(summ * k) , 1);
        }else {
            return Character.getNumericValue(s.charAt(0));
        }
    }

}
