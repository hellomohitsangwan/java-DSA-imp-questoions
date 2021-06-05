import java.util.*;

public class tsum {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < nums.length - 2 ; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
            int start = i+1;
            int end = nums.length - 1;
            int sum = 0 - nums[i];  //nums[i] + start + end = 0
            
            while(start < end) {
                if(sum == nums[start] + nums[end]) {
                    ans.add(Arrays.asList(nums[i] , nums[start] , nums[end]));
                    while(start < end && nums[start] == nums[start+1]) {
                        start++;
                    }
                    while(start < end && nums[end] == nums[end-1]) {
                        end--;
                    }
                }
                else if(sum < nums[start] + nums[end]) {
                    end--;
                }
                else{
                    start++;
                }
            }
            }
        }
        return ans;
    }
}
