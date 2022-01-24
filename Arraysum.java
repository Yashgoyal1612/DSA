public class arraysum{
public static int arraysum(int index, int arr[] ){
        if(index == arr.length){
            return 0;
        }
        int count =0;
        count = arr[index] + arraysum(index+1,arr);
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {9,8,9};
        int val = arraysum(0,arr);
        System.out.println(val);
    }
}
