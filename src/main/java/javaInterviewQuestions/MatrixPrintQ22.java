package javaInterviewQuestions;

public class MatrixPrintQ22 {

	public static void main(String[] args) {
		int[] numArr= {1,12,12,13,15,16,17,20,20};
		int[] arrDuplicate;
		
		for(int i=0;i<numArr.length-1;i++) {
			for(int j=0;j<numArr.length;j++) {
				if((numArr[i]==numArr[j])&& (i!=j))
				System.out.println(numArr[j]);
			
			}
		}

	}

}
