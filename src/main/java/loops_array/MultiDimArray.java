package loops_array;

public class MultiDimArray {
	public static void main(String[] args){
		String [][] multi_arr = {{"cars","trucks"}, {"car1", "truck1"}};

		for (String[] str_arr: multi_arr) {
			for (String str: str_arr) {
				System.out.println(str);
			}
		}
	}
}
