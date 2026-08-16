class App1 { 

	public static void main (String args[]){	
		
	 	int pin [] [] = {{182,41,202}, {145,85,325}, {195,15,115}, {110,24,407}, {255,11,357}};
	 	
		System.out.println("Y1		Y2		Y3");
		for(int i=0; i<=4; i++){
			System.out.println(pin[i][0]+"		"+pin[i][1]+"		"+pin[i][2]);
		}

		int sum1 =0;
		int sum2 =0;
		int sum3 =0;
		 
		for(int i=0; i<=4; i++){
			sum1 += pin[i][0];
			sum2 += pin[i][1];
			sum3 += pin[i][2];	
		}
		System.out.println("Y1 got: " + sum1 + " votes.");
		System.out.println("Y2 got: " + sum2 + " votes.");
		System.out.println("Y3 got: " + sum3 + " votes.");

		int total = sum1 + sum2 + sum3;

		double p1 = ((double)(sum1*100))/total ;
		double p2 = ((double)(sum2*100))/total ;
		double p3 = ((double)(sum3*100))/total ;

		String s1 = String.format("%.2f",p1);
		String s2 = String.format("%.2f",p2);
		String s3 = String.format("%.2f",p3);

		System.out.println("Candidate Y1 has " + s1 + "% of the total votes.");
		System.out.println("Candidate Y2 has " + s2 + "% of the total votes.");
		System.out.println("Candidate Y3 has " + s3 + "% of the total votes.");

		if (p1>50.0){
			System.out.println("The winner of the elections is: Y1.");
		} else if (p2>50.0){
			System.out.println("The winner of the elections is: Y2.");
		} else if (p3>50.0){
			System.out.println("The winner of the elections is: Y3.");
		}else{
		//----------------------------
			double max1=p1;
			String name1="Y1";
			if(p2>max1){
				max1 = p2;
				name1 = "Y2";
			}
			if (p3>max1){
				max1 = p3;
				name1 = "Y3";
			}
		//---------------------------
			double max2=p1;
			String name2="Y1";

			if(name1=="Y1"){
				if(p2>p3){
					max2 = p2;
					name2 = "Y2";
				}else{
					max2 = p3;
					name2 = "Y3";
				}	
			}else if (name1=="Y2"){
				if(p1>p3){
					max2 = p1;
					name2 = "Y1";
				}else{
					max2 = p3;
					name2 = "Y3";
				}	
			}else if (name1=="Y3"){
				if(p1>p2){
					max2 = p1;
					name2 = "Y1";
				}else{
					max2 = p2;
					name2 = "Y2";
				}
			}

			String m1 = String.format("%.2f",max1);
			String m2 = String.format("%.2f",max2);

			System.out.println("There will be a second round of voting, between the first two candidates:");
			System.out.println("1st candidate: " + name1 + ". Percentage: " + m1 + "% .");
			System.out.println("2nd candidate: " + name2 + ". Percentage: " + m2 + "% .");
		}
   	}	
}