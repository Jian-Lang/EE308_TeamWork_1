import java.math.BigDecimal;
import java.util.Scanner;
import java.security.SecureRandom;
public class Multiplicatioin {
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
        System.out.println(a+"*"+b+"=?");
        return a*b;
    }
}
