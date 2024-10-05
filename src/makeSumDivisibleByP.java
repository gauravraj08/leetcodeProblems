import java.util.HashMap;

public class makeSumDivisibleByP {
    public static int minSubarray(int[] nums, int p) {
        int n=nums.length;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i]%p;
        }
        int rem=sum%p;

        if(rem==0) return 0;

        HashMap<Integer,Integer> prefix=new HashMap<>();

        prefix.put(0,-1);
        int preSum=0;
        int len=n;
        for(int i=0;i<n;i++){
            preSum+=nums[i];
            int currMod=preSum%p;
            int targetMod=(currMod - rem + p) % p;

            if(prefix.containsKey(targetMod)){
                len=Math.min(len,i-prefix.get(targetMod));
            }

            prefix.put(currMod,i);
        }
        return len == n ? -1 : len;
    }

    public static void main(String[] args) {
        int[] arr={6,3,5,2};
        System.out.println(minSubarray(arr,9));
    }
}
