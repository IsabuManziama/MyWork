package work1sem2;

import java.util.Scanner;

public class javaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Double CSE1,CSE2,CSE3,CSE4,CSE5,SUM,AVG;
			String name;
			System.out.println("NAME: ");
			name=s.next();
		System.out.println("COMPUTER APPLICATION");
		CSE1=s.nextDouble();
		System.out.println("COMPUTER SYSTEM");
		CSE2=s.nextDouble();
		System.out.println("OOP2");
		CSE3=s.nextDouble();
		System.out.println("COMMUNICATION SKIILS");
		CSE4=s.nextDouble();
		System.out.println("WEB DESIGN");
		CSE5=s.nextDouble();
		SUM = CSE1+CSE2+CSE3+CSE4+CSE5;
		System.out.println("SUM = "+SUM);
		AVG = SUM/5;
		System.out.println("AVERAGE = "+AVG);
		
		if(AVG>=85){
			System.out.println("GRADE = A");
		}else{
			if(AVG>=75){
				System.out.println("GRADE = B");
			}else{
				if(AVG>=65){
					System.out.println("GRADE = C");
				}else{
					if(AVG>=50){
						System.out.println("GRADE = D");
					}else{
						if(AVG<=49){
							System.out.println("GRADE = F");
						}
					}
				}
			}
		}
	}

}
