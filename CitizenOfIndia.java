class CitizenOfIndia{
	
	public static void ShowTheResponsibility(){
		
		int age = 21;
		char gender = 'M';
		if(age >= 10 && age <16)
		{
			System.out.println("Responsibility is school");
			return;
		}
		
		if (age == 16)
		{
			System.out.println("Responsibility is college");
			return;
		}
		
		if(age == 21)
		{
			System.out.println("Responsibility is to vote");
			if(gender == 'M'){
				System.out.println("Girl can leggally marry");
				
			}
			else{
				System.out.println("boy cant leggally marry");
			}
		}
		System.out.println("end of responsibility");
	}
	
	
}