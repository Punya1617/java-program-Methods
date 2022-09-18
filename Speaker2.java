class Speaker2{

	static String brand;
	static String color;
	static double price;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume = 8;
	static int currentVolume =10;
	
	public static boolean onOrOff()
	
{
	System.out.println("inside onOrOff()");
	if(isConnected == false){       // == declare the value
		isConnected = true;         // = initialize the value
	System.out.println("Speaker is turned onn....");
}
	else if(isConnected == true){
	isConnected = false;
	System.out.println("Speaker is turned off");
	}
	System.out.println("end of onOrOff()");
	return isConnected ;
}

public static void decreaseVolume(){

System.out.println("inside decreaseVolume");

if (isConnected== true){
if(currentVolume > minVolume){
currentVolume =  currentVolume - 1;
System.out.println("the current volume is"+ currentVolume);

} 
else{
	System.out.println("minvolume reached.....");
}}

else{
System.out.println("on speaker first");


}
}
}
