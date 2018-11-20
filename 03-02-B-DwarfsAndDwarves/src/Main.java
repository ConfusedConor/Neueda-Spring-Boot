import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dwarf sleepy = new Dwarf();
sleepy.setName("Sleepy");
sleepy.setAuthor("Disney");
sleepy.setImage("sleepy.png");

Dwarf happy = new Dwarf();
happy.setName("Happy");
happy.setAuthor("Disney");
happy.setImage("happy.png");

Dwarf dopey = new Dwarf();
dopey.setName("Dopey");
dopey.setAuthor("Disney");
dopey.setImage("dopey.png");

Dwarf bashful = new Dwarf();
bashful.setName("Bashful");
bashful.setAuthor("Disney");
bashful.setImage("bashful.png");

Dwarf sneezy = new Dwarf();
sneezy.setName("Sneezy");
sneezy.setAuthor("Disney");
sneezy.setImage("sneezy.png");

Dwarf grumpy = new Dwarf();
grumpy.setName("Grumpy");
grumpy.setAuthor("Disney");
grumpy.setImage("grumpy.png");

Dwarf doc = new Dwarf();
doc.setName("Doc");
doc.setAuthor("Disney");
doc.setImage("doc.png");;
	
ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
dwarfs.add(sleepy);
dwarfs.add(happy);
dwarfs.add(dopey);
dwarfs.add(bashful);
dwarfs.add(sneezy);
dwarfs.add(grumpy);
dwarfs.add(doc);

for(Dwarf dwarf:dwarfs)
	System.out.println(dwarf.getName());
	}

}
