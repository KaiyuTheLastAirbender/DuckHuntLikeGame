//
//public class GraphicsCard {
//
//	public double price;
//	private String brand;
//	private String model;
//	
//
//	// 1) write the default constructor that sets the values to
//	// $900, "Nvidia". "3060" respectively
//
//	public GraphicsCard() { // defaults do not have parameters
//		price = 900;
//		brand = "Nvidia";
//		model = "3060";
//	}
//
//	// 2) write the non-default constructor that allows setting
//	// the 3 instance variables during construction
//	public GraphicsCard(double inputPrice, String inputBrand, String inputModel) { // defaults do not have parameters
//		// the job of the constructor is to setup the instance variables
//
//		price = inputPrice;
//		brand = inputBrand;
//		model = inputModel;
//	}
//
//	/*override the toString method which will allow passing objects to this type
//	 * to the print and println method
//	 * 
//	 * this method should return a string representation of the object
//	 */
//	public String toString() {
//		
//		String obj = brand+":"+model+":"+"$"+price;
//		return obj; //return the String representation
//	}
//	// ACCESS / GETTERS - Allow access (read) to private instance variables
//	// public returnType getNameOfAttribute(){ return NameOfAttribute;{
//	public double getPrice() {
//		return price; // getter for Price
//	}
//
//	// write the GETTERS for the other 2 instance variables
//	public String getBrand() {
//		return brand;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	// MUTATORS - SETTERS
//	//setters give WRITE access - allows changing values of instance variables
//	public void setPrice( double newPrice ) {
//		price = newPrice; //set the price to the input
//	}
//	public void setModel( double newModel) {
//		model = newModel;
//	}
//	public void setBrand( double newBrand ) {
//		brand = newBrand; //set the price to the input
//	}
//	// all classes can have methods
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		// create a generic GraphicsCard by using the default constructor
//		GraphicsCard test = new GraphicsCard(); // don't use a curly bracket
//		System.out.println(test.getBrand());
//		System.out.println(test.getModel());
//		System.out.println(test.getPrice());
//		
//		//test.price = 500; // this is not possible outside of the class
//		
//		
//		System.out.println(test);
//
//	}
//
//}
