import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> dwarfslist = new ArrayList<String>(
		        Arrays.asList("Happy", "Sleepy", "Dopey", "Bashful", "Sneezy", "Doc", "Grumpy"));
		ArrayList<String> dwarveslist = new ArrayList<String>(
		        Arrays.asList("Thorin", "Balin", "Dwalin", "Fili", "Dori", "Nori", "Ori", "Gloin", "Bofur", "Bombur"));
		System.out.println("The Disney dwarfs are:\n");
		for(String dwarfs:dwarfslist) System.out.println(dwarfs);
		System.out.println("\nThe Tolkien Dwarves are:\n");
		for(String dwarves:dwarveslist)System.out.println(dwarves);
	}

}
