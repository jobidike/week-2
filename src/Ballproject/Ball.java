package Ballproject;

//this is model
public class Ball {
	
	//instance data
	private String color;
	private String type;
	
	//constructor
	public Ball (String color, String type) {
		this.color=color;
		this.type=type;
		
	}
	
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	
	//method of behavior
	public String kicked(boolean isKicked) {
		
		if (isKicked) {
			return this.type + "kicked";
	}else {
		return this.type + "thrown"; 
	}
		
		
		
		
		
	}
}



