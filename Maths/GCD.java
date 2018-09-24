
public class GCD {
	public int gcd(int a, int b) {
		if (a < 0 || b < 0)
			return 0;
		if (a == 0 && b == 0)
			return 0;
		if (a == 0 && b != 0)
			return b;
		if (a != 0 && b == 0)
			return a;
		// base case
		if (a == b)
			return a;

		// a is greater
		if (a > b)
			return gcd(a - b, b);
		return gcd(a, b - a);
	}

	public static void main(String[] args) {
		GCD obj = new GCD();
		int res = obj.gcd(1, 0);
		System.out.println(res);
	}
}
