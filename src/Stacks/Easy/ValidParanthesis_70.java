package Stacks.Easy;

import java.util.HashMap;
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
		HashMap<Character, Character> matchingParanthesis = new HashMap<>();
		matchingParanthesis.put(')', '(');
		matchingParanthesis.put(']', '[');
		matchingParanthesis.put('}', '{');
		
		Stack<Character> container = new Stack<Character>();
		
		if(s.length() == 0)
			return true;
		
		if(s.length() % 2 != 0)
			return false;
		
		for(Character c : s.toCharArray()) {
			// loop through all the chars and push (, [, { in  to stack first
			if(isOneOfOpeningBraces(c))
				container.push(c);
			
			// if we encountered closing bracket, start process the stack 
			if(isOneOfClosingBraces(c)){
				if(container.isEmpty())
					return false;
				
				Character expectedOpeningParanthesis = matchingParanthesis.get(c);
				Character openeningParanthesis = container.pop();
				if(!expectedOpeningParanthesis.equals(openeningParanthesis))
					return false;
			}
		}
		return container.isEmpty();

	}
	
	private boolean isOneOfOpeningBraces(Character c) {
		return c.equals('(') || c.equals('[') || c.equals('{');
	}
	
	private boolean  isOneOfClosingBraces(Character c) {
		return c.equals(')') || c.equals(']') || c.equals('}');
	}
	
	public static void main(String[] args) {
		 boolean result = new ValidParanthesis_70().isValid("){");
		 System.out.println("ValidParanthesis_70.main() " + result);
	}
}

