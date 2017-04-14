import java.util.*;
public class InClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		
		
		System.out.println("Enter three words:");
		String word1= keyboard.next();
		String word2= keyboard.next();
		String word3= keyboard.next();
		
		System.out.println("Concatenated String = " + word1 +
				word2 + word3);
		
		StringBuffer strBuf = new StringBuffer();
		strBuf.append(word1);
		strBuf.append(word2);
		strBuf.append(word3);
		
		System.out.println("StringBuffer = " + strBuf);

	}

}
