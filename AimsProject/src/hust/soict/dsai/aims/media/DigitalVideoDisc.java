package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

	private static int nbDigitalVideoDiscs = 0;
	
	 public DigitalVideoDisc() {
	        this.id = ++nbDigitalVideoDiscs;
	    }

	    public DigitalVideoDisc(String title) {
	        this();
	        this.title = title;
	    }

	    public DigitalVideoDisc(String title, String category, double cost, String director) {
	        super(++nbDigitalVideoDiscs, title, category, cost, director);
	    }

	    public DigitalVideoDisc(String title, String category, double cost, String director, int length) {
	        super(++nbDigitalVideoDiscs, title, category, cost, director, length);
	    }

	
	@Override
	public void play() {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
	}
}
