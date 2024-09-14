public class countSort {
    static int maxElement(int[] arr){
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m) m=arr[i];
        }
        return m;
    }
    static void cSort(int[] arr){
        int max=maxElement(arr);
        int[] count=new int[max+1];
        //frequency arr
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //count prefix array
        for(int i=1;i<count.length;i++){
            count[i]=count[i-1]+count[i];
        }
        //result arr
        int[] result=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            result[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,2,4,0,1,4,1,0,2};
        cSort(arr);
    }
}
