package JavaPrograms;

public class MainBankInterface {

	public static void main(String[] args) {
		
		//Static Polymorphism -> Compile Time Polymorphism
		StateBankOfIndia sbi = new StateBankOfIndia();
		sbi.depositCharges();
		sbi.withdrawlCharges();
		sbi.chequeCharges();
		sbi.miniStatementCharges(); //it can call default method of an interface
		
		//sbi.atmCharges() not possible to call as it is static method of an interface
		
		
		//Dynamic Polymorphism -> Run Time Polymorphism
		USBank ub = new StateBankOfIndia();
		ub.depositCharges();
		ub.withdrawlCharges();
		ub.miniStatementCharges(); //it can call default method of an interface
		
		//ub.chequeCharges() not possible to call child methods by parent class reference
		//ub.atmCharges() not possible to call static method of an interface by parent refernce
		
		//To call static method of interface we have only 1 way as defined below: -
		USBank.atmCharges();
		

	}

}
