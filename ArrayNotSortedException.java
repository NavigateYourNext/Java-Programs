package JavaPrograms;

//Custom Exception
public class ArrayNotSortedException extends Exception
{
	public String toString()
	{
		return "Array Not Sorted Properly. Hence, cann't perform Binary Search. Please sort the array";
	}
}
