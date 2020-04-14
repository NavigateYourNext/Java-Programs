package JavaPrograms;

public class StateBankOfIndia implements USBank
{

	@Override
	public void depositCharges() {
		
		System.out.println("Deposit Charges Should be $10");
		
	}

	@Override
	public void withdrawlCharges() {
		
		System.out.println("Withdrawl Charges Should be $12");
		
	}
	
	public void chequeCharges()
	{
		System.out.println("Cheque Charges Should be $3");
	}
	
}
