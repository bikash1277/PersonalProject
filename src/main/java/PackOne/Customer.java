package PackOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) throws Exception {

		Scanner scan =
                new Scanner(System.in);
		System.out.println("Enter your Name :");
		String s=scan.nextLine();
		System.out.println("Enter your Age :");
		int a=scan.nextInt();
		//scan.close();
		System.out.println("Enter your Gender :");
		String g=scan.nextLine();
		System.out.println("Enter your Haling From :");
		String h=scan.nextLine();
		scan.close();
	
		System.out.println("Welcome, "+s+"!");
		System.out.println("Age: "+a);
		System.out.println("Gender: "+g);
		System.out.println("Hailing from: "+h);
		
		
		/*BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name :");
		String s=reader.readLine();
		System.out.println("Enter your Age :");
		String a=reader.readLine();
		System.out.println("Enter your Gender :");
		String g=reader.readLine();
		System.out.println("Enter your Haling From :");
		String h=reader.readLine();
	
		System.out.println("Welcome, "+s+"!");
		System.out.println("Age: "+a);
		System.out.println("Gender: "+g);
		System.out.println("Hailing from: "+h);
*/	}

}
