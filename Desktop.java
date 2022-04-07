package week3.day2;

public class Desktop implements Hardware,Software{
	
	public void desktopModels() {
		System.out.println("This is from Desktop Class");
	}

	public static void main(String[] args) {

		Desktop dp = new Desktop();
		dp.hardwareResources();
		dp.softwareResources();
		dp.desktopModels();
	}

	public void softwareResources() {
		System.out.println("This is from Software Interface");
	}

	public void hardwareResources() {
		System.out.println("This is from Hardware Interface");
	}

}
