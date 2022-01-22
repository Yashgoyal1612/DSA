public class Recursion {
    public static void printNum(int a){
        if(a == 0){
            return;
        }
        System.out.println(a);
        printNum(a-1);
    }

    public static void main(String[] args) {
        int a = 5;
        printNum(a);
    }
}
