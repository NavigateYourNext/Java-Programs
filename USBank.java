package JavaPrograms;

public interface USBank
{
	//Any bank implementing this interface must defined below method as per there own.
	void depositCharges();
	void withdrawlCharges();
	
	//Static implements these methods are fixed no one can change the defination of these methods.
	static void atmCharges()
	{
		System.out.println("ATM Charges Should be $20");
	}
	
	//Default implements these methods can be access by the Class which implements this interface.
	default void miniStatementCharges()
	{
		System.out.println("Mini Statement Charges Should be $5");
	}
}
