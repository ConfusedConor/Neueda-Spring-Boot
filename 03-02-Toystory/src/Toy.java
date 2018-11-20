
public class Toy {
	public Toy() {super();}
	public Toy(String name, String actFN, String actSN) {
		this.name=name;
		this.actFN=actFN;
		this.actSN=actSN;}
	private String name;
	private String actFN;
	private String actSN;
	
	public String getToyName(){return name;}
	public void setToyName(String name) {this.name=name;}
	
	public String getActorFirstName(){return actFN;}
	public void setActorFirstName(String actFN) {this.actFN=actFN;}
	
	public String getActorSurname(){return actSN;}
	public void setActorSurname(String actSN) {this.actSN=actSN;}
}
