package uk.ac.belfastmet.biggestbuildings.service;
import java.util.ArrayList;
import uk.ac.belfastmet.biggestbuildings.domain.ByFloorArea;
public class ByFloorAreaService {
	public ByFloorAreaService() {super();}
	 	ArrayList<ByFloorArea> buildingsByFloorArea(){
		 ArrayList<ByFloorArea> byFloorAreaList = new ArrayList<ByFloorArea>();
		//Info
	ByFloorArea bfa1 = new ByFloorArea("New Century Global Center", "China", "Chengdu", "1,760,000", "bfa1.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3435.3960592471117!2d104.06305031512747!3d30.566362981695438!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x36efc666201cdf2f%3A0xa86ba68c629f9c92!2sNew+Century+Global+Center+Parking+Lot!5e0!3m2!1sen!2suk!4v1542975270732\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
	ByFloorArea bfa2 = new ByFloorArea("Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai", "1,713,000", "bfa2.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d57737.98732983961!2d55.32250151709796!3d25.24957922104487!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f5d0693260e69%3A0xe695d4007a48eee9!2sDubai+International+Airport!5e0!3m2!1sen!2suk!4v1542975867258\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
	ByFloorArea bfa3 = new ByFloorArea("Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", "1,575,815", "bfa3.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7428.531656376563!2d39.82136427425476!3d21.418793943153403!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x15c204c82533f16f%3A0xca0cff6480eeca59!2sAbraj+Al+Bait+Mall+(Kingdom+Clock+Tower)!5e0!3m2!1sen!2suk!4v1542976067522\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
	ByFloorArea bfa4 = new ByFloorArea("CentralWorld","Thailand", "Bangkok", "1,024,000", "bfa4.jpg","<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3875.5347097090757!2d100.5371728146704!3d13.746596590350833!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x30e29ecfc2f455e1%3A0xc4ad0280d8906604!2sCentralWorld!5e0!3m2!1sen!2suk!4v1542976162543\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
	ByFloorArea bfa5 = new ByFloorArea("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "990,000", "bfa5.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2442.1793799113148!2d4.780398215696899!3d52.25828757976543!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c5de25f43ac82d%3A0x7e6ba34cf4c92c79!2sVba+bloemenveiling!5e0!3m2!1sen!2suk!4v1542976328989\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
	
	//Array
	byFloorAreaList.add(bfa1);
	byFloorAreaList.add(bfa2);
	byFloorAreaList.add(bfa3);
	byFloorAreaList.add(bfa4);
	byFloorAreaList.add(bfa5);
		return byFloorAreaList;
	}//End of buildingsbyfloorarea
}