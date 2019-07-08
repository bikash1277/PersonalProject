package hackerank;

public class binaryNumber {

	public static void main(String[] args) {
	        int x = 439;
	        int count=0;
	        while (x!=0) 
	        {  
	            x = (x & (x << 1)); 
	            count++; 
	        }
	            System.out.println(count);
	}
}
