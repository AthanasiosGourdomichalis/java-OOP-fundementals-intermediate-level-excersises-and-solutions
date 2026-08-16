import java.util.Scanner;

class App6 {

	public static void main (String args[]) {
		
		CustomerList list = new CustomerList();
		Scanner in = new Scanner(System.in);
		
		
		for (;;) {
			System.out.println ("1. Insert Customer");
			System.out.println ("2. Lookup Customer");
			System.out.println ("3. Display List");
			System.out.println ("0. Exit");
			
			int i = Integer.parseInt(in.nextLine());
			
			if( i==1 ){
				System.out.println("Insert New Customer");

				System.out.print("Name: ");
				String name = in.nextLine();

				System.out.print("Code: ");
				String code = in.nextLine();

				System.out.print("Day: ");
				int d = Integer.parseInt(in.nextLine());
				System.out.print("Month: ");
				int m = Integer.parseInt(in.nextLine());
				System.out.print("Year: ");
				int y = Integer.parseInt(in.nextLine());

				Customer newCustomer = new Customer(name, code, d, m, y);
				list.InsertCustomer(newCustomer);



			}else if( i==2 ){

				System.out.println("Lookup Customer");
				System.out.print("Code: ");
				String code = in.nextLine();
				list.LookupCustomer(code);

			}else if( i==3 ){

				list.DisplayList();

			}else {break;}

			

			
		}// for
		
	} //main
	
}//App4
