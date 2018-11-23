package uk.ac.belfastmet.biggestbuildings.service;
import java.util.ArrayList;
import uk.ac.belfastmet.biggestbuildings.domain.ByVolume;
public class ByVolumeService {
	public ByVolumeService() {super();}
	public ArrayList<ByVolume> buildingsbyvolume(){
		ArrayList<ByVolume> byvolumelist = new ArrayList<ByVolume>();
		//Info
		ByVolume bv1 = new ByVolume("Boeing Everett Factory", "United States", "Everett, Washington", "398,000", "13.3 million", "Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.", "bfp4.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>" );
		ByVolume bv2 = new ByVolume("Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", "356,000", "8 million", "The largest mosque in the world, the most sacred place for the Muslims, and surrounds Islam's holiest place, the Kaaba.", "bv2.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3714.162130923922!2d39.82354601478613!3d21.422871385786216!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204b74d3fb493%3A0x55d1f94f8e094785!2sMasjid+al-Haram!5e0!3m2!1sen!2suk!4v1542981881905\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		ByVolume bv3 = new ByVolume("Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", "122,500", "5.6 million", "The assembly hall of the Airbus A380, the world's largest airliner.", "bv3.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d6870.807374254973!2d1.3654638837925044!3d43.61031751623231!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x12aebaa26ac3b92d%3A0x40766c715295cb69!2sAirbus+France!5e0!3m2!1sen!2suk!4v1542982144752\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		ByVolume bv4 = new ByVolume("Boeing Composite Wing Center", "United States", "Everett, Washington", "111,500", "3.7 million", "Boeing's assembly site for the production of composite wings for the 777-8 and 777-9", "bv4.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		ByVolume bv5 = new ByVolume("Aerium", "Germany", "Halbe, Brandenburg", "70,000", "5.2 million", "A hangar originally intended to house the construction of a giant airship, this building now houses an indoor theme park, called Tropical Islands Resort.", "bv5.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2454.240971861251!2d13.746428315688302!3d52.03892397972596!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47a804edb23f5915%3A0x20148692752fbd91!2sTropical+Islands!5e0!3m2!1sen!2suk!4v1542982492777\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		//Array
		byvolumelist.add(bv1);
		byvolumelist.add(bv2);
		byvolumelist.add(bv3);
		byvolumelist.add(bv4);
		byvolumelist.add(bv5);
		return byvolumelist;
	}//End of buildingsbyvolume
}
