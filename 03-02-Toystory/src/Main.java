import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Insert Toys
		Toy woody = new Toy("Woody", "Tom", "Hanks");
		Toy buzz = new Toy("Buzz", "Tim", "Allen");
		Toy slinky = new Toy("Slinky", "Jim", "Varney");
		Toy ham = new Toy("Hamm", "John", "Ratzenberger");
		Toy rex = new Toy("Rex", "Wallace", "Shawn");
		Toy mrPotatoHead = new Toy("Mr. Potato Head", "Don", "Rickles");
		
		ArrayList<Toy> toys = new ArrayList<Toy>();
		toys.add(woody);
		toys.add(buzz);
		toys.add(slinky);
		toys.add(ham);
		toys.add(rex);
		toys.add(mrPotatoHead);
		
		for(Toy toy:toys)
		System.out.println(toy.getToyName()+" is Played By: "+toy.getActorFirstName()+" "+toy.getActorSurname());
	}

}
