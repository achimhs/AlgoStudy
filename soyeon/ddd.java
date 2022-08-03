package programmers;

import java.util.Stack;

public class ddd {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(5);
		s.push(3);
		s.push(2);
		s.push(1);
		
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		
	}
}
