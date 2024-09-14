import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static boolean monotic(int[] arr) {
        int n = arr.length;
        boolean b=true;
        boolean c=true;
        for (int i = 1; i <n; i++) {
           if(arr[i]>arr[i-1]){
               b=false;
           }
           else if(arr[i]<arr[i-1]){
               c=false;
           }
        }

        return b || c;
    }

    public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);

            int[] arr={1,2,3,4};

            System.out.print(monotic(arr));
        }
    }
