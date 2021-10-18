import java.math.BigDecimal;
import java.util.Scanner;
import java.security.SecureRandom;
public class Multiplicatioin {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int i = sc.nextInt();
         double result;
         if(i==1){
             result=Integer_Multiplication();
         }else{
             result=Float_Multiplication();
         }
         double answer = sc.nextDouble();
         if(answer==result){
             System.out.println("yes");
         }else{
             System.out.println("no");
         }
     }
     public static int Integer_Multiplication(){
         SecureRandom sr = new SecureRandom();
         int a = sr.nextInt(100);
         int b = sr.nextInt(100);
         System.out.println(a+"*"+b+"=?");
         return a*b;
     }
     public static double Float_Multiplication(){
         SecureRandom sr = new SecureRandom();
         double a =sr.nextDouble() + sr.nextInt(99);
         double b =sr.nextDouble() + sr.nextInt(99);
         BigDecimal bg = new BigDecimal(a);
         a= bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
         bg = new BigDecimal(b);
         b= bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
         System.out.println(a+"*"+b+"=?");
         return a*b;
     }

}
