import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //01大小寫轉換
//        Scanner scn =new Scanner(System.in);
//        int ch =scn.next().charAt(0);
//        //A -->65 Z-->90 a-->97 z-->122
//        if (ch>=65 && ch<=90){//大寫
//            System.out.println((char)(ch+32));
//        }
//        if (ch>=97 && ch<=122){//大寫
//            System.out.println((char)(ch-32));
//        }
        //02奇偶數
//        Scanner scn =new Scanner(System.in);
//        int n=scn.nextInt();
//        if (n%2==0){
//            System.out.println("Even");
//        }
//        if (n%2==1){
//            System.out.println("Odd");
//        }
        //03
        Scanner scn =new Scanner(System.in);
        int dollar =scn.nextInt();
        int th =dollar/1000;
        dollar=dollar%1000;
        int h =dollar/100;
        dollar%=100;
        int ten = dollar/10;
        int d =dollar%10;
        if (th>0){
            System.out.print(th+"thousand");
        }
        if (h>0){
            System.out.print(h+"hundred");
        }
        if (ten>0){
            System.out.print(ten+"ten");
        }
        if (d>0){
            System.out.print(d+"dollar");
        }
        System.out.println();
        //04
//        Scanner scn =new Scanner(System.in);
//        int x=scn.nextInt();
//        if (x<-1){
//            System.out.println(3* (int)Math.pow(x,2));
////            System.out.println(3*x*x);
//        }else if (x>-1 && x<=1){
//            System.out.println((int)Math.pow(x,3)+3*x-3);
//        }else {
//            System.out.println(2*x+3);
//        }

    }
}
