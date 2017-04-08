package com.wellsfargo.Project1;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the Number: \n");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		EvenMethod object = new EvenMethod();
		object.method(num);
	}
}
	class EvenMethod{
		public void method(int num){
			if(num%2==0)
				System.out.println("Number is Even");
			else
				System.out.println("Number is Odd");

		}
	}
