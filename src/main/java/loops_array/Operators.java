package loops_array;

public class Operators {
	public static void main(String[] args) {
		int num_1 = 5;
		int num_2 = 10;
		int num_3 = 5;
		String str_1 = "aBc Def abc";
		String str_2 = "testing \"sp\" string";
		System.out.println(num_1 + num_2);
		System.out.println(num_1 - num_2);
		System.out.println(num_1 == num_3);
		System.out.println(num_1 == num_2);
		System.out.println(num_1++);
		System.out.println(++num_1);
		System.out.println(str_1.toLowerCase());
		System.out.println(str_1.indexOf('D'));
		System.out.println(str_1.indexOf('a'));
		System.out.println(str_1.lastIndexOf('a'));
		System.out.println(str_1.length());
		System.out.println(str_2);
		if (num_1 < num_2) {
			System.out.println("if");
		} else if (num_1 < num_3) {
			System.out.println("else if");
		} else {
			System.out.println("else");
		}

		int num_4 = 5;

		switch (num_4) {
			case 5:
				System.out.println("case working");
				break;
			default:
				System.out.println("default");
				break;
		}
		// enhanced switch
		switch (num_4) {
			case 5 -> System.out.println("case working");
			default -> System.out.println("default");
		}
	}
}
