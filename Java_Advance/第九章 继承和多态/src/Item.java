
public class Item {

	private String title;
	private String comment;
	private int playingTime;
	private boolean gotIt = false;
	
	public Item(String title, String comment, int playingTime, boolean gotIt) {
		super();
		this.title = title;
		this.comment = comment;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
	}

	public void print() {
		System.out.print("title: "+title+". comment: "+comment+". playingTime: "
				+playingTime);
	}

	
}
