import java.util.*;

public class lcmHcf {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int min = Math.min(num1, num2);
        int max = Math.max(num1 , num2);

        //for hcf
        while(min > 0) {
            if(num1 % min == 0 && num2%min == 0) {
                System.out.println("hcf = " + min);
                break;
            }
            else{
                min -= 1;
            }
        }

        //for lcm
        while(true) {
            if(max % num1 == 0 && max % num2 == 0) {
                System.out.println("lcm = " + max);
                break;
            }
            else{
                max += 1;
            }
        }
    }
}


//lcm
