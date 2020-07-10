package test.sample.selenium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoopArrayDemo {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		// for, do, while, for each
		// if , switch
		Scanner sc = new Scanner(new File("data.txt"));
		/*int number = sc.nextInt();
		System.out.println(number);
		//continue the program to print addition of last digit and First digit of given number.
		System.out.println("The sum of first and last digit is " + addLastAndFirstDigit(number));
		*/
		while(sc.hasNext()) {
		String number = sc.next();
		//System.out.println(number);
		
		//printAscii();
	System.out.println(addLastAndFirstDigits(number));	
		}
	}
	public static void printAscii() {
		for(int i=32;i<=123;i++) {
			System.out.print(i+"->"+((char)i)+", ");
		}
	}
	//0->48, 1 -> 49, 2 -> 50, 9 -> 57, A -> 65, a -> 97
	// "753824"
	public static int addLastAndFirstDigit(String number) {
		char arr[]=number.toCharArray();
		
		int lastdigit=arr[arr.length-1]-48;
		int firstDigit=arr[0]-48;
		
		return firstDigit+lastdigit;
	}
	public static int addLastAndFirstDigits(String number) {
		return number.charAt(0) + number.charAt(number.length()-1) - 96;
	}
	
	public static int addLastAndFirstDigit(int number) {
		int lastDigit = number %10;
		while(number>10) {
			number /= 10;
		}
		int firstDigit = number;
		//System.out.println(firstDigit+lastDigit);
		return (firstDigit+lastDigit);
	}

}
