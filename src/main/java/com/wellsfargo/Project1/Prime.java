package com.wellsfargo.Project1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int num =0;
		System.out.println("Enter Number:   ");	
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		PrimeMethod object = new PrimeMethod();
		object.method(num);
	}

}


class PrimeMethod{
	public void method(int num){
		if ((num%2==0) || (num%3==0))
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}
}