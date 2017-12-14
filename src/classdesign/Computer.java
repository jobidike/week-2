package classdesign;

public class Computer {
	
	//Instance Data  //keep this private its private to this class
	private String make; 
	private String model;
	private double price;
	
	//constructor //at the top
	public Computer(String make, String model, double price) {
		this.make = make;
		this.model = model;
		this.price = price;
}
	//Accessor (getter) method  //return value in class        //to access instance variable in the class
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
	//Setter (offers change)    //not return anything, changing a value in class
	public void setPrice(double price) {  
		this.price = price;   //this current price will be changed to   this. represents comp1
	}
	
	//Method of Behavior
	public String download(boolean isDownloading) {
		if(isDownloading == true) {
			return this.make + " is downloading...";
		}else {
			return this.make + " is available for download.";
		}
	}
	
	
	@Override //override because tostring is already a method we are using
	public String toString() {  //keep to string at the bottom
		return "Make:\t " + make + " \nModel:\t " + model + " \nPrice:\t " + price;

}
	
	
	
}