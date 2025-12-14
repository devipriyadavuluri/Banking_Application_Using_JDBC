package com.customer.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.customer.DAO.CustomerDAO;
import com.customer.exception.ExceptionValidation;
import com.cutomer.DTO.CustomerDetails;

public class CustomerService {

	Scanner sc = new Scanner(System.in);
	CustomerDetails customerdetails = new CustomerDetails();
	CustomerDAO customerdao = new CustomerDAO();

	public void CustomerRegistration() {
		System.out.println("enter customer name:");
		String customerName = sc.next();
		System.out.println("enter CustomerMobile Number");
		long MobileNum = sc.nextLong();
		if (!(MobileNum >= 6000000000l & MobileNum <= 9999999999l)) {
			throw new ExceptionValidation("invalid mobile number");
		}
		System.out.println("enetr customer gender:");
		String CustomerGender = sc.next();
		System.out.println("enter the customer age:");
		int age = sc.nextInt();
		if ((age < 18)) {
			throw new ExceptionValidation("not eligibility for registration");
		}
		System.out.println("enter IFCS code");
		String ifcscode = sc.next();
		if (!(ifcscode.length() == 6 && ifcscode.contains("INB"))) {
			throw new ExceptionValidation("invalid ifcs code");
		}
		System.out.println("enter customer adrdress:");
		String address = sc.next();
		customerdetails.setCustomerName(customerName);
		customerdetails.setCustomerMobileNum(MobileNum);
		customerdetails.setCustomerGender(CustomerGender);
		customerdetails.setCustomerAge(age);
		customerdetails.setCustomerIFCSCode(ifcscode);
		customerdetails.setCustomerAddres(address);
		if (customerdao.insertCustomerDetails(customerdetails)) {
			System.out.println("insert sucessfully....");
		} else {
			System.out.println("server 500");
		}
	}
	public void CustomerLoginVerification()
	{
		System.out.println("enter Mobile number");
		long MobileNum=sc.nextLong();
		System.out.println("enter IFCS code");
		String ifcsCode=sc.next();
		ArrayList<CustomerDetails> list=customerdao.CustomerLogin(MobileNum, ifcsCode);
		System.out.println("enter \n 1.Deposit \n 2.withdraw \n 3.Balance inquiry \n 4.Transfer \n 5.Mini statement \n 6.logout");
		switch(sc.nextInt())
		{
		case 1:System.out.println("enter deposit amount:");
		System.out.println("enter amount");
		int amount=sc.nextInt();
	    break;
		case 2:System.out.println("enter withdraw amount:");
			break;
		case 3:System.out.println("show current balance:");
		System.out.println("enter account id:");
		int id=sc.nextInt();
		customerdao.getTheCurrentBalance( id, MobileNum);
		break;
		case 4:System.out.println("sucessfully transfer amount");
			break;
		case 5:System.out.println("exit....");
			break;
			
		}
	}

}
