package uk.ac.belfastmet.sbtest.service;
import java.util.ArrayList;
import uk.ac.belfastmet.sbtest.domain.Rocket;
import uk.ac.belfastmet.sbtest.domain.Shrek;
public class SRService {
	public SRService() {
		super();
	}
	public ArrayList<Rocket> getRockets(){
		
		ArrayList<Rocket> rocketslist = new ArrayList<Rocket>();
		// Rocket(name, type, creator, img)
		Rocket bfr = new Rocket("Big Falcon Rocket", "Rocket", "Space X", "bfr.jpg");
		Rocket soyuz = new Rocket ("Soyuz", "Rocket", "Russian Space Programme", "soyuz.jpg");
		Rocket atlas = new Rocket ("Atlas V", "Rocket", "NASA & ULA", "atlas.jpg");
		Rocket shepard = new Rocket ("New Shepard", "Rocket", "Blue Origin", "shepard.jpg");	
		// Add to array
		rocketslist.add(bfr);
		rocketslist.add(soyuz);
		rocketslist.add(atlas);
		rocketslist.add(shepard);
		return rocketslist;
	}
public ArrayList<Shrek> getShrekChars(){
		
		ArrayList<Shrek> shreklist = new ArrayList<Shrek>();
		// Shrek(name, type, creator, img)
		Shrek shrek = new Shrek("Shrek", "Shrek Character", "Dreamworks", "shrek.jpg");
		Shrek fiona = new Shrek("Princess Fiona", "Shrek Character", "Dreamworks","fiona.jpg");
		Shrek donkey = new Shrek("Donkey", "Shrek Character", "Dreamworks", "donkey.jpg");
		Shrek puss = new Shrek("Puss...In Boots!","Shrek Character", "Dreamworks", "puss.jpg");
		// Add to array
		shreklist.add(shrek);
		shreklist.add(fiona);
		shreklist.add(donkey);
		shreklist.add(puss);
		return shreklist;
		
	}
	
}
