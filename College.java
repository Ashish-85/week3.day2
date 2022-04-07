package week3.day2;

public class College extends University {

	public static void main(String[] args) {

		College coll = new College();
		coll.ug();
		coll.pg();
	}

	@Override
	public void ug() {
		System.out.println("This is from unimplemented method");
	}

}
