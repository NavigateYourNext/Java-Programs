package JavaPrograms;


public class LambdaConcept
{
	public static void main(String[] args)
	{
		/*//Annonumous Inner Class - 1
		LamdaInterface lambda = new LamdaInterface()
		{
			@Override
			public void title(String title)
			{
				System.out.println("Title Is: "+title);
			}
		};
		
		//Annonumous Inner Class - 2
		LamdaInterface lambda1 = new LamdaInterface()
		{
			@Override
			public void title(String title)
			{
				System.out.println("Now The Title Is: "+title);
			}
		};
		
		lambda.title("Mr.");
		lambda1.title("Ms.");*/
		
		
		LamdaInterface lambda1 = (title) -> {System.out.println("Title Is: "+title);};
		LamdaInterface lambda2 = (title) -> {System.out.println("Current Title Is: "+title);};
		LamdaInterface lambda3 = (title) -> {System.out.println("Now The Title Is: "+title);};
		
		lambda1.title("Mr.");
		lambda2.title("Mrs.");
		lambda3.title("Miss.");
	}
}