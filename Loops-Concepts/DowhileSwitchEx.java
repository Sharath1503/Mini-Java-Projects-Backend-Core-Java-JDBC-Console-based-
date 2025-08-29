
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DowhileSwitchEx {
	void add() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A value:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter B value:");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Result = " + (a + b));

	}

	void sub() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A value:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter B value:");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Result = " + (a - b));

	}

	void mul() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A value:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter B value:");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Result = " + (a * b));

	}

	void div() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A value:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter B value:");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Result = " + (a / b));

	}

	void mod() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A value:");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter B value:");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Result = " + (a % b));

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;//
		DowhileSwitchEx br = new DowhileSwitchEx();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulus");
			System.out.println("0 exit");
			System.out.println("\nEnter a Number to perform Operations:");
			n = Integer.parseInt(br1.readLine());
			switch (n) {
			case 1:
				br.add();
				break;
			case 2:
				br.sub();
				break;
			case 3:
				br.mul();
				break;
			case 4:
				br.div();
				break;
			case 5:
				br.mod();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Enter valid Number between 1-5");
			}
		} while (n != 0);
	}
}
