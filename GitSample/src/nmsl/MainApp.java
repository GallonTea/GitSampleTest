package nmsl;

public class MainApp {
	
	public static void main(String[] args) {
		System.out.print("NMSL");
		Math cMath = new Math();
		System.out.println(cMath.mul(2, 6));
	}

}
class Math{
	int mul(int x, int y) {
		return x * y;
	}		
}