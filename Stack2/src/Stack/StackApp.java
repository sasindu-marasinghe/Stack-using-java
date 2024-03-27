
package Stack;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		// stackx s = new stackx(5); //constucctor
		// s.push('a');
		// s.push('b');
		// s.push('c');
		// s.push('d');
		// s.push('e');

		// while(!s.isEmpty()) {
		// System.out.println(s.pop());
		// }

		Scanner scn = new Scanner(System.in);

		System.out.print("enter a expression:");
		String expression = scn.nextLine();

		int len = expression.length();

		stackx s = new stackx(len);
		for (int i = 0; i < len; i++) {
			if (expression.charAt(i) == '(') {
				s.push('(');
			} else if (expression.charAt(i) == ')') {
				if (s.isEmpty()) {
					System.out.println("the statement is not Correctly paranthesized");
					return;
				} else {
					s.pop();
				}
			}
		}
		if (s.isEmpty()) {
			System.out.println("the statement is  Correctly paranthesized");

		} else {
			System.out.println("the statement is not Correctly paranthesized");

		}
	}
}
