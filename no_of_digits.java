public class no_of_digits {
   public static int digits(int a){
       if(a == 0){
           return 0;
       }
       int val = digits(a/10);
       return val+1;
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       digits(156);
       System.out.println(digits(n));
   }
}
