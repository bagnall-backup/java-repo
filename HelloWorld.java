import java.lang.*;
import java.util.Scanner;

public class HelloWorld{

	public static void main(String[] args){

		Scanner inputVal = new Scanner(System.in);
		System.out.println("Enter number");

		Integer outputNumber = inputVal.nextInt();
		Double outputDouble = Double.valueOf(outputNumber);
		outputDouble = Math.pow(outputDouble, 2);
		System.out.println(outputDouble);
	}
}
