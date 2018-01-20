package stack;
import java.util.*;
public class VPS {
	public static boolean isVPS_Stack(String str) {
		
		Stack<String> stack = new Stack<String>();
		
		if(str.length() % 2 != 0)
			return false;
		
		for(int i = 0 ; i < str.length(); i++) {
			String strS = String.valueOf(str.charAt(i));
			if(strS.compareTo("(") == 0)
				stack.push(strS);
			else {
				if(stack.isEmpty())
					return false;
				else
					stack.pop();	
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
//		System.out.print("Enter the number wanted : ");
		int strNum = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < strNum; i++) {
//			System.out.print("Enter the String (" + (i+1) + "/" + strNum + ") : ");
			String test;
			test = scan.nextLine();
			if(test.length() <= 50 && test.length() >= 2) {
				if(isVPS_Stack(test))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
		
	}
}
