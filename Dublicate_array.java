import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Dublictae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//        int ans[] = new int[n];
//        ans[0] = arr[0];
        Arrays.sort(arr);
        int last =arr[0];
        System.out.print(last);
        for(int i=1;i<n;i++){
        if(arr[i] == last){
            continue;
        }
        else{
            System.out.print(arr[i]);
            last = arr[i];
        }
        }
    }
}
