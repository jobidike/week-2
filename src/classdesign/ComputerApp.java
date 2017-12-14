package classdesign;      //user input would go into the app class

public class ComputerApp {

	public static void main(String[] args) {
		
		//create an object(instance) of the Computer class
		Computer comp1 = new Computer("Dell","Latitude",600.00);
		
		System.out.println(comp1.getMake());
		System.out.println(comp1.getModel());
		System.out.println(comp1.getPrice());
		
		comp1.setPrice(500.00);
		System.out.println("The new price is " + comp1.getPrice());
		System.out.println(comp1.download(false));

	}

}
