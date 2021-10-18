package lab;

import java.security.SecureRandom;
import java.util.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Addition {
	public static int Integer_Addition() {
		SecureRandom sr = new SecureRandom();
		int a = sr.nextInt(100);//生成整数a,范围1-100
		int b = sr.nextInt(100);//生成整数b,范围1-100
		System.out.println(a + "+" + b + "=?");
		return a+b;
	}
	public static double Float_Addition() {		
		SecureRandom sr = new SecureRandom();
		double a =sr.nextDouble() + sr.nextInt(99);
        double b =sr.nextDouble() + sr.nextInt(99);
        BigDecimal bg = new BigDecimal(a);
        a= bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        bg = new BigDecimal(b);
        b= bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(a+"+"+b+"=?");
		return a+b;
	}

}