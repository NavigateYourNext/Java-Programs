package JavaPrograms;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Main Method ... ");
		/*main();
		main("Akshay");*/
	}
	
	public static void main(int no)
	{
		System.out.println("Main Integer Method");
	}
	
	public static void main()
	{
		System.out.println("Main No Parameter Method");
		main(5);
	}
	
	public static void main(String str)
	{
		
		System.out.println("Main String Method");
	}

}
