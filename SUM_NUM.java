import java.util.Scanner;

public class SUM_NUM {
    
    public static void SumOfnum(int a, int b){
        int d = a+b;
        System.out.println("sum of number :" + d);


    }
    public static void main(String args[]){
        Scanner SC  = new Scanner(System.in);
        System.out.print("Enter the first NUmber :" );
        int a = SC.nextInt();
        System.out.print("Enter the second Number : " );
        int b = SC.nextInt();
        SumOfnum(a, b);




    }
}
