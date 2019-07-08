package hackerank;

public class stairecase {
	public static void main(String[] args) {
		int limit=6;
		/*for (int i = 1; i < limit; i++) { 
            for (int j =limit; j<i; j++) {
            	if(j<limit-i-1)
            	System.out.print(" ");
            	else {
            		System.out.print("#");
            	}
            }
            System.out.println("");
        }*/
		for (int i=0; i<limit; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=limit-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 		
    } 	
}
