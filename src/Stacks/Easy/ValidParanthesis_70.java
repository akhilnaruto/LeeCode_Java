package Stacks.Easy;

import java.util.Stack;

/*
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.


 */
public class ValidParanthesis_70 {

	// my solution
	public boolean isValid(String s) {
		Stack<Character> container = new Stack<Character>();
		
		if(s.length() == 0)
			return true;
		
		if(s.length() % 2 != 0)
			return false;
		
		// loop through all the chars and push (, [, { in  to stack first
		for(Character c : s.toCharArray()) {
			if(c.equals('(') || c.equals('[') || c.equals('{'))
				container.push(c);
			
			if(c.equals(')') || c.equals(']') || c.equals('}')){
				if(container.isEmpty())
					return false;
				if(c.equals(')')){
					Character res = container.pop();
					if(res != ('('))
						return false;
				}
				if(c.equals(']')){
					Character res = container.pop();
					if(res != ('['))
						return false;
				}
				if(c.equals('}')){
					Character res = container.pop();
					if(res != ('{'))
						return false;
				}
			}
		}
		return container.isEmpty();

	}
	
	public static void main(String[] args) {
		 boolean result = new ValidParanthesis_70().isValid("){");
		 System.out.println("ValidParanthesis_70.main() " + result);
	}
}

