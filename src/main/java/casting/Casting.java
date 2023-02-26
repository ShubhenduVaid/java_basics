package casting;

public class Casting {
	public static void main(String[] args){
		int test_1 = 9;
		// Widening smaller to bigger
		double test_2 = test_1;
		System.out.println(test_2);
		// Narrowing bigger to smaller
		int test_3 = (int) test_2;
		System.out.println(test_3);
	}
}
