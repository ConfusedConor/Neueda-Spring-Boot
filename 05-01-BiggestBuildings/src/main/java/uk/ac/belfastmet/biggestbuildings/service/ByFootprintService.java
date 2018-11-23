package uk.ac.belfastmet.biggestbuildings.service;
import java.util.ArrayList;
import uk.ac.belfastmet.biggestbuildings.domain.ByFootprint;
public class ByFootprintService {
	public ByFootprintService() {super();}
	public ArrayList<ByFootprint> buildingsbyfootprint(){
		ArrayList<ByFootprint> byfootprintlist = new ArrayList<ByFootprint>();
		//Info
		ByFootprint bfp1 = new ByFootprint("Aalsmeer Flower Auction Building"," Netherlands","Aalsmeer", "518,000", "740 m x 700 m","The auction building of the flower auction in Aalsmeer.","bfa5.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=\" width=\"100%\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		ByFootprint bfp2 = new ByFootprint("The Dubai Mall","United Arab Emirates","Dubai", "500,000", "", "", "bfp2.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d14440.686065233978!2d55.270743128429956!3d25.197437742335275!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3e5f682829c85c07%3A0xa5eda9fb3c93b69d!2sThe+Dubai+Mall!5e0!3m2!1sen!2suk!4v1542980733939\" width=\"100%\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		ByFootprint bfp3 = new ByFootprint("Tesla Factory", "United States", "Fremont, California", "427,354", "", "Automobile production facility of Tesla Motors.", "bfp3.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12662.574714999906!2d-121.95557853479397!3d37.49273407564271!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808fc7027b4e88bf%3A0x6ad902d97df92303!2sTesla+Fremont+Factory!5e0!3m2!1sen!2suk!4v1542981045625\" width=\"100%\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>" );
		ByFootprint bfp4 = new ByFootprint("Boeing Everett Factory", "United States", "Everett, Washington", "398,000", "900 m x 495 m", "Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.", "bfp4.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2673.5097818615563!2d-122.2742608844687!3d47.92652207920722!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x549001133b2ceee9%3A0x443d19a2005857c8!2sBoeing+Everett+Factory%2C+3003+W+Casino+Rd%2C+Everett%2C+WA+98204%2C+USA!5e0!3m2!1sen!2suk!4v1542981308821\" width=\"100%\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		ByFootprint bfp5 = new ByFootprint("Daikin Texas Technology Park", "United States", "Waller, Texas", "393,000", "", "Factory and distribution center for heating and air conditioning products", "bfp5.jpg", "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3453.593493635633!2d-95.86331228502736!3d30.04851808188095!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8646d2de861ed379%3A0xb685128a4a3f270b!2sDaikin+Texas+Technology+Park!5e0!3m2!1sen!2suk!4v1542981474550\" width=\"100%\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>");
		//Array
		byfootprintlist.add(bfp1);
		byfootprintlist.add(bfp2);
		byfootprintlist.add(bfp3);
		byfootprintlist.add(bfp4);
		byfootprintlist.add(bfp5);
		return byfootprintlist;
	}//End of buildingsbyfootprint
}
