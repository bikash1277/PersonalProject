package hackerank;

public class repeatedString {

	public static void main(String[] args) {
		String s="acba";
		long n = 1000000000001L;
		StringBuilder str=new StringBuilder();
		long countForSubstring = 0;
        long totalCount = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a')
            {
                countForSubstring++;
            }
        }
        long div=n/s.length();
        System.out.println(div);
        totalCount+=div*countForSubstring;

        System.out.println(totalCount);
        long rem = n % s.length();
        
        for(int i = 0; i < rem; i++)
        {
            if(s.charAt(i) == 'a')
            {
                totalCount++;
            }
        }
        System.out.println(totalCount);
        
        /*
		for(long i=0L;i<n-s.length();i++) {
			str=str.append(s);
		}
		String input=str.substring(0,(int)n);
		System.out.println(input);
		char[] strToChar=input.toCharArray();
		for(long i=0L;i<strToChar.length;i++) {
			if(strToChar[(int) i]=='a') {
				totalCount++;
			}
			else {
				
			}
		}
		System.out.println(totalCount);
*/	}

}
