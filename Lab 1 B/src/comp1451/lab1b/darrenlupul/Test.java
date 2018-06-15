package comp1451.lab1b.darrenlupul;

public class Test {

	public static void main(String[] args) {
	
		
		if (args.length != 4) {
			System.out.println("Improper number of arguments");
			System.exit(0);			
		} else {
			
			Person p = new Person(args[0], args[1], Integer.parseInt(args[2]));
			p.x = Double.parseDouble(args[3]);
			
			System.out.println(p.getFirstName()+" " + p.getLastName()+" "+p.getYearOfBirth()+" "+p.getX());
		}


	}

}
