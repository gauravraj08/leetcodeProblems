public class lsort {
    static void sort(int[] arr,int n){
        int i=0,j=n;
        while(i<=j){
            while(i<n-1){
                if(arr[i]<arr[i+1]){ i++;}
                else{ break;}
            }
            while(j>0){
                if(arr[j]>arr[j-1]) j--;
                else break;;
            }
            if(i<j) swap(arr,i,j);
        }
    }
    static void swap(int[] arr,int st,int p){
        int temp=arr[st];
        arr[st]=arr[p];
        arr[p]=temp;
    }
    public static void main(String[] args) {
        int[] arr={10,5,6,7,8,9,3};
        sort(arr,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
