package lab;
import lab.Addition;
import lab.Division;
import lab.Multiplication;
import lab.Subtract;
import java.util.Scanner;
import java.security.SecureRandom;
public class MainClass {
	public static void main(String args[]) {
		//Create four classes
		Addition add = new Addition();
		Division divide = new Division();
		Multiplication multiple = new Multiplication();
		Subtract subtract = new Subtract();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your grade?");
		int grade = sc.nextInt();
		System.out.println("Please enter the number of questions?");
		int ques_number = sc.nextInt();
		double score = 0; 
		double score_part = 100.0 / ques_number;
		int integer_input = 0;
		double double_input = 0.0;
		int integer_res = 0;
		double double_res = 0.0;
		if(grade == 1 || grade == 2) {
			for(int i = 0;i < ques_number;i++) {
				SecureRandom sr = new SecureRandom();
				//1-100整数生成
				int random = sr.nextInt(2);
				switch(random) {
					case 0:
						integer_res = add.Integer_Addition();
						integer_input = sc.nextInt();
						if(integer_res == integer_input) {
							score += score_part;
						}
						break;
					case 1:
						integer_res = subtract.Integer_Subtract();
						integer_input = sc.nextInt();
						if(integer_res == integer_input) {
							score += score_part;
						}
						break;
				}
			}
		}
		else if(grade == 3 || grade == 4) {
			for(int i = 0;i < ques_number;i++) {
				SecureRandom sr = new SecureRandom();
				//1-100整数生成
				int random = sr.nextInt(4);
				switch(random) {
					case 0:
						integer_res = add.Integer_Addition();
						integer_input = sc.nextInt();
						if(integer_res == integer_input) {
							score += score_part;
						}
						//调用加法
						break;
					case 1:
						integer_res = subtract.Integer_Subtract();
						integer_input = sc.nextInt();
						if(integer_res == integer_input) {
							score += score_part;
						}
						//调用减法
						break;
					case 2:
						integer_res = multiple.Integer_Multiplication();
						integer_input = sc.nextInt();
						if(integer_res == integer_input) {
							score += score_part;
						}
						//调用乘法
						break;
					case 3:
						double_res = divide.Integer_Division();
						double_input = sc.nextDouble();
						if(double_res == double_input) {
							score += score_part;
						}
						//调用除法
						break;
				}
			}
		}
		else if(grade == 5 || grade == 6) {
			for(int i = 0;i < ques_number;i++) {
				SecureRandom sr = new SecureRandom();
				//1-100整数生成
				int random = sr.nextInt(4);
				switch(random) {
				case 0:
					double_res = add.Float_Addition();
					double_input = sc.nextDouble();
					if(integer_res == integer_input) {
						score += score_part;
					}
					//调用加法
					break;
				case 1:
					double_res = subtract.Float_Subtract();
					double_input = sc.nextDouble();
					if(integer_res == integer_input) {
						score += score_part;
					}
					//调用减法
					break;
				case 2:
					double_res = multiple.Float_Multiplication();
					double_input = sc.nextDouble();
					if(integer_res == integer_input) {
						score += score_part;
					}
					//调用乘法
					break;
				case 3:
					double_res = divide.Float_Division();
					double_input = sc.nextDouble();
					if(double_res == double_input) {
						score += score_part;
					}
					//调用除法
					break;
				}
			}
		}
		else {
			System.out.println("please input valid grade!");
		}
		int output = (int) score;
		System.out.println(output);
	}
	}


