package JavaPrograms;

import java.util.Arrays;

public class Print1To100WithoutLoop {

	public static void main(String[] args) {
		
		Object number[] = new Object[100];
		Arrays.fill(number, new Object() {
			int count = 0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		
		System.out.print(Arrays.toString(number));
	}

}
