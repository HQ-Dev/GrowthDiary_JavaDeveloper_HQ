
public class CD extends Item{
	private String artist;
	private int numOfTracks;
	
	public CD(String title, String artist, String comment, int numOfTracks, int playingTime, boolean gotIt) {
		super(title, comment, playingTime, gotIt);
		this.artist = artist;
		this.numOfTracks = numOfTracks;
	}
	

	public void print() {
		System.out.print("CD:  ");
		super.print();
		System.out.println(". artist: "+artist+ " numOfTracks: "+numOfTracks);
	}

}
