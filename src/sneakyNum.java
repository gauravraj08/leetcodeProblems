import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sneakyNum {
    public static int[] getSneakyNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        int[] ans=new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])) list.add(nums[i]);
            else ans[j++]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={0,1,1,0};
        int[] ans=getSneakyNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }
}
