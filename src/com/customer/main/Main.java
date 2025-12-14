package com.customer.main;

import java.util.Scanner;

import com.customer.service.CustomerService;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CustomerService customerservice=new CustomerService();
		boolean isContinue=true;
		System.out.println("Enter \n 1.create new account \n 2.login account  \n 3.exit ");
		while(isContinue)
		{
	
			switch(sc.nextInt())
			{
			case 1: 
			System.out.println("create a new account");
			customerservice.CustomerRegistration();
			break;
		    case 2:
			System.out.println("login account");
			customerservice.CustomerLoginVerification();
			break;
		    case 3:
			System.out.println("exit:");
			isContinue=false;
			break;
			}
		}
		System.out.println("do you want continue yes or no");
		String res=sc.next();
		if(res.equalsIgnoreCase("no"))
		{
			isContinue=false;
		}
	
		
	}

}
