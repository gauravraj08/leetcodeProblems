import java.util.*;
class SubArray
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int sum=0;
        ArrayList<Integer> ans=new ArrayList<>();
        // Your code here
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+arr[j];
                if(sum==s) {
                    ans.add(i+1);
                    ans.add(j+1);
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,7,5};
        int n=5,k=12;
        ArrayList<Integer> ans=subarraySum(arr,n,k);
        System.out.println(ans);
    }
}