public class sortinLinearTime {
    static void sort(int[] arr,int n){
        int x=-1,y=-1;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                if(x==-1){
                    x=i+1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        swap(arr,x,y);
    }
    static void swap(int[] arr,int st,int p){
        int temp=arr[st];
        arr[st]=arr[p];
        arr[p]=temp;
    }
    public static void main(String[] args) {
        int[] arr={5,34,56,43};
        sort(arr,arr.length);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
