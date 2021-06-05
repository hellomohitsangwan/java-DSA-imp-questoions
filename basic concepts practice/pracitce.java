import java.util.*;

public class pracitce {
    public static void main(String[] args) {
        int a[] = {2,3,2,4,3,4};
print(a, a.length - 1);
    }

    static void print(int a[] , int i){
        if(i < 0) {
            return;
        }
        System.out.print(a[i]);
        print(a, i-1);
    }

}
