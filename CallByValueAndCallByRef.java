package JavaPrograms;

public class CallByValueAndCallByRef {
	
	int a;
	int b;  // Global Variables
	
	public static void main(String[] args) {
		
		int no1 = 20;
		int no2 = 10;
		
		CallByValueSwap(no1,no2);
		
		CallByValueAndCallByRef cbvr = new CallByValueAndCallByRef();
		
		cbvr.a = 10;
		cbvr.b = 30;
		
		
		CallByRefSwap(cbvr);
		
		System.out.println("After Swapping By Reference : "+cbvr.a+" "+cbvr.b);

	}
	
	public static void CallByValueSwap(int no1, int no2)
	{
		//no1=20;
		//no2=30;            In call by value just values are copied from parent to child method
		
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		
		System.out.println("After Swapping By Value : "+no1+" "+no2);
	}
	
	public static void CallByRefSwap(CallByValueAndCallByRef cbvr)
	{
		cbvr.a = cbvr.a+cbvr.b;
		cbvr.b = cbvr.a-cbvr.b;
		cbvr.a = cbvr.a-cbvr.b;
	}
	

}
