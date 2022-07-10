class Mobike
{
	String bikenum, nam;
	int day, charges;

	void input()
	{
	
	System.out.println("Enter number of the bike number");

	bikenum = new java.util.Scanner(System.in).nextLine();
	
	System.out.println("Enter customer name");

	nam = new java.util.Scanner(System.in).nextLine();
	
	System.out.println("Enter number of days");

	day = new java.util.Scanner(System.in).nextInt();
	
	}
	
	void compute()
	{
		
	if(day>1 && day<=5)
	{
	charges=500;
	charges=charges*day;
	}
	if(day>=6 && day<=10)
	{
	charges=400;
	charges=charges*day;
	}
	if(day>=11)
	{
	charges=200;
	charges=charges*day;
	}	
	
	}
	
	void display()
	{
	System.out.println("Bike no."+"\t"+"Customer name"+"\t\t"+"Days"+"\t"+"charge");
	System.out.println();

	System.out.print(bikenum+"\t");
	System.out.print("\t"+nam+"\t");
	System.out.print("\t"+day+"\t");
	System.out.print("\t"+charges+"\t");

	}
	

public static void main(String... ar)
{
	Mobike mb=new Mobike();
	mb.input();
	mb.compute();
	mb.display();

}

}