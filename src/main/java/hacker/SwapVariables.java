package hacker;

public class SwapVariables {
	public static void main(String[] args) {
		int x=15;
		int y=10;
		System.out.println(x +" "+y);
		//using 3rd Variable
		int temp;	
		temp=x;
		x=y;
		y=temp;
		System.out.println(x +" "+y);
		//without 3rd variable
		x=x+y; //x=10 y=15
		y=x-y;
		x=x-y;
		
		System.out.println(x+" "+y);
		//swapping string
		String str1="Bikash";
		String str2="Mishra";
		System.out.println("before Swapping::");
		System.out.println("Str1 is :"+str1);
		System.out.println("Str2 is :"+str2);
		
		str1=str1+str2;
		
		str2=str1.substring(0,str1.length()-str2.length());
		System.out.println(str2);
		
		str1=str1.substring(str2.length());
		
		System.out.println(str1);
		
	}
}