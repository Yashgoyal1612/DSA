package Recursion;

import java.util.Scanner;
public class natural_num {
    public static void printsum(int i, int n, int sum){
        if(i == n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(i+1,n,sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
      printsum(1,5,0);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum =0;
//        int n = sc.nextInt();
//        for (int i=0;i<=n;i++){
//             sum = sum+i;
//        }
//        System.out.println(sum);
    }
