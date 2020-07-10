package test.sample.selenium1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		File f =new File("abc.txt");
		System.out.println(f.getAbsoluteFile());
		Scanner s = new Scanner(System.in);
		try {
			Scanner sc =new Scanner(f);
			System.out.println(sc.nextLine());
		}catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("File read process completed");
	}

}
