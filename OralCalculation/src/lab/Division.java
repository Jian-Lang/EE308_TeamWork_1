package lab;
import java.security.SecureRandom;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Division {
	public static double Integer_Division() {
		SecureRandom sr = new SecureRandom();
		int random1,random2;
		random1 = sr.nextInt(100);//Integer1
		while(true) {
			random2 = sr.nextInt(100);//Integer2
			if(random2 != 0) {
				break;
			}
		}
		System.out.println(random1 + "/" + random2 + "=?" );
		double result;
		result = random1 * 1.0 / random2;
		BigDecimal bg = new BigDecimal(result);
		double result1 = bg.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		return result1;
	}
	
	public static double Float_Division() {
		SecureRandom sr = new SecureRandom();
		double random1,random2;
		random1 = sr.nextInt(99) + sr.nextDouble();//Float1
		BigDecimal bg_r1 = new BigDecimal(random1);
		double random1_new = bg_r1.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		while(true) {
			random2 = sr.nextInt(99) + sr.nextDouble();//Float2
			if(random2 != 0) {
				break;
			}
		}
		BigDecimal bg_r2 = new BigDecimal(random2);
		double random2_new = bg_r2.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println(random1_new + "/" + random2_new + "=?" );
		double result;
		result = random1_new * 1.0 / random2_new;
		BigDecimal bg = new BigDecimal(result);
		double result1 = bg.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		return result1;
	}
}
