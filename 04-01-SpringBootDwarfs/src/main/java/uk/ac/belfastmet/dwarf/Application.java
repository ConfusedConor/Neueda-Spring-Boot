package uk.ac.belfastmet.dwarf;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.dwarf.domain.Dwarf;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	@PostConstruct
//	public void createDwarfs() {
//		ArrayList<Dwarf> dwarfs =new ArrayList<Dwarf>();
//		//Disney Dwarfs
//		Dwarf sleepy = new Dwarf("Sleepy","Disney","sleepy.png");
//		dwarfs.add(sleepy);
//		Dwarf happy = new Dwarf("Happy","Disney","happy.png");
//		dwarfs.add(happy);
//		Dwarf dopey = new Dwarf("Dopey","Disney","dopey.png");
//		dwarfs.add(dopey);
//		Dwarf bashful = new Dwarf("Bashful","Disney","bashful.png");
//		dwarfs.add(bashful);
//		Dwarf sneezy = new Dwarf("Sneezy","Disney","sneezy.png");
//		dwarfs.add(sneezy);
//		Dwarf doc = new Dwarf("Doc","Disney","doc.png");
//		dwarfs.add(doc);
//		Dwarf grumpy = new Dwarf("Grumpy","Disney","grumpy.png");
//		dwarfs.add(grumpy);
//		//Tolkien Dwarves
//		Dwarf thorin = new Dwarf("Thorin", "Tolkien", "thorin.png");
//		dwarfs.add(thorin);
//		Dwarf balin = new Dwarf("Balin", "Tolkien", "balin.png");
//		dwarfs.add(balin);
//		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "dwalin.png");
//		dwarfs.add(dwalin);
//		Dwarf fili = new Dwarf("Fili", "Tolien", "fili.png");
//		dwarfs.add(fili);
//		Dwarf kili = new Dwarf("Kili", "Tolkien","kili.png");
//		dwarfs.add(kili);
//		Dwarf dori = new Dwarf("Dori", "Tolkien", "dori.png");
//		dwarfs.add(dori);
//		Dwarf nori = new Dwarf("Nori", "Tolkien", "nori.png");
//		dwarfs.add(nori);
//		Dwarf ori = new Dwarf("Ori", "Tolkien", "ori.png");
//		dwarfs.add(ori);
//		Dwarf oin = new Dwarf("Oin", "Tolkien","oin.png");
//		dwarfs.add(oin);
//		Dwarf gloin= new Dwarf("Gloin", "Tolkien", "gloin.png");
//		dwarfs.add(gloin);
//		Dwarf bifur= new Dwarf("Bifur", "Tolkien", "bifur.png");
//		dwarfs.add(bifur);
//		Dwarf bofur = new Dwarf("Bofur", "Tolkien", "bofur.png");
//		dwarfs.add(bofur);
//		Dwarf bombur = new Dwarf("Bombur", "Tolkien", "bombur.png");
//		dwarfs.add(bombur);
//	}
}
