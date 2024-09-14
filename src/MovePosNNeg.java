
public class MovePosNNeg
{
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //0 5 6 0 8
    // 5 6 8 0 0
    static void partition(int[] arr){
        int r=arr.length-1,l=0;

        while (l<r){
            while(arr[l]<0) l++;
            while(arr[r]>=0) r--;
            if(l<r) swap(arr,l,r);
        }
    }

    public static void main(String[] args) {
        int[] arr={19,-20,7,-4,-13,11,-5,3};
        partition(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
