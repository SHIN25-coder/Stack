package backJoon;

import java.util.Scanner;
import java.util.Stack;

public class 단어뒤집기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='>') {
				stack.push(str.charAt(i));
				while(!stack.isEmpty()) {
					result += stack.get(0);
					stack.remove(0);
				}
				stack.clear();	
			}
			else if(str.charAt(i)=='<'&&!stack.isEmpty()) {
				while(!stack.isEmpty()) {
					result += stack.pop();
				}
				stack.push(str.charAt(i));
			}
			else if(str.charAt(i)==' '&&!stack.contains('<')) {
				// 공백
				while(!stack.isEmpty()) {
					result += stack.pop();
				}
				result += ' ';
			}
			else if(i==str.length()-1) {
				stack.push(str.charAt(i));
				while(!stack.isEmpty()) {
					result += stack.pop();
				}
			}
			else{
				stack.push(str.charAt(i));
			}
		}

		System.out.println(result);
	}

}