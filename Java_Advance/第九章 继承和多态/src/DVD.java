
public class DVD extends Item {
	private String director;
	
	public DVD(String title, String comment, int playingTime, boolean gotIt, String director) {
		super(title, comment, playingTime, gotIt);
		this.director = director;
	}

	public void print() {
		System.out.print("DVD:  ");
		super.print();
		System.out.println(". director: "+director);
	}

}
