package loops_array;

public class loops {
	public static void main(String[] args){
		for (int i = 0; i < 10; i++){
			if(i == 2) continue;
			if(i > 5) break;
			System.out.println(i);
		}

		String[] cars = {"car1", "car2", "car3"};

		for (String car: cars) {
			System.out.println("foreach "+car);
		}

		for (int i = 0; i < cars.length; i++) {
			System.out.println("for "+ cars[i]);
		}

		int i = 0;
		while(i < cars.length){
			System.out.println("While "+cars[i]);
			i++;
		}


	}
}
