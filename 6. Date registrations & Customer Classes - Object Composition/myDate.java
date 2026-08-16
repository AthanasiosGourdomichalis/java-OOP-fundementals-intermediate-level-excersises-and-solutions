class myDate {
	
	private int d;
	private int m;
	private int y;

	myDate(int d,int m,int y){
		this.d = d;
		this.m = m;
		this.y = y;

	}

	public String toString(){
		return "Date: " + d + "/" + m + "/" + y;
	}


}