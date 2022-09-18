class Torch{

	static String brand;
	static String color;
	static double price;
	static boolean isConnected;

	public static boolean onOrOff()  
{
	System.out.println("inside onOrOff()") ;
	if(isConnected == false){       // == declare the value
		isConnected = true;         // = initialize the value
	System.out.println("Torture is turned onn....");
}
   	else if(isConnected == true){
	isConnected = false ; 
	System.out.println("Torture is turned off");
	}
	System.out.println("end of onOrOff()");
	return isConnected ;

}}
