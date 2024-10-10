import java.util.Stack;

public class sumOfSubarrRanges {
    public static long subArrayRanges(int[] nums) {
        long sum=0;
        int n=nums.length;

        int[] pse=new int[n];
        int[] nse=new int[n];

        Stack<Integer> st=new Stack<>();

        //pse
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            pse[i]=st.isEmpty() ? -1:st.peek();
            st.push(i);
        }

        st.clear();

        //nse
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        st.clear();

        long sumMin=0;
        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            sumMin+=left*right*nums[i];
        }

        int[] pge=new int[n];
        int[] nge=new int[n];

        st.clear();

        //pse
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                st.pop();
            }
            pge[i]=st.isEmpty() ? -1:st.peek();
            st.push(i);
        }

        st.clear();

        //nse
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            nge[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        st.clear();

        long sumMax=0;
        for(int i=0;i<n;i++){
            long left=i-pge[i];
            long right=nge[i]-i;
            sumMax+=left*right*nums[i];
        }

        return sumMax-sumMin;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(subArrayRanges(arr));
    }
}
