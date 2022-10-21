package Interview;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter value of b : ");
		int b = sc.nextInt();
		System.out.println("Enter the operation (+,-,/,*) : ");
		String op = sc.next();
		int c = 0;
		Calculator obj = new Calculator(a, b);
		switch (op) {
		case "+":
			c = obj.add();
			break;
		case "-":
			c = obj.sub();
			break;
		case "/":
			c = obj.div();
			break;
		case "*":
			c = obj.mul();
			break;
		default : System.out.println("In-valid operation code");
		}
		System.out.println(a + op + b + "=" +c);
	}
}

class Calculator {
	int a, b;

	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int add() {
		return a + b;
	}

	int sub() {
		return a - b;
	}

	int div() {
		return a / b;
	}

	int mul() {
		return a * b;
	}
}
