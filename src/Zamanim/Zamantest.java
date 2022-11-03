package Zamanim;

import java.util.Scanner;

public class Zamantest {

	public static void main(String[] args) {
		int hour;
		int minute;
		int second;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Saati giriniz");
		hour=input.nextInt();
		System.out.println("Dakikayı giriniz");
		minute=input.nextInt();
		System.out.println("Saniyeyi giriniz");
		second=input.nextInt();
		
		Time1 z=new Time1(hour,minute,second);
		Time1 z1=new Time1(hour,minute,second);
		System.out.println(z.display());
		z.setHour(11);
		System.out.println(z.display());
		z.setsaat(25,33,45);
		System.out.println(z.display());
		Time1.say();
		Time1 z2=new Time1(hour,second);
		Time1 z3=new Time1(hour);
		System.out.println(z1.display());
		System.out.println(z2.display());
		System.out.println(z3.display());
	}

}
