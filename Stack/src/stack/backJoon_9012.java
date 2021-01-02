package stack;

import java.util.Scanner;
import java.util.Stack;

public class backJoon_9012 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String result = "";
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		while(count<num) {
			
			String s = scan.next();
			String[] string = s.split("");
			Stack<String> stack = new Stack<String>(); //½ºÅÃ »ç¿ë
			
			for(int i=0;i<string.length;i++) {
				
				if(string[i].equals("(")) { //???
				
					stack.push(string[i]);
				}
				else {
					
					if(stack.empty()&&string[i].equals(")")) {
						stack.push(string[i]);
						break;
					}
					else {
						stack.pop();
					}
	
				}
			}
			
			if(!stack.empty()) {
				result+="NO\n";
			}
			else {
				result+="YES\n";
			}
			
			count++;
		}
		
		System.out.println(result);
	}

}
