public class dupInOn {
    public static void hasDuplicates(int[] arr) {
        int n= arr.length;
        for (int i = 0; i < arr.length; i++) {

            arr[arr[i]%n]=arr[arr[i]%n]+n;
        }
        boolean check = false;

        for(int i=0;i<n;i++){
            if(arr[i]>2*n){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {2,3,1,2,3};
        hasDuplicates(a);
    }
}