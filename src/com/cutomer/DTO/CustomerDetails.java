package com.cutomer.DTO;

public class CustomerDetails {
	private int customerId;
	private String customerName;
	private long customerMobileNum;
	private String customerGender;
	private int customerAge;
	private String customerIFCSCode;
	private String customerAddres;
	private int customerBalance;
	public CustomerDetails()
	{
		
	}
	public CustomerDetails(int customerId, String customerName, long customerMobileNum, String customerGender,
			int customerAge, String customerIFCSCode, String customerAddres, int customerBalance) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobileNum = customerMobileNum;
		this.customerGender = customerGender;
		this.customerAge = customerAge;
		this.customerIFCSCode = customerIFCSCode;
		this.customerAddres = customerAddres;
		this.customerBalance=customerBalance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerMobileNum() {
		return customerMobileNum;
	}
	public void setCustomerMobileNum(long customerMobileNum) {
		this.customerMobileNum = customerMobileNum;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	public String getCustomerIFCSCode() {
		return customerIFCSCode;
	}
	public void setCustomerIFCSCode(String customerIFCSCode) {
		this.customerIFCSCode = customerIFCSCode;
	}
	public String getCustomerAddres() {
		return customerAddres;
	}
	public void setCustomerAddres(String customerAddres) {
		this.customerAddres = customerAddres;
	}
	public void setCustomerBalance(int customerBalance)
	{
		this.customerBalance=customerBalance;
	}
	public int getCustomerBalance()
	{
		return customerBalance;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", customerMobileNum="
				+ customerMobileNum + ", customerGender=" + customerGender + ", customerAge=" + customerAge
				+ ", customerIFCSCode=" + customerIFCSCode + ", customerAddres=" + customerAddres + "]";
	}
	

}
