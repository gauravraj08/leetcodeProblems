public class ConDup3 {
//    static boolean containsDuplicate(int[] arr,int val,int idx){
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;i<idx;i++){
//                int k=i-j;
//                if(arr[i]-arr[j]==val && Math.abs(k)<=idx) return true;
//            }
//        }
//        return false;
//    }
    static boolean containsDuplicate(int[] arr,int val,int idx){
        int i=0,j=arr.length-1;
        while(i<j){
            int k=i-j;
            if(arr[i]-arr[j]==val && Math.abs(k)<=idx){ return true;}
            else{
                i++;
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        boolean ans=containsDuplicate(arr,0,3);
        System.out.println(ans);
    }
}
