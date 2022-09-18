class Swiggy2{

	public static String takeOrder1(){
	
		//item is reference
		String pastries = "bad";
		String burger =" gud";
		if( burger == pastries){
		System.out.println("thanks for ordering "+pastries );
		}
		
		else 
		{
		System.out.println("Thanks for ordering "+burger);
		}
		return burger;	

	 }

}