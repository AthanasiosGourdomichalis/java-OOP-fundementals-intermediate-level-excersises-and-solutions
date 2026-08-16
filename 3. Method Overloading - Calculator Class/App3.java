class Calculator {

    int add(int a, int b){
        return a + b;
    }
	
    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }

    int add(int x[]){
        int sum=0;
        for(int i : x){
            sum += i ;
        }
        return sum;
    }



} // Calculator

class App3 {
	
    public static void main(String[] args) {
		
        Calculator calculator = new Calculator();
		
        System.out.println("Add two integers: " 
									+ calculator.add(3, 7)); 
									
        System.out.println("Add three integers: " 
									+ calculator.add(3, 4, 3));
									
        System.out.println("Add two doubles: " 
									+ calculator.add(9.8, 0.2));
									
        System.out.println("Add array of integers: " 
									+ calculator.add(new int[]{2, 3, 2, 3}));
    }
} // App3
