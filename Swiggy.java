class Swiggy{

	public static String takeOrder(){
	
		//item is reference
		String item ="Pastries";
		if(item == "Pizza"){
		System.out.println("thanks for ordering "+item );
		}
		
		if(item == "Burger"){
		System.out.println("Thanks for ordering "+item);
		}
		
		if(item == "Pastries"){
		System.out.println("Thanks for ordering "+item);
	
		}       return item;	

	 }

}