package return_statement;

public class Calculator {
	int addition(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	void average(int n1, int n2, int n3) {
		Calculator cal = new Calculator();
		int res = cal.addition(n1,n2,n3);
		int avg = res/3;
		System.out.println("Average :"+avg);
	}
}
