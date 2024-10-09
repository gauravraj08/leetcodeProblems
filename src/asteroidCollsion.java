import java.util.Arrays;
import java.util.Stack;

public class asteroidCollsion {
    public static int[] asteroidCollision(int[] a) {
        int n=a.length;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            if(a[i]>0) st.push(a[i]);
            else{
                while (!st.empty() && st.peek()>0 && st.peek()<Math.abs(a[i])){
                    st.pop();
                }
                if(!st.empty() && st.peek()==Math.abs(a[i])) st.pop();
                else if(st.empty() || st.peek()<0) st.push(a[i]);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--) ans[i]=st.pop();

        return ans;
    }

    public static void main(String[] args) {
        int[] arr={4,7,1,1,2,-3,-7,17,15,-16,-18,-19};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }
}
