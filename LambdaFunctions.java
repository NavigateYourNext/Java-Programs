package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Customer
{
	private String name;
	private int age;

	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}

public class LambdaFunctions {

	public static void main(String[] args) {

		//Function Interface Lambda Function
		Function<String,Integer> func = x -> x.length(); //x (input/argument) whatever after -> is output
		System.out.println(func.apply("Java"));
		System.out.println("-----------");

		//Chaining of Lamba Functions
		Function<Integer,Integer> func2 = x -> x*2;
		System.out.println(func.andThen(func2).apply("Java")); //apply method will pass input to "func" first and then func2 will execute
		System.out.println("-----------");

		//Unary Lambda Function
		UnaryOperator<Integer> func3 = x -> x*10;
		System.out.println(func3.apply(20));
		System.out.println("-----------");

		//Binary Lambda Function
		BinaryOperator<Integer> func4 = (x1,x2) -> x1+x2;
		System.out.println(func4.apply(2, 3));
		System.out.println("-----------");

		//BiFunction interface
		BiFunction<Integer,Integer,Integer> func5 = (x1,x2) -> x1+x2;
		System.out.println(func5.apply(2, 3));
		System.out.println("-----------");

		//Predicate in Lambda - 1
		Predicate<Integer> func6 = x -> x>5;
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> list1 = list.stream().filter(func6).collect(Collectors.toList());
		list1.forEach(System.out::println);
		System.out.println("-----------");

		//Predicate in Lambda - 2  
		Predicate<Integer> func7 = x -> x>5 && x<10;
		List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> list4 = list3.stream().filter(func7).collect(Collectors.toList());
		list4.forEach(System.out::println);
		System.out.println("-----------");

		//negate() used in filter to negalate the given condition

		//Consumer in Lambda
		Consumer<String> func8 = x -> System.out.println(x);
		func8.accept("Lamba Expressions");
		System.out.println("-----------");

		//Stream Examples - 1
		List<String> prodList = Arrays.asList("iPhone","Shoes","Dio","Bat");
		List<String> newProdList = prodList.stream().filter(x -> !x.equals("Bat")).collect(Collectors.toList());
		newProdList.forEach(x -> System.out.println(x));
		System.out.println("-----------");

		//Stream Examples - 2 
		List<Customer> theCustomers = Arrays.asList(new Customer("Akshay",24),new Customer("Shete",30));
		Customer theCustomers1 = theCustomers.stream().filter(x -> x.getName().equals("Akshay")).findAny().orElse(null); //findAny() used to find the required condition
		System.out.println(theCustomers1.getName()+" "+theCustomers1.getAge());

		//Stream Examples - 3 
		List<Customer> theCustomers2 = Arrays.asList(new Customer("Akshay",24),new Customer("Shete",30));
		String theCustomers3 = theCustomers2.stream().filter(x -> x.getName().equals("Akshay")).map(Customer::getName).findAny().orElse(null); //map() used to mapped it to required method
		System.out.println(theCustomers3);
		System.out.println("-----------");

		//iterate(seed,UnaryOperator) -> seed means from where to start
		List<Integer> lst1 = IntStream.iterate(0,x -> x+2).mapToObj(Integer::valueOf).limit(10).collect(Collectors.toList());
		lst1.forEach(System.out::println);
		System.out.println("-----------");

		//generate() used to generate Random Numbers
		List<Integer> lst2 = Stream.generate(() -> (new Random()).nextInt(100)).limit(10).collect(Collectors.toList());
		lst2.forEach(x -> System.out.println(x));
		System.out.println("-----------");

		//FlatMap() -> We cannt used stream() directly on Stream<String[]>,Set<String[]>,List<String[]> so we have to used flatmap to covert String[] to String
		String[][] data = new String[][] {
			{"a","b"},
			{"c","d"}
		};
		
		Stream<String[]> dataStream = Arrays.stream(data);
		Stream<String> streamFlatMap = dataStream.flatMap(x -> Arrays.stream(x));
		Stream<String> dataFilter = streamFlatMap.filter(x -> x.toString().equals("a"));
		dataFilter.forEach(System.out::println);
		System.out.println("-----------");
		
		int[] dataa = {1,2,3,4,5,6,7,8,9,10};
		Stream<int[]> streamArray = Stream.of(dataa);
		IntStream inst = streamArray.flatMapToInt(x -> Arrays.stream(x)).filter(x -> x>5);
		inst.forEach(System.out::println);
		System.out.println("-----------");
		
		//IntStream - Range
		IntStream.range(1, 5).forEach(System.out::println); // Range(from,to-1)
		System.out.println("-----------");
		
		//Get Total Core In System
		ForkJoinPool pool = ForkJoinPool.commonPool();
		System.out.println("Total Cores Are: "+pool.getParallelism());
		System.out.println("-----------");
		
		
		
	}

}
