class Customer {
	
	private String name;
	private String code;
	private myDate date;
	
	Customer(String name, String code, int d, int m, int y){
		this.name = name;
		this.code = code;
		this.date = new myDate(d,m,y);
	}
	
	public String toString(){
		return "Name: " + name + " Code: " + code + " " + date.toString();
	}

	String getCode(){
		return code;
	}
	
}
