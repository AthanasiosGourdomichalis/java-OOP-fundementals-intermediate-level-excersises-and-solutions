class CustomerList {
	
	private Customer [] myList = new Customer[50];
	
	private int length = 0;
	
		
	void InsertCustomer(Customer newCustomer){
		if(length<50){
			myList[length] = newCustomer;
			length++;
		}
	}
	
	
	void LookupCustomer(String code) {
		boolean flag = false;
		for(int i=0; i<length; i++){

			if(code.equals(myList[i].getCode())){
				System.out.println(myList[i]);
				flag = true;
				break;
			}
			
		}

		if(flag==false){
			System.out.println("Customer " + code + " not found in list");
		}
		
	}
	
	
	void DisplayList() {
		
		for(int i=0; i<length; i++){
			System.out.println(myList[i]);
		}
	}
			
	
	
}