package learn.main;

class triangle {
	public double a, b, c;
	public void triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	private boolean isTriangle() {
		if (a + b > c && b + c > a && c + a > b) return true;
		return false;
	}
	public void solve() {
		if (this.isTriangle()) System.out.println(a + b + c);
		else System.out.println("This is not a triangle");
	}
}