/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef
{

    public static void main (String[] args) {



        try {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int currentNumber = 1;
            int count = 1;
    
            while(count <= number) {
                currentNumber++;
                if(perfect(currentNumber)) {
                    System.out.println(currentNumber);
                    count++;
                }
            }            
        } catch (Exception e) {
            //TODO: handle exception
        }




    }
    
public static boolean perfect(int n) {
for(int i = 2; i <= n/2 ; i++) {
if(n % i == 0) {
    return false;
}
}
   return true; 
}


    }



