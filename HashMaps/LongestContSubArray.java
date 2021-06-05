import java.util.*;

public class LongestContSubArray {
public static void main(String [] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for (int i = 0; i < arr.length; i++)  {
arr[i] = sc.nextInt();
    }

System.out.println(solution(arr));

}
public static int solution(int [] arr) {
int answer = 0;
for(int i = 0; i<arr.length - 1 ; i++) {

int min = arr[i];
int max = arr[i];
Set<Integer> cd = new HashSet<>(); 
cd.add(arr[i]);
    for(int j = i+1; j < arr.length ; j++) {

            
        if(cd.contains(arr[j])){
            break;
        } 
        cd.add(arr[j]);
        max = Math.max(max, arr[j]);
        min = Math.min(min, arr[j]);

        if(j-1 == max-min) {
            int length = j-i+1;
            if(length > answer) {
                answer = length;
            }
        }
    }

}
return answer;

}
}