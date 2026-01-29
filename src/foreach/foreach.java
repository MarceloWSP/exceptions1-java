package foreach;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vect = new String[] {"Maria","Bob","Alex"};

		for (String element : vect) {
			System.out.println(element);
		}

		for (String obj : vect ) {
			System.out.println(obj);
		}
	}

}
