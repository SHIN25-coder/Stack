package stack;

import java.util.Scanner;
import java.util.Stack;

public class backJoon_4949 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		String result = "";
		
		while(true) {
			//문자열의 균형이 맞아야 한다.
			String s = scanner.nextLine();
			
			if(s.equals(".")) {
				break;
			}
			
			else {
			
				Stack<Character> stack = new Stack<Character>();
				i=0;
				
				while(i<s.length()) {
	
				if(s.charAt(i)=='('||s.charAt(i)=='[') {
					stack.push(s.charAt(i));
				}
				else if(s.charAt(i)==')'){
					if(!stack.isEmpty()&&stack.peek()=='(')
						stack.pop();
					else
						stack.push(s.charAt(i));
				}
				else if(s.charAt(i)==']') {
					if(!stack.isEmpty()&&stack.peek()=='[') 
						stack.pop();
					else
						stack.push(s.charAt(i));
				}
			
				i++;
				}
			
				if(stack.isEmpty()) {
					result+="yes\n";
				}
				else{
					result+="no\n";
				}
			}	
		}
		System.out.println(result);
	}

}
