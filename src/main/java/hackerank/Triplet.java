package hackerank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplet {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(17);
		a.add(28);
		a.add(30);

		System.out.println(a);
		List<Integer> b = new ArrayList<Integer>();
		b.add(99);
		b.add(16);
		b.add(31);
		
		System.out.println(b);
		int j=0,k=0;
		List<Integer> res = new ArrayList<Integer>() ;
		
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i)<(b.get(i))) {
				j++;
				
				
			} else if(a.get(i)>b.get(i)){
				k++;
				res.add(k++);
			}
			else {
				}
		}
		System.out.print(j);
		System.out.print(k);
	}
}
